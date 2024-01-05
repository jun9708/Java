package test3;
/*
 * 날짜 : 2024.01.04
 * 이름 : 김준형
 * 내용 : 정적변수 연습문제
 */

class Student {
	public static int studentId; //정적변수 -> Student외에 클래스에서 사용하기위해
	private String studentName;
	private String major;
	private int grade;
	
	public Student(String StudentName, String major, int grade) {
		this.studentId++;
		this.studentName = studentName;
		this.major = major;
		this.grade = grade;
	}
	public void studentInfo() {
		System.out.println("=============");
		System.out.println("학번 : " +studentId);
		System.out.println("이름 : " +studentName);
		System.out.println("전공 : " +major);
		System.out.println("학년 : " +grade);
		System.out.println("=============");
	} 
	
	
}


public class Test04 {
	public static void main(String[] args) {
		Student.studentId = 20201000; //Student 클래스로 직접 참조한다는 의미
		
		Student kim = new Student("김유신", "국문과", 1);
		kim.studentInfo();

		Student lee = new Student("이순신", "경제학과", 1);
		kim.studentInfo();
		
		Student lim = new Student("임꺽정", "경영학과", 1);
		kim.studentInfo();
		
	}
}
