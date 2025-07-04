package com.ideality.coreflow.security.config;

import com.ideality.coreflow.security.handler.JwtAuthenticationEntryPoint;
import com.ideality.coreflow.security.jwt.JwtAuthenticationFilter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.cors.CorsConfiguration;

import java.util.Arrays;


@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

    private final JwtAuthenticationFilter jwtAuthenticationFilter;
    private final JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
                .csrf(csrf -> csrf.disable())
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .exceptionHandling(exception -> exception.authenticationEntryPoint(jwtAuthenticationEntryPoint)
                )
                .authorizeHttpRequests(authz -> authz
                        .requestMatchers(new AntPathRequestMatcher("/api/admin/**")).hasAuthority("ADMIN")
                        .requestMatchers(new AntPathRequestMatcher("/api/auth/signup")).hasAuthority("ADMIN")
                        .requestMatchers(new AntPathRequestMatcher("/api/health")).permitAll()
                        .requestMatchers(new AntPathRequestMatcher("/api/auth/**")).permitAll()
                        .requestMatchers(new AntPathRequestMatcher("/api/dept/all")).authenticated()
                        .requestMatchers(new AntPathRequestMatcher("/api/projects/**")).permitAll()
                        .requestMatchers(new AntPathRequestMatcher("/api/notifications/stream")).permitAll()
                        .requestMatchers(new AntPathRequestMatcher("/api/notifications/**")).authenticated()
                        .requestMatchers(new AntPathRequestMatcher("/api/tenant/**")).authenticated()
                        .anyRequest().authenticated()
                )
                .cors(cors -> cors
                        .configurationSource(request -> {
                            CorsConfiguration config = new CorsConfiguration();
                            config.setAllowedOrigins(Arrays.asList("http://localhost:5173",
                                    "http://localhost",
                                    "https://core-flow.site",
                                    "https://www.core-flow.site",         // ← ✅ www 붙은 도메인 대응
                                    "https://api.core-flow.site"       // ← 백엔드 API 도메인 자체를 호출하는 경우 (Swagger나 Postman용)
                            ));
                            config.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS"));
                            config.setAllowedHeaders(Arrays.asList("*"));
                            config.setAllowCredentials(true);
                            config.setExposedHeaders(Arrays.asList("Content-Disposition")); // 프로젝트 분석 리포트 파일명 전달 목적
                            return config;
                        })
                )
                .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }

    // Spring에서 제공하는 기본 유저와 비밀번호를 사용하지 않겠다.
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
        return configuration.getAuthenticationManager();
    }
}
