# FastCampus
패스트캠퍼스 안드로이드 강의 코드 및 설명 정리 

<br>

# History
- 2023년 3월 8일 [conversionUnit] - 단위변환기 앱 update

<br><br>

# Project
### 1. conversionUnit
- 단위변환기 앱
- 기능 : cm에서 m로, m에서 cm로 변환해주는 앱
- 기술 : Activity LifeCycle, ViewBinding, savedInstanceState

### 2. calculator
- 계산기 앱
- 기능 : 계산 기능 (+, -), clear 기능
- 기술 : ConstaintLayout-Flow, xml에서 onClick

### 3. stopWatch
- 스탑워치 앱
- 기능 : 카운트다운 및 스탑워치 기능, 기록 저장 기능, 카운트 다운 시 소리 출력
- 기술 : timer, ConstaintLayout, ProgressBar, AlertDialog, Thread, runOnUiThread, ToneGenerator, addView

<div width="100%">
  <img src="https://user-images.githubusercontent.com/72954404/225825551-1fe58f80-8b3d-4af0-89f1-f45c16b11571.png" width="200px" align="left"/>
  <img src="https://user-images.githubusercontent.com/72954404/225825557-e97dd7d7-eccd-46e8-a4b5-69c8d65ab029.png" width="200px" align="center"/>
  <img src="https://user-images.githubusercontent.com/72954404/225825555-acd69540-25df-4ec9-ae15-1a1df0965eb0.png" width="200px" align="center" />
</div>

### 4. MyAlbum
- 앨범 앱
- 기능 : 로컬 스토리지에서 사진 리스트 조회 및 불러오기
- 기술 : RecyclerView, ListAdapter (Multiple Item Type), ViewPager2, seald class, data class, Permission, Storage Access Framework, registerForActivityResult
<div width="100%">
  <img src="https://user-images.githubusercontent.com/72954404/227891394-575e2381-226d-4cfe-971d-c40a806b1453.png" width="200px" align="left"/>
  <img src="https://user-images.githubusercontent.com/72954404/227891496-f6b63b56-b5d3-41b5-baa4-9fd238fd261c.png" width="200px" align="center"/>
  <img src="https://user-images.githubusercontent.com/72954404/227891163-d0c063b5-62f7-4e7d-b4fa-eab9638d19b3.png" width="200px" align="center" />
</div>

### 5. MusicPlayer
- 간단한 음악 재생 앱
- 기능 : 음원 재생, Notification으로 음원 컨트롤러 제공 
- 기술 : MediaPlayer, Service, Notification, BroadcastReceiver


### 6. WebToon
- 네이버 웹툰을 WebView로 보는 앱
- 기능 : 웹툰 보기, 마지막으로 본 웹툰으로 이동, 탭 네임 변경
- 기술 : WebView, ViewPager2, SharedPreference, ViewBinding, Interface, AlertDialog
<div width="100%">
  <img src="https://user-images.githubusercontent.com/72954404/229712102-22a79ba0-3c4b-404e-9a8c-78ef94426636.png" width="200px" align="left"/>
  <img src="https://user-images.githubusercontent.com/72954404/229712288-a3ad930e-ee6a-4050-b243-8d85645bc509.png" width="200px" align="center"/>
</div>



### 7. Recorder
- 소리를 녹음하고 재생할 수 있는 앱
- 기능 : 소리 녹음, 재생, 재생 멈춤
- 기술 : CustomView, Canvas, Permission, Enum Class
<div width="100%">
  <img src="https://user-images.githubusercontent.com/72954404/230255782-787149fa-5b40-4c3f-9462-04a3192c65bf.png" width="200px" align="left"/>
  <img src="https://user-images.githubusercontent.com/72954404/230255823-1b97297a-d187-47d2-b1d9-d53cce097dd0.png" width="200px" align="center"/>
 </div>
 
 
 
### 8. GithubInfo
- Github API를 이용해서 Repository 및 사용자 조회
- 기능 : 사용자 이름으로 사용자 조회, Repository 조회, WebView로 Repository로 바로 연결
- 기술 : Retrofit, OkHttp, WebView, DiffUtil, ListAdapter, RecyclerView



### 9. News
- 웹에서 기사들을 크롤링하여 화면에 보여주고, 클릭 시 해당 기사로 연결
- 기능 : 구글 뉴스 웹페이지 크롤링 후 조회
- 기술 : TikXml, Jsoup, Glide, Lottie, Retrofit


### 10. Chat
- 사용자간에 채팅 기능
- 기능 : 로그인 기능, 회원가입 기능, 사용자간에 채팅 기능, 푸시 메시지
- 기술 : Firebase (Real-time database, Authentication, Messaging), OkHttp, RecyclerView, ListAdapter
<div width="100%">
  <img src="https://user-images.githubusercontent.com/72954404/234737184-b45501ab-6081-4d43-8d47-35c840788559.png" width="200px" align="left"/>
  <img src="https://user-images.githubusercontent.com/72954404/234737205-813e1989-ca09-443d-8948-bca1627a15f0.png" width="200px" align="center"/>
  <img src="https://user-images.githubusercontent.com/72954404/234737223-ca974c9c-ccb6-4846-9e7f-9de0fa8ce2eb.png" width="200px" align="center"/>
  <img src="https://user-images.githubusercontent.com/72954404/234737241-e2090b7d-6a74-4375-b410-89ac14cd60fc.png" width="200px" align="center"/>
 </div>
 
 
 
 ### 11. Weather
- 마지막 위치 기록으로 현재 날씨 및 온도 조회
- 기능 : 위치 조회, 위젯 생성 및 업데이트, 공공 API를 이용한 위치 기반 날씨 조회
- 기술 : Service, Foreground Service, Notification, Permission, Retrofit, WidgetProvider, RemoteView
<div width="100%">
  <img src="https://user-images.githubusercontent.com/72954404/235061483-70d0a3bf-ab21-4713-87e8-2cbf53b4f675.png" width="200px" align="left"/>
  <img src="https://user-images.githubusercontent.com/72954404/235061624-6e41c4b7-b71a-4557-8088-0ea29b70fe07.png" width="200px"  align="center"/>
 </div>
 
 
 
 ### 12. GoodRestaurant
- NAVER API를 이용한 맛집 검색
- 기능 : 맛집 검색 기능
- 기술 : NAVER API (검색, map), Retrofit, RecyclerView
<div width="100%">
  <img src="https://user-images.githubusercontent.com/72954404/235103909-32fad6a5-c3e6-4c5c-b8f2-eaa90fed7c0b.png" width="200px" align="left"/>
  <img src="https://user-images.githubusercontent.com/72954404/235103947-d439bd27-4e29-4830-9d5a-928262b8cd98.png" width="200px"  align="center"/>
  <img src="https://user-images.githubusercontent.com/72954404/235103954-a4fa3cf1-3cc2-45f0-82a3-9d6ef8612734.png" width="200px"  align="center"/>
 </div>
 

 
 ### 13. ShareLocation
- 사용자의 지속적인 위치르 업데이트하며, 데이터베이스에 등록된 모든 사용자들의 위치를 지동 나타냄
- 기능 : 위치 조회 및 지도 마커 업데이트, 특정 마커 트래킹, 카카오 계정을 로그인
- 기술 : BottomSheet, Permission, Firebase (Real-time Database, Authentication), Google API ( Maps ), Kakao API ( Login )
<div width="100%">
  <img src="https://user-images.githubusercontent.com/72954404/235841128-3f456707-4481-4a33-a5a6-052bdcb43951.png" width="200px" align="left"/>
  <img src="https://user-images.githubusercontent.com/72954404/235841141-0b1d1fde-2fa8-4bd5-ab77-ed90ea17a4e6.png" width="200px"  align="center"/>
 </div>
 
 
 ### 14. FaceRecognition
- 얼굴을 인식하고 그려주는 앱
- 기능 : 카메라 프리뷰 활성화, 얼굴 인식 모듈 설치, 얼굴 인식 범위 Mask 싀우기, 간단한 요구사항을 통한 상호작용, 인식 진행 사항 출력
- 기술 : Module, CameraXPreview, Permission, Google Vision, CustomView - Paint, Bezier Curves, PathMeasure



### 15. Wallet
- 앱 시작 시 카드 애니메이션을 보여주고 카드를 클릭하면 activity 애니메이션이 일어나는 앱
- 기능 : 앱 시작 시 카드 애니메이션, 카드 상세정보
- 기술 : DataBinding, MotionLayout, RecyclerView, ListAdapter (androidx), ViewHolder

 
