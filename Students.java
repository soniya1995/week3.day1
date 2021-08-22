package week3.day1;


public class Students {
	
	public void getStudentInfo(int id) {
		
		System.out.println("id is:"+ id);
		
	}
public void getStudentInfo(int id,String name) {
	
	System.out.println("id and name is:" +id+""+name);
		
	}
public void getStudentInfo(String email,int phoneNumber) {
	System.out.println("email and num is:"+ email +""+ phoneNumber);
	
}

public static void main(String[] args) {
	Students st = new Students();
	
	st.getStudentInfo(123);
	st.getStudentInfo(12,"soni");
	st.getStudentInfo("soni12@gmail.com", 982311230);
}
}
