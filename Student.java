package week3.day1;


public class Student extends Department{
	
		public void studentName() {
			System.out.println("soni");
		}
	public void studentDept() {
		System.out.println("CSE");
		}
	public void studentId() {
		System.out.println("1023");
		
	}

	public static void main(String[] args) {
		
		Student s=new Student();
		s.studentDept();
		s.studentName();
		s.studentId();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.deptName();
		
		
}
}
