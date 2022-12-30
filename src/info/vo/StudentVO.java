package info.vo;
//VO : Value Object
//학생의 정보(이름, 학번, 학년, 전공, 전화번호)를 저장하는 클래스

public class StudentVO {
	
	//멤버변수
	private String name;
	private int stuld;
	private int grade;
	private String major;
	private String moblie;
	
	//생성자 : 필드 값 초기화
	public StudentVO(String name, int stuld, int grade, String major, String moblie) {
		this.name = name;
		this.stuld = stuld;
		this.grade = grade;
		this.major = major;
		this.moblie = moblie;
	}
	
	//setter : 필드 값 설정 | getter : 필드 값 반환
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStuld() {
		return stuld;
	}
	public void setStuld(int stuld) {
		this.stuld = stuld;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getMoblie() {
		return moblie;
	}
	public void setMoblie(String moblie) {
		this.moblie = moblie;
	}

	//to String
	@Override
	public String toString() {
		return "StudentVO [name=" + name + ", stuld=" + stuld + ", grade=" + grade + ", major=" + major + ", moblie="
				+ moblie + "]";
	}

}
