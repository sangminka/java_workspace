package ex01;

public class StudentMainTest {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		Student student2 = new Student();
		
		student1.age = 19;
		student1.schoolName = "Java 남자 고등학교";
		student1.studentName = "김철수";
		student2.age = 17;
		student2.schoolName = "Java 여자 고등학교";
		student2.studentName = "김영희";
		
		student1.showInfo();
		student2.showInfo();

	}

}
