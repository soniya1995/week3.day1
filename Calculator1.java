package week3.day1;

public class Calculator1 {
	
	public void add(int num1,int num2) {
		int sum = num1+num2;
		System.out.println(sum);
	}
	
		
		public void add(int num1,int num2,int num3) {
			int sum = num1+num2+num3;
			System.out.println(sum);
		}
	
	public void mul(int num1,int num2) {
		int mul = num1*num2;
		System.out.println(mul);
	}
	
		
	
	public void mul(int num1,double num2) {
	   double mul = num1*num2;
		System.out.println(mul);
	}
	public void sub(int num1,int num2) {
		int sub = num1-num2;
		System.out.println(sub);
	}
	
		
	
	public void sub(double num1,double num2) {
		double sub = num1-num2;
		System.out.println(sub);
	}
	
	public void div(int num1,int num2) {
		int div = num1/num2;
		System.out.println(div);
	}
	
		
	
	public void div(double num1,int num2) {
		double div = num1/num2;
		System.out.println(div);
	}
	
	public static void main(String[] args) {
		Calculator1 calc =new Calculator1();
		calc.add(2, 3);
		calc.add(1, 3, 4);
		calc.sub(1, 2);
		calc.sub(1234, 5);
		calc.div(10, 5);
		calc.div(1000, 2);
		calc.mul(3, 4);
		calc.mul(32224, 2);
	}
	
	
	
	
	
	
	
	

}
