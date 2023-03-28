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