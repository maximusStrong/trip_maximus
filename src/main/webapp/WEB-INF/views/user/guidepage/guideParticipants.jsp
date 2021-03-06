<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TRIPFUL AXEL - 여행에 가속을</title>


<link rel="shortcut icon" href="${pageContext.servletContext.contextPath }/resources/images/common/airplane.png">
<link rel="stylesheet" href="https://www.travelmaker.co.kr/js/font-awesome/css/font-awesome.min.css">
    <script src="https://www.travelmaker.co.kr/js/modernizr.custom.70111.js"></script>
	<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
	<link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.css"/>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/Swiper/4.5.0/css/swiper.min.css">

    <link rel="stylesheet" href="https://www.travelmaker.co.kr/css/html/main.css?ver=20210620">
    <link rel="stylesheet" href="https://www.travelmaker.co.kr/css/html/common.css?ver=20210620">
    <link rel="stylesheet" href="https://www.travelmaker.co.kr/css/html/style.css?ver=20210620">
<!-- <script type="text/javascript" src=".\joon_script.js"></script> -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/user/css/mypage/joonho_new.css">
    <style>
        #detail thead th {
            border-top: 3px solid rgba(0, 0, 0, 78);
            text-align: center;

        }

        #detail tbody th {
            text-align: center;
        }

        /* #detail_content thead { width: 50%; height: 70px;} */
    </style>
</head>
<body>
	<jsp:include page="../common/header.jsp"/>
	
	<div id="wrapp">
        <div id="tabwrap">
        <div style="width: 90% ; margin : 0 auto;"><h2 style="display: block;
            font-size: 1.5em;
            margin-block-start: 0.83em;
            margin-block-end: 0.83em;
            margin-inline-start: 0px;
            margin-inline-end: 0px;
            font-weight: bold; margin-left: 1rem;">가이드 마이페이지</h2></div>
            <br>
            <br>
            <div class="tabList">
                <div class="tabb"><a class="pic1" href="${pageContext.request.contextPath}/user/guidepage/guideGoods">내 여행상품</a></div>
                <div class="tabb"><a class="pic4" href="${pageContext.request.contextPath}/user/guidepage/guideContact">문의관리</a></div>
                <div class="tabb"><a class="pic5" href="${pageContext.request.contextPath}/user/guidepage/guideReview">후기관리</a></div>
            </div>
        </div>

        <div id="detail_content">
            <div id="detail">
                <table align="center" style="border-collapse: collapse; margin:0 auto;">
                    <!-- <div class="line" style="border: 1px solid black;"></div> -->
                    <thead>
                        <tr>
                            <th>여행제목</th>
                            <th>신청일자</th>
                            <th>인원현황</th>
                            <th>진행상태</th>
                        </tr>
                    </thead>
                    <tbody style="padding-top: 20px;">
                        <tr>
                            <td>제주도 항아리 투어</td>
                            <td>2021/03/15</td>
                            <td>4/4</td>
                            <td>여행완료</td>
                        </tr>
                        <tr>
                        	<td colspan="4">
                        		<div class="card w-100" style="border: none; padding: 20px;">
                        <div class="card-body">
                            <h5 class="card-title" style="text-align: center;">인원 보기</h5>
                            <div id="tableWrap" style="width: 60%; height: auto; padding: 10px; margin: 0 auto;">
                                <table align="center" style="border-collapse: collapse; margin: 0 auto;">
                                    <thead>
                                        <tr style="background: none;">
                                            <th>신청자 이름</th>
                                            <th>성별</th>
                                            <th>전화번호</th>
                                            <th>생년월일</th>
                                        </tr>
                                    </thead>
                                    <tbody style="margin-top: 20px;">
                                        <tr>
                                            <td>홍길동</td>
                                            <td>남자</td>
                                            <td>010-1234-5678</td>
                                            <td>1995/03/27</td>
                                        </tr>
                                        <tr>
                                            <td>홍길동</td>
                                            <td>남자</td>
                                            <td>010-1234-5678</td>
                                            <td>1995/03/27</td>
                                        </tr>
                                        <tr>
                                            <td>홍길동</td>
                                            <td>남자</td>
                                            <td>010-1234-5678</td>
                                            <td>1995/03/27</td>
                                        </tr>
                                        <tr>
                                            <td>홍길동</td>
                                            <td>남자</td>
                                            <td>010-1234-5678</td>
                                            <td>1995/03/27</td>
                                        </tr>
                                    </tbody>
        
                                </table>
                            </div>
                        </div>
                    </div>
                        	</td>
                        </tr>
                        <tr>
                            <td>제주도 가자미 투어</td>
                            <td>2021/05/25</td>
                            <td>5/6</td>
                            <td>여행완료</td>
                        </tr>
                        <tr>
                            <td>제주도 갈치 투어</td>
                            <td>2021/06/14</td>
                            <td>2/3</td>
                            <td>여행완료</td>
                        </tr>
                        <tr>
                            <td>둘레길 가자</td>
                            <td>2021/07/14</td>
                            <td>1/5</td>
                            <td>모집중</td>
                        </tr>
                        <tr>
                            <td>둘레길 가자</td>
                            <td>2021/07/14</td>
                            <td>1/5</td>
                            <td>모집중</td>
                        </tr>
                        <tr>
                            <td>둘레길 가자</td>
                            <td>2021/07/14</td>
                            <td>1/5</td>
                            <td>모집중</td>
                        </tr>
                        <tr>
                            <td>둘레길 가자</td>
                            <td>2021/07/14</td>
                            <td>1/5</td>
                            <td>모집중</td>
                        </tr>
                        <tr>
                            <td>둘레길 가자</td>
                            <td>2021/07/14</td>
                            <td>1/5</td>
                            <td>모집중</td>
                        </tr>
                    </tbody>

                </table>

            </div>
        </div>
        </div>
        
        <div class="clearbothsite" style="clear:both; width:1px; height: 1px; margin-top: 50px;" ></div>
	<jsp:include page="../common/footer.jsp"/>
</body>
</html>