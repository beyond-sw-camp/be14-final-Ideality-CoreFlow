# 🧭 Core Flow
![image](https://github.com/user-attachments/assets/a7ebb0be-58bb-4c90-8be7-1cdcc02a54d0)

<br>

## 유동성 있는 일정 관리를 위한 ERP 시스템 : Core Flow💡 

🔹 **Core – 핵심을 놓치지 않는 시스템** <br>
   > 프로젝트 기반 기업에서는 핵심 일정과 주요 업무 흐름을 놓치지 않는 것이 중요합니다. <br>
CoreFlow는 복잡한 프로젝트 속에서도 우선순위가 높은 일정, 중요한 프로세스 흐름을 중심에 두고 설계되었습니다.

🔹 **Flow – 유동적인 업무 흐름과 일정** <br>
> 실제 현장에서는 계획된 일정이 그대로 흘러가지 않는 경우가 많습니다. <br>
CoreFlow는 유연하게 바뀌는 일정과 업무 상황에 실시간으로 반응하며 직관적인 흐름(view)으로 업무 변화를 빠르게 파악하고 조정할 수 있게 돕습니다.

<br>

---


## 🎯 CoreFlow는 이런 기업을 위해 설계되었습니다.
> **CoreFlow는 프로젝트 중심 기업을 위한 ERP입니다.** <br>

🔹 프로젝트 중심으로 운영되는 팀 또는 기업 <br>
🔹 팀 간 협업과 일정 조율이 복잡하고 자주 바뀌는 환경 <br>
🔹 Gantt, Pipeline 등 프로세스 시각화를 통해 한눈에 업무 흐름을 보고 싶은 기업 <br>


<br>

---

## ℹ️ 기획 배경 및 서비스 방향성

### 소비자 Pain Point
> "일정을 직관적으로 파악하기 어려워요."
"정보가 여기저기 흩어져 있어요."
"일정 마감 알림이 없어 불편해요."

### 주요 문제점
- 직관성 부족: 뷰는 많지만, 연동되지 않아 전체 흐름 파악이 어려움
- 정보의 분산: 상위 일정에서 하위 일정을 일일이 확인해야 함
-  알림 기능 부재: 일정 지연, 마감, 승인 등 주요 이벤트에 대한 알림 부족
- 높은 진입 장벽: 복잡한 UI와 수동 설정 요구로 사용자 부담 증가


![image](https://github.com/user-attachments/assets/9f8a0f97-cbf4-43f1-94f6-d40255697e55)

![image](https://github.com/user-attachments/assets/07d0a42c-66f4-47e0-9128-56f791e821e9)

### ✅ CoreFlow의 서비스 방향성
- 📅 **직관적인 일정 시각화**  : 간트 차트 + 파이프라인 + 캘린더 통합 제공

- 🧩 **정보 통합**  : 상위 일정에서 하위 일정의 핵심 정보를 한눈에 확인

- 🔔 **알림 시스템**  : 모든 상태 변화에 대해 실시간 알림 제공

- 🧠 **자동화된 흐름**  : 반복 일정, 의존 일정 자동 설정 및 지연 전파

- 📄 **보고서 자동 생성**  : 프로젝트 상태 보고서 PDF 자동화

- 🧰 **템플릿 기능**  : 자주 쓰는 일정/공정을 템플릿으로 재사용 가능

<br>

--- 

## 🚀 프로젝트 이동

CoreFlow는 **프론트엔드**와 **백엔드**가 분리된 구조로 개발되었으며,  
아래 링크를 통해 각 레포지토리 및 실제 배포 사이트에 접근할 수 있습니다.

<br >

#### 🖥️ 프론트엔드 레포지토리 : [GitHub - CoreFlow Frontend](https://github.com/2TEAM-Ideality/be14-final-Ideality-CoreFlow-front)

#### 🛠️ 백엔드 레포지토리 : [GitHub - CoreFlow Backend](https://github.com/2TEAM-Ideality/be14-final-Ideality-CoreFlow-back)

#### 🌐 실제 배포 사이트 : [🔗 core-flow.site](https://core-flow.site)


<br>

---

## 📚 목차


- [프로젝트 개요](#-프로젝트-개요)
- [기획 의도](#-기획-의도)
- [서비스 주요 기능](#-서비스-주요-기능)
- [기술 스택](#-기술-스택)
- [외부 API 및 주요 구현 기술](#-외부-api-및-주요-구현-기술)
- [프로젝트 기획](#-프로젝트-기획)
- [프로젝트 설계](#-프로젝트-설계)
- [팀원별 회고 모음](#-팀원별-회고-모음)

<br>

--- 
 

## 🚀 서비스 주요 기능

### 💬 커뮤니케이션
<details>
<summary>태스크 단위 댓글 및 공지 기능</summary>

- 각 태스크에 직접 댓글을 달아 맥락 속 소통 가능  
- 팀원 간 업무 공유, 피드백, 공지를 하나의 흐름에서 처리

</details>

<details>
<summary>자료 공유 및 검색</summary>

- 댓글 내 파일 첨부 가능  
- 프로젝트 내 자료를 태스크, 프로젝트 단위로 검색 가능

</details>

<details>
<summary>알림 기능</summary>

- 댓글 멘션, 공지, 일정 임박 등 중요 이벤트에 대해 실시간 알림 제공  
- Slack이나 메일 없이도 시스템 내에서 즉시 확인 가능

</details>

### 📅 일정 관리

<details>
<summary>간트차트</summary>

- 전체 프로젝트 일정을 타임라인 기반으로 시각화  
- 프로젝트 일정, 기존 계획 대비 지연 여부를 한눈에 파악

</details>

<details>
<summary>파이프라인</summary>

- 프로젝트 흐름을 태스크 단위로 나열  
- 태스크의 진행상황 및 선후관계를 직관적으로 확인 가능

</details>

<details>
<summary>캘린더</summary>

- 부서별 세부 일정과 개인 일정 동시 확인 가능  
- 달력 형태 UI로 가시성 및 일정 조율 용이

</details>

<details>
<summary>지연 전파 기능</summary>

- 지연 발생 시 후속 태스크 일정 자동 반영  
- 수기 조정 없이 전체 일정 흐름 실시간 관리  
- 일정 리스크 사전 인지 → 납기 준수율 향상  
- 실제 작업 흐름 기반으로 계획-실행 간 격차 최소화

</details>

<details>
<summary>템플릿</summary>

- 반복되는 프로젝트는 템플릿으로 저장  
- 새로운 프로젝트 생성 시 활용 → 반복 작업 최소화  
- 프로젝트 흐름 표준화  
- 재사용성과 일관성 확보 및 업무 속도 향상

</details>



### 📈 성과 가시성 도구
<details>
<summary>KPI 기반 프로젝트 분석 리포트 PDF 제공</summary>
   
  - 프로젝트 결과를 정량  지표 기반으로 자동 분석
  - 진행률, 완료율, 지연일 등 주요 항목 포함
  - 외부 보고 및 조직 아카이빙용 PDF로 자동 저장 및 공유 가능
  - ERP 시스템과 연계 가능한 일정 기반 리포트 허브 기능 수행


</details>


<br>

---
  
## 🛠 기술 스택

### 🧩 Backend
![Spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Spring Security](https://img.shields.io/badge/Spring_Security-6DB33F?style=for-the-badge&logo=springsecurity&logoColor=white)
![Spring Data JPA](https://img.shields.io/badge/Spring_Data_JPA-6DB33F?style=for-the-badge)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=hibernate&logoColor=white)
![JWT](https://img.shields.io/badge/JWT-000000?style=for-the-badge&logo=JSON%20web%20tokens&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white)

### 🎨 Frontend
![Vue.js](https://img.shields.io/badge/Vue.js-4FC08D?style=for-the-badge&logo=vue.js&logoColor=white)
![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black)
![Vuetify](https://img.shields.io/badge/Vuetify-1867C0?style=for-the-badge)
![Vue Router](https://img.shields.io/badge/Vue_Router-4FC08D?style=for-the-badge)
![Pinia](https://img.shields.io/badge/Pinia-FADA5E?style=for-the-badge&logo=pinia&logoColor=black)
![Axios](https://img.shields.io/badge/Axios-5A29E4?style=for-the-badge)

### 🗄 Database / Infra
![MariaDB](https://img.shields.io/badge/MariaDB-003545?style=for-the-badge&logo=mariadb&logoColor=white)
![Redis](https://img.shields.io/badge/Redis-DC382D?style=for-the-badge&logo=redis&logoColor=white)
![AWS](https://img.shields.io/badge/AWS-232F3E?style=for-the-badge&logo=amazonaws&logoColor=white)
![Amazon S3](https://img.shields.io/badge/Amazon_S3-569A31?style=for-the-badge&logo=amazonaws&logoColor=white)

### 🧰 Tools
![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)
![Figma](https://img.shields.io/badge/Figma-F24E1E?style=for-the-badge&logo=figma&logoColor=white)
![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)
![Discord](https://img.shields.io/badge/Discord-5865F2?style=for-the-badge&logo=discord&logoColor=white)

<br>

---

## 🌐 외부 API 및 주요 구현 기술
| 구분 | 기술 / API | 설명 |
|------|------------|------|
| 실시간 알림 | SSE (Server-Sent Events) | 팔로우/게시글 알림 푸시 |
| 인증 | JWT | 사용자 로그인/회원가입 인증 관리 |
| 배포 환경 | AWS | 컨테이너 기반 인프라 관리 |
| 정적 파일 | Amazon S3 | 이미지, 오디오 파일 업로드/호스팅 |


<br>

---

## 🗂 프로젝트 기획
<details>
<summary>프로젝트 기획서</summary>
  <a href="https://github.com/2TEAM-Ideality/be14-final-Ideality-CoreFlow/blob/main/%EC%82%B0%EC%B6%9C%EB%AC%BC/%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8%20%EA%B8%B0%ED%9A%8D%EC%84%9C.pdf">프로젝트 기획서</a>
</details>

<details>
<summary>프로젝트 문서</summary>
  <a href="https://github.com/2TEAM-Ideality/be14-final-Ideality-CoreFlow/wiki/%EB%AC%B8%EC%84%9C">프로젝트 문서</a>
</details>

<br>

---

## 🗂 프로젝트 설계

<details>
<summary>ERD</summary>
  <a href="https://github.com/2TEAM-Ideality/be14-final-Ideality-CoreFlow/wiki/ERD">ERD</a>
</details>

<details>
<summary>화면 설계서</summary>
  <a href="https://github.com/2TEAM-Ideality/be14-final-Ideality-CoreFlow/wiki/%ED%99%94%EB%A9%B4-%EC%84%A4%EA%B3%84%EC%84%9C">ERD</a>
</details>

<details>
  <summary>프로그램 사양서</summary>
  <a href="https://github.com/2TEAM-Ideality/be14-final-Ideality-CoreFlow/wiki/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%A8-%EC%82%AC%EC%96%91%EC%84%9C">프로그램 사양서</a>
</details>

<details>
<summary>🕹️ 시스템 아키텍쳐</summary>
  <a href="https://github.com/2TEAM-Ideality/be14-final-Ideality-CoreFlow/wiki/%EC%8B%9C%EC%8A%A4%ED%85%9C-%EC%95%84%ED%82%A4%ED%85%8D%EC%B2%98">시스템 아키텍쳐
</details>

<details>
<summary>🔄 CI / CD</summary>
  <a href="https://github.com/2TEAM-Ideality/be14-final-Ideality-CoreFlow/wiki/CI-CD">CI / CD 계획서</a>
</details>

<details>
  <summary>단위 테스크 결과서</summary>
  <a href="https://documenter.getpostman.com/view/43225655/2sB2xFgTc9">단위 테스트 결과서</a>
</details>

<br> 

---

## 📝 팀원별 회고 모음

| 이혜영 | 정민선 | 정동한 | 권민수 | 장시원 |
|--------|--------|--------|--------|--------|
| <div align="center"><img src="https://github.com/user-attachments/assets/f589b013-0193-4775-a908-76305427112c" width="180"><br>ISTP</div> | <div align="center"><img src="https://github.com/user-attachments/assets/2a9c8c91-0afa-4fa0-b10c-f4ad94bd9a09" width="180"><br>INFJ</div> | <div align="center"><img src="https://github.com/user-attachments/assets/05d7d9de-3c77-4243-a553-fcfb24abc6e9" width="180"><br>ISTP</div> | <div align="center"><img src="https://github.com/user-attachments/assets/b695d9dc-9885-4731-9c6a-6dde1add62f9" width="180"><br>ISTP</div> | <div align="center"><img src="https://item.kakaocdn.net/do/eda86b27d953e0a1bc89848fff989e65f604e7b0e6900f9ac53a43965300eb9a" width="180"><br>INTJ</div> |


<br>

### 🙋‍♀️ 팀원 이혜영 - @Hailyee

- **이번 프로젝트에서 맡은 역할**
	- UI/UX 설계 (with Figma)
 		- 사용자 흐름과 인터페이스 구조를 설계
		- 와이어프레임 및 인터랙션 프로토타입 제작
		- 사용자 중심의 기능 배치 및 편의성 고려
	-  실시간 알림 기능 구현 (SSE + Scheduler)
  		- Server-Sent Events(SSE) 기반 실시간 알림 시스템 구축
		- 예약된 시간에 자동 알림을 전송하는 스케줄러 기능 구현

	-  세부 일정 기능 개발
		- 프로젝트 → 태스크 → 세부 일정 구조 설계 및 구현
- **잘한 점**
  - 핵심 기능 우선 전략: 중요도 기반으로 기능을 우선순위화하고 일정 내에 주요 기능 완성
  - 원활한 협업 리드: 주간 회의(1~2회, 회당 2시간 이상)를 통해 의견 조율 및 분위기 관리
  - 기능 간 연계성 고려: 계층형 기능 간 데이터 흐름 고려한 설계 및 리팩토링 주도

- **아쉬운 점**
  - 프로젝트 후반에 API 명세서 관리가 다소 미흡
  - 계층형 구조로 인해 기능 통합 시 예상보다 높은 리팩토링 비용 발생

- **배운 점**
  - SSE + 멀티 테넌시: ThreadLocal이 공유되지 않는 SSE 환경에서 TenantContext를 수동 설정하여 사용자 별 알림 처리

  - ERP 시스템 도메인 이해: 현업 용어(예: 기안자) 및 결재 흐름을 반영하며 실무적 도메인 지식 향상

  - 퍼사드 패턴 적용: 복잡한 기능(알림, 결재 등)을 퍼사드 패턴으로 구조화해 일관된 인터페이스 제공 


- **다음 프로젝트에 적용하고 싶은 점**
  - 현재 SSE에서는 브라우저의 보안 제한으로 인해 커스텀 헤더(CORS 포함)를 사용할 수 없어, 토큰을 URL 파라미터로 전송하는 방식으로 처리하고 있다. 이는 보안상 취약할 수 있기 때문에, 다음 프로젝트에서는 리버스 프록시(Nginx 등)를 이용해 쿠키 기반 인증으로 개선하고 싶다.
  - 또한, 단순 스케줄러보다 정밀한 시간 제어가 가능한 Quartz 라이브러리를 활용하여 알림 예약 기능의 정밀도를 높이고자 한다.                                 

---

### 🙋‍♀️ 권민수 - @mins00kwon

- **이번 프로젝트에서 맡은 역할**
  - 발표
  - PM
  - 프로젝트 기능

- **잘한 점**
  -

- **아쉬운 점**
  - 

- **배운 점**
  -  
  
- **다음 프로젝트에 적용하고 싶은 점**
  -   
---

### 🙋‍♀️ 팀원 정동한 - @rainyday1367

- **이번 프로젝트에서 맡은 역할**
  - CI/CD
  - 시스템 아키텍처 구축
  - 댓글 기능 
  - 태스크 기능

- **잘한 점**
  - Github Actions를 활용해 최대한 자동 배포를 수행한 점
  - S3 정적 웹 호스팅과 자바 코드에서 HttpOnly 쿠키를 내린 점
  - 시스템 아키텍처를 직접 만들어 본 점
  - 로그를 통한 에러 체크를 통해 발표 때 사용한 기능들을 쓸 수 있게 한 점

- **아쉬운 점**
  - 캐싱을 도입하여 성능 향상을 시간 안에 하지 못한 점
  - 코드를 작성하는 과정에서 섬세함이 부족했다. (사소한 예외 처리 + 응답에서 빼 먹은 요소들)
  - 배포를 하다 보니 기획에서 많은 의견을 나누지 못한 점

- **배운 점**
  - Facade 패턴에 대한 이해로 코드를 작성하여 여러 가지 도메인을 겹쳐도 서비스 로직을 작성할 수 있던 점 ( 댓글을 작성하면 그 작성한 댓글 작성자 정보로
    알림을 보내게 한 점)
  - 직접 배포를 해보며, 클라우드와 인프라에 대해 다가갈 수 있었던 점

- **다음 프로젝트에 적용하고 싶은 점**
  - 도커와 쿠버네티스를 AWS와 섞어서 배포를 통해 이미지를 통해 어디서든 돌아갈 수 있도록 하며, 자동화를 조금 더 이뤄내고 싶다.

---

### 🙋‍♀️ 장시원 - @swjang7269

- **이번 프로젝트에서 맡은 역할**
  - DB 모델링
  - 스키마 기반 멀티 테넌시 구축
  - 전반적인 백엔드 코드 리팩토링
  - 회원 기능
  - 결재 기능 
 
- **잘한 점**
   - 스키마 기반 멀티테넌시를 구축하여 테넌트 별 독립적으로 데이터를 관리한 점
   - 배포환경을 고려한 axios를 커스텀을 통해 개발 환경과 배포 환경의 괴리를 줄인 점
   - 추후 확장까지 고려하여 DB를 설계한 점
   - 기능 구현 시 예외 상황까지 고려하여 설계해 에러를 최소화한 점
   - 단일 책임의 원칙을 지켜 로그를 추적하여 문제를 빠르게 파악하고 해결할 수 있도록 설계한점 


- **아쉬운 점**
   - 이전 프로젝트의 코드를 재활용 하는 과정에서 낮은 이해도로 기대한 동작을 이끌어내지 못한 점
   - 기능을 구현하는 과정에서 소통이 부족해 서로 요구사항을 다르게 이해한 상태로 기능을 구현한 점
   - 시간에 맞추기 위해 작성한 코드의 경우 유지보수성이 떨어지는 점

 
- **배운 점**
   - CQRS 구조와 Facade 패턴을 적용하며 Facade에 대한 이해가 높아짐
   - 멀티테넌시의 각 유형별 장단점을 이해하고 아키텍쳐 선정 기준에 대하여 배우게 됨. 또한 구현 과정에서 커넥션풀을 다루는 법을 익히게 됨
	   - Transaction내에서 DB 커넥션을 전환할 수 없기에 수동 rollback 구현, security단에서 데이터 소스 연결, new Thread() 사용 등 상황에 맞게 대응
   - 회원 기능을 구현하는 과정에서 jwt 토큰을 다루는 법과 시큐리티에 대한 이해도가 높아짐
	   - 멀티테넌시를 구현한 상황이었기에 api 요청에 따라 테넌트 연결, 토큰 검증 로직 등 다르게 대응하도록 설계

 
- **다음 프로젝트에 적용하고 싶은 점**
   - 유지 보수까지 고려한 구조 설계
   - 일관된 구조를 위한 좀 더 꼼꼼한 PR 검토
   - 누가 구현하더라도 동일한 기능을 수행할 수 있도록 기획서 및 요구사항 등 명세화 - 


---


### 🙋‍♀️ 정민선 - @minsun24

- **이번 프로젝트에서 맡은 역할**
  - 피그마를 활용한 UI/UX 설계 및 프론트엔드 개발
  - 템플릿 기반 워크플로우 생성 기능 구현 (VueFlow 기반)
  - 프로젝트 분석 리포트 PDF 생성 기능 구현 (OpenHTMLtoPDF)
  - API 명세 작성 및 커스텀 예외 응답 구조 정립에 참여

- **잘한 점**
  - 처음 사용하는 라이브러리(VueFlow, PDF 생성 등)를 빠르게 습득하고 실제 기능에 적용함
  - 공통 API 응답 형식(`ApiResponseEntity<T>`) 및 커스텀 예외 처리 구조를 문서화하고 준수
  - 실무에서 실제 필요로 하는 일정 흐름 및 협업 기능을 사용자 관점에서 구조화한 점
  - 사용자 경험을 고려한 UI 흐름, 화면 구성, 피그마 프로토타이핑까지 주도적으로 설계

- **아쉬운 점**
  - 작업량이 많아 일부 화면은 마무리 작업이나 세부적인 UI 다듬기가 조금 부족했던 점
  - 프론트-백 간 인터페이스 정의 초기에 소통이 다소 부족해 중복 작업이 발생했던 점

- **배운 점**
  - VueFlow 기반 워크플로우를 다루며 복잡한 데이터 흐름 구조와 의존성 관리에 대한 이해가 높아짐
  - PDF 생성, 일정 자동화, 지연 전파 등 실무 친화적인 기능 구현 경험
  - 협업 시 API 명세와 상태 관리를 얼마나 세심히 정리해야 하는지 깨달음
  - PDF 생성 기능(OpenHTMLtoPDF)을 구현하면서, 빌드 환경에서의 정적 리소스 처리 방식, 그리고 로컬 개발과 배포 환경 차이를 깊이 이해하게 되었음
     - PDF 폰트 경로 문제로 배포 환경에서 빌드 실패를 겪었고, 이를 ClassPathResource + InputStream 방식으로 해결하며 빌드 환경 내 리소스 처리 방식 이해
     - 실제 배포된 서버에서는 PDF 폰트 파일이 로컬 src 경로를 기준으로 참조되어 빌드 시 에러 발생 → 이를 해결하기 위해 ClassPathResource에서 InputStream으로 폰트를 읽어오는 방식으로 수정
      ```
      try (InputStream fontStream = new ClassPathResource("fonts/NotoSansKR-Regular.ttf").getInputStream()) {
       renderer.getFontResolver().addFont(fontStream, BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
      }   
     ```



- **다음 프로젝트에 적용하고 싶은 점**
  - 초기 설계 단계에서부터 정적 리소스 처리 방식과 배포 환경을 고려한 구조 설계
  - 공통 모듈, 유틸성 처리, 컴포넌트 재사용성 등을 고려한 아키텍처 설계
  - 협업 시 API 문서 및 상태 관리를 문서화하고 공유하는 습관화



 ---

 <br>
 
<div align="center">

🧭 **CoreFlow** - 유동성 있는 일정 관리를 위한 ERP 시스템  
<span></span>  
Made by 💡 Team Ideality

</div>
