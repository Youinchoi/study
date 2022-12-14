package b_info.copy;

public class PersonVO {

	private String name;
	private String ed;
	private String tel;
	private String gender;
	private int age;
	private String home;
	
	public PersonVO() {
		// 	기본 생성자
	}
	
	public PersonVO(String name, String ed, String tel, String gender, int age, String home) {
		super();
		this.name = name;
		this.ed = ed;
		this.tel = tel;
		this.gender = gender;
		this.age = age;
		this.home = home;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEd() {
		return ed;
	}
	public void setEd(String ed) {
		this.ed = ed;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}

	@Override
	public String toString() {
		return "PersonVO [name=" + name + ", ed=" + ed + ", tel=" + tel + ", gender=" + gender + ", age=" + age
				+ ", home=" + home + "]\n";
	}
	
	
	
	
	
}
