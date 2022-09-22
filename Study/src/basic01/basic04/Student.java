package basic04;

public class Student {

	private String studentID;
	private String name;
	private int kor, eng, math;
	private int total;
	private double avg;
	
	public Student() {
		// 기본생성자를 꼭 만들고 시작하자 
//		this.name = "홍홍이";
//		this.kor = 50;
//		this.eng = 40;
//		this.math = 30;
		this("이름없음", 50,20,30); // 무조건 첫번쨰 라인에 기술해야 함
		System.out.println("기본 생성자");
	}
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.eng = eng;
		this.math = math;
		System.out.println("인자있는 생성자");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public void calTotal() {
		total = kor + eng + math;
	}
	public void calAvg() {
		avg = total/3;
	}
	public void output() {
		System.out.println(name + " / 성적 총점 : " + total + " / 평균 : " + avg);
	}
	
	/* 캡슐화 
	 * 		- 멤버변수 (field) : private
	 *      - 멤버매소드 : public
	 * 
	 */
	
	
}
