package chapter09.EX04;

class Student{
	
	static int serialNum = 1000;
	int studentID;	// 학생 고유 ID
	String studentName;	// 학생이름
	int grade;	// 학년 : 기본값 4학년
	String address; // 주소 : 기본값 서울
	
	Student(){	}
	Student(String studentName, int grade, String address){
		this.studentName = studentName;
		this.studentID = serialNum+1;
		this.grade = grade;
		this.address = address;
		serialNum++;
	}
	
	// void print 사용가능 
}


public class Student_Test {

	public static void main(String[] args) {
		// 객체 생성시 자동을 학번이 1씩 커지며 자동으로 저장되어야 함
		// studentID : 1000번부터 학생 객체를 생성할 때마다 고유한 값으로 적용되어 있어야 함
		
		
		Student choi = new Student("최유인",1,"망포");	// 1001
		Student song = new Student("송지원",2,"관악");	// 1002
		Student lee = new Student("이효주",3,"청명");	// 1003
		Student kim = new Student("김예린",4,"영통");	// 1004
		
		System.out.println("이름 : " + choi.studentName + " / 학번 : " + choi.studentID  + " / 학년 : " + choi.grade + " / 주소 : " + choi.address);
		System.out.println("이름 : " + song.studentName + " / 학번 : " + song.studentID  + " / 학년 : " + song.grade + " / 주소 : " + song.address);
		System.out.println("이름 : " + lee.studentName + " / 학번 : " + lee.studentID  + " / 학년 : " + lee.grade + " / 주소 : " + lee.address);
		System.out.println("이름 : " + kim.studentName + " / 학번 : " + kim.studentID  + " / 학년 : " + kim.grade + " / 주소 : " + kim.address);
		
		Student cyi = new Student("최유인",1,"망포");
		
	}

}
