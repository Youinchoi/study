package chapter06.EX01;

public class Student {

	
	// 필드 : 킁애스 블락에 선언된 변수 (Heap 영역에 저장됨, 강제 초기화됨) 
	int kor;	// 국어점수
	int eng;	// 영어점수
	int math;	// 수학점수
	
	String name; // 학생이름
	
	
	// 생성자
	Student (){} 	// 기본 생성자, 생략가능
	Student (int kor, int eng, int math, String name){ // 인풋값을 받는 생성자
		this.kor = kor;		// 필드값 : 하늘색 / 지역 변수 : 찐파랑색
		this.eng = eng;		// this라는 키워드는 자신의 필드 값을 뜻함
		this.math = math;
		this.name = name;
	}
	
	
	// 메소드 : 합과 평균을 계산해서 출력 해주는 메소드
	void call () {
		int sum;
		sum = kor + eng + math;
		double avg;
		avg = sum / 3.0;
		System.out.println(name + "의 총 점수는 " + sum + "점 이고, 평균은 " + avg + "점 입니다.");
	}
	
	
	
	
	
}
