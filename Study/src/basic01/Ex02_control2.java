package basic01;

import java.util.Scanner;

public class Ex02_control2 {

	public static void main(String[] args) {
		
		String id = null;
		
		Scanner input = new Scanner (System.in);
		System.out.println("학번을 입력하시오>> "); //2018133001
		id = input.nextLine();
		
		String y = id.substring(0,4); // 입학년도 위치 (앞 네글자)
		int yr = Integer.parseInt(y); // 문자를 숫자로 변환
		
		char major = id.charAt(4); // 소속대학 위치 (5번째 문자)
		
		String cl = null; // 컬리지 (대분류) 
		String mj = null; // 메이저 (소분류)
		
		if(major == '1') {
			cl = "공과대학";
			switch((id.substring(5,7))){ // switch(Integer.parseInt(id.substring(5,7))){
			case "11" : mj = "컴퓨터학과";
			break;
			case "12" : mj = "소프트웨어학과";
			break;
			case "13" : mj = "모바일학과";
			break;
			case "22" : mj = "자바학과";
			break;
			case "33" : mj = "서버학과";
			}
			
		}else if(major == '2') {
			cl = "사회대학";
			switch((id.substring(5,7))){ 
			case "11" : mj = "사회학과";
			break;
			case "12" : mj = "경영학과";
			break;
			case "13" : mj = "경제학과";
			}
			
		}
		
		System.out.println();
		System.out.println(id+" : "+yr+"년도에 입학한 "+cl+" 학생입니다.");
		//
		
	}

}
