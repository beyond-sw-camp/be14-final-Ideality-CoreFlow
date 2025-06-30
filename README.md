# be14-final-Ideality-CoreFlow
| 이혜영 | 정민선 | 정동한 | 권민수 | 장시원 |
|--------|--------|--------|--------|--------|
| <div align="center"><img src="https://github.com/user-attachments/assets/f589b013-0193-4775-a908-76305427112c" width="150"><br>ISTP</div> | <div align="center"><img src="https://github.com/user-attachments/assets/2a9c8c91-0afa-4fa0-b10c-f4ad94bd9a09" width="150"><br>INFJ</div> | <div align="center"><img src="https://github.com/user-attachments/assets/05d7d9de-3c77-4243-a553-fcfb24abc6e9" width="150"><br>ISTP</div> | <div align="center"><img src="https://github.com/user-attachments/assets/b695d9dc-9885-4731-9c6a-6dde1add62f9" width="150"><br>ISTP</div> | <div align="center"><img src="https://item.kakaocdn.net/do/eda86b27d953e0a1bc89848fff989e65f604e7b0e6900f9ac53a43965300eb9a" width="150"><br>INTJ</div> |

<br>


## 📚 목차


#### [📌 프로젝트 개요](#-프로젝트-개요)  <br>
#### [🧠 기획 의도](#-기획-의도)  <br>
#### [🚀 서비스 주요 기능](#-서비스-주요-기능)  <br>
#### [🛠 기술 스택](#-기술-스택)  <br>
#### [🌐 외부 API 및 주요 구현 기술](#-외부-api-및-주요-구현-기술)  <br>
#### [🗂 프로젝트 기획](#-프로젝트-기획)  <br>
#### [🗂 프로젝트 설계](#-프로젝트-설계)  <br>
#### [📝 팀원별 회고 모음](#-팀원별-회고-모음)  <br>



<br><br>

## 📌 프로젝트 개요


![image](https://github.com/user-attachments/assets/fd4c18b1-b4ac-48fd-be56-e764dd593bae)
### CoreFlow 란? 

My Local Diary는 **지도 기반의 소셜 네트워크 서비스(SNS)** 입니다. <br>

사용자는 자신의 일상이나 여행 기록을 글, 사진, 음악 등으로 게시하고, 이를 지도 위의 마커(Marker) 형태로 표시할 수 있습니다. 또한, 다른 사용자의 게시글 역시 지도 상에서 확인 가능하여, 누가 언제 어디에 어떤 경험을 했는지 공간적으로 탐색할 수 있습니다.
이 서비스를 통해 사용자는 단순한 타임라인이 아닌, ‘**지도 위에 나의 일상**’을 시각적으로 기록하고 공유할 수 있으며, 이를 바탕으로 **로컬 중심의 새로운 소셜** 연결을 경험하게 됩니다.


<br><br>

## 🧠 기획 의도
```
지도 위의 나를 기록하고, 공간에서 연결되다
```
### **1. 일상의 소소한 순간을 공간과 함께 기록**
많은 사람들이 사진이나 글로 자신의 일상을 기록하지만, 그 경험이 어디에서 이루어졌는지는 쉽게 잊히곤 합니다.
우리는 장소 기반의 기록을 통해 사용자들이 추억을 보다 생생하게 저장하고 회상할 수 있는 방법을 고민하게 되었습니다.

### **2. 지도 기반 콘텐츠 활용에 대한 관심 증가**
SNS를 중심으로 맛집이나 여행지를 지도에 정리해 공유하는 문화는 이미 널리 확산되어 왔습니다.
사용자들은 구글 맵에 직접 장소를 저장하거나, 별도의 웹 서비스를 활용해 자신만의 장소 기반 콘텐츠를 큐레이션하고 있습니다.
이는 단순한 콘텐츠 소비를 넘어, 장소 중심의 기록과 공유에 대한 수요가 지속적으로 증가하고 있음을 보여줍니다.
My Local Diary는 이러한 흐름을 반영해, 누구나 개인화된 로컬 지도를 만들고 소셜하게 공유할 수 있는 플랫폼을 제공합니다.

### **3. 장소 중심의 새로운 소셜 네트워크**
기존 SNS는 타임라인 중심으로 정보가 쏟아져, 콘텐츠의 맥락과 공간적 의미가 흐려지기 쉽습니다.
우리는 ‘**어디서**’라는 장소의 관점을 중심에 둔 소셜 구조를 통해, 로컬 커뮤니티 간의 연결을 유도하고자 했습니다.

### **4. 지도라는 UI/UX의 직관성과 감성적 몰입**
지도는 시각적으로 풍부한 정보 전달뿐 아니라 공간적 몰입감과 감성적 경험을 제공합니다.
단순한 텍스트나 이미지보다 더 직관적인 방식으로, 사용자가 ‘지도 위의 내 삶’을 시각적으로 경험할 수 있다는 점에서 이 구조는 매우 매력적이었습니다.


<br>


## 🚀 서비스 주요 기능
<details>
<summary>커뮤니케이션</summary>

- 태스크 단위 댓글 및 공지 기능
  - 각 태스크에 직접 댓글을 달아 맥락 속 소통 가능
  - 팀원 간 업무 공유, 피드백, 공지를 하나의 흐름에서 처리

- 자료 공유 및 검색
  - 댓글 내 파일 첨부 가능
  - 프로젝트 내 자료를 태스크, 프로젝트 단위로 검색 가능
- 알림 기능
  - 댓글 멘션, 공지, 일정 임박 등 중요 이벤트에 대해 실시간 알림 제공
  - Slack이나 메일 없이도 시스템 내에서 즉시 확인 가능
</details>

<details>
<summary>일정 관리</summary>

- 간트차트
  - 전체 프로젝트 일정을 타임라인 기반으로 시각화
  - 프로젝트 일정, 기존 계획 대비 지연 여부를 한눈에 파악 

- 파이프라인
  - 프로젝트 흐름을 태스크 단위로 나열
  - 태스크의 진행상황 및 선후관계를 직관적으로 확인 가능

- 캘린더
  - 부서별 세부 일정과 개인 일정 동시 확인 가능
  - 달력 형태 UI로 가시성 및 일정 조율 용이

- 지연 전파 기능
  - 지연 발생 시 후속 태스크 일정 자동 반영
  - 수기 조정 없이 전체 일정 흐름 실시간 관리
  - 일정 리스크 사전 인지 → 납기 준수율 향상
  - 실제 작업 흐름 기반으로 계획-실행 간 격차 최소화

- 템플릿
  - 반복되는 프로젝트는 템플릿으로 저장
  - 새로운 프로젝트 생성 시 활용 → 반복 작업 최소화
  - 프로젝트 흐름 표준화
  - 재사용성과 일관성 확보 및 업무 속도 향상

</details>

<details>
<summary>시각화</summary>

- 결과 분석 리포트 PDF 제공
  - 프로젝트 결과를 정량  지표 기반으로 자동 분석
  - 진행률, 완료율, 지연일 등 주요 항목 포함
  - 외부 보고 및 조직 아카이빙용 PDF로 자동 저장 및 공유 가능
  - ERP 시스템과 연계 가능한 일정 기반 리포트 허브 기능 수행


</details>


<br>
  
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


## 🌐 외부 API 및 주요 구현 기술
| 구분 | 기술 / API | 설명 |
|------|------------|------|
| 실시간 알림 | SSE (Server-Sent Events) | 팔로우/게시글 알림 푸시 |
| 인증 | JWT | 사용자 로그인/회원가입 인증 관리 |
| 배포 환경 | AWS | 컨테이너 기반 인프라 관리 |
| 정적 파일 | Amazon S3 | 이미지, 오디오 파일 업로드/호스팅 |


<br>

## 🗂 프로젝트 기획
<details>
<summary>프로젝트 기획서</summary>
  <a href="https://github.com/2TEAM-Ideality/be14-final-Ideality-CoreFlow/blob/main/%EC%82%B0%EC%B6%9C%EB%AC%BC/%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8%20%EA%B8%B0%ED%9A%8D%EC%84%9C.pdf">프로젝트 기획서</a>
</details>

<details>
<summary>요구사항 명세서</summary>
  <a href="https://github.com/2TEAM-Ideality/be14-final-Ideality-CoreFlow/blob/main/%EC%82%B0%EC%B6%9C%EB%AC%BC/%EC%9D%B4%EC%83%81_Document%20-%20%ED%8C%8C%EC%9D%B4%EB%84%90-%EC%9A%94%EA%B5%AC%EC%82%AC%ED%95%AD%20%EB%AA%85%EC%84%B8%EC%84%9C.pdf">요구사항 명세서</a>
</details>

<details>
<summary>WBS</summary>
  <a href="https://github.com/2TEAM-Ideality/be14-final-Ideality-CoreFlow/blob/main/%EC%82%B0%EC%B6%9C%EB%AC%BC/%EC%9D%B4%EC%83%81_Document%20-%20%ED%8C%8C%EC%9D%B4%EB%84%90-WBS.pdf">WBS</a>
</details>

## 🗂 프로젝트 설계

<details>
<summary>ERD</summary>
  <a href="https://github.com/2TEAM-Ideality/be14-final-Ideality-CoreFlow/blob/main/%EC%82%B0%EC%B6%9C%EB%AC%BC/ERD.png">ERD</a>
</details>

<details>
<summary>화면 설계서</summary>
</details>

<details>
  <summary>프로그램 사양서</summary>
  <a href="https://ohgiraffers.notion.site/API-1ff649136c11819ebb31f39462e4f0f9?pvs=73">프로그램 사양서</a>
</details>

<details>
<summary>🕹️ 시스템 아키텍쳐</summary>
  <a href="https://github.com/2TEAM-Ideality/be14-final-Ideality-CoreFlow/blob/main/%EC%82%B0%EC%B6%9C%EB%AC%BC/core-flow-architecture.drawio_2.png">시스템 아키텍쳐
</details>

<details>
<summary>🔄 CI / CD</summary>
  <a href="https://ohgiraffers.notion.site/CI-CD-21f649136c1180758569e7f7974cfb85?pvs=73">CI / CD 계획서</a>
</details>

<details>
  <summary>단위 테스크 결과서</summary>
  <a href="https://documenter.getpostman.com/view/43225655/2sB2xFgTc9">단위 테스트 결과서</a>
</details>

## 📝 팀원별 회고 모음

### 🙋‍♀️ 팀원 이혜영 - @Hailyee

- **이번 프로젝트에서 맡은 역할**
  - UI 설계
  - 알림(SSE) 이벤트 기능
  - 세부 일정 기능

- **잘한 점**
  -

- **아쉬운 점**
  - 

- **배운 점**
  - 


- **다음 프로젝트에 적용하고 싶은 점**
  -                                  

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
  - 

- **아쉬운 점**
  - 

- **배운 점**
  - 

- **다음 프로젝트에 적용하고 싶은 점**
  - 

---

### 🙋‍♀️ 장시원 - @swjang7269

- **이번 프로젝트에서 맡은 역할**
  - DB 모델링
  - 멀티 테넌시 구축
  - 회원 기능 
  - 결재 기능 
 
- **잘한 점**
  - 

- **아쉬운 점**
  - 
 
- **배운 점**
  - 
 
- **다음 프로젝트에 적용하고 싶은 점**
  - 

---

### 🙋‍♀️ 정민선 - @minsun24

- **이번 프로젝트에서 맡은 역할**
  - UI 설계 및 총괄
  - 템플릿 기능
  - PDF 생성 기능

- **잘한 점**
  - 

- **아쉬운 점**
  - 

- **배운 점**
  - 

- **다음 프로젝트에 적용하고 싶은 점**
  -
 
---
## 프로젝트 이동

[프론트엔드](https://github.com/2TEAM-Ideality/be14-final-Ideality-CoreFlow-front)

[백엔드](https://github.com/2TEAM-Ideality/be14-final-Ideality-CoreFlow-back)
