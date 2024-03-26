
public class Ex5_02 {
	//반환값
	public static double add(double a, double b) {return a + b;} //void가 아니라 return 값 필요.

	public static double sub(double a, double b) {return a - b;}
		
	public static double mult(double a, double b) {return a * b;}
			
	public static double div(double a, double b) {return a / b;}
	
	
	public static double max(double a, double b) {
		if (a > b) return a;
		else return b;
	}
	public static double min(double a, double b) {
		if (a > b) return b;
		else return a;
	}

	// Factorial
	public static void factorial (int a) {
		int result = 1;
		for(int i = 1; i <= a; i++) {
			result *= i;
		}
		System.out.println("Factorial of " + a + "! " + result);
	}
	
	//Circle, Area
	public static void circ(int a) {
		String result = "Pizza circ : " + a * a * 3.1415792 + "inches";
		System.out.println(result);
	}

	public static void circ(double a) {
		String result = "Pizza circ : " + 2 * a * 3.1415792 + "inches";	
		System.out.println(result);
	}
	
	public static void area(int a) {
		String result = "Pizza area : " + a * a * 3.1415792 + "inches";
		System.out.println(result);
	}
	public static void area(double a) {
		String result = "Pizza area : " + a * a * 3.1415792 + "inches";
		System.out.println(result);
	}
	
	
	
	public static void main(String[] args) {
		
		int a =15;
		int b = 7;
		
		factorial(a);
		factorial(b);
		
		
		
		System.out.println("Calculator Program: ");
		System.out.println("add : " + a + " + " + b + " = " + add(a,b));
		System.out.println("sub : " + a + " - " + b + " = " + sub(a,b));
		System.out.println("mult : " + a + " X " + b + " = " + mult(a,b));
		System.out.println("div : " + a + " / " + b + " = " + div(a,b));
		
		System.out.println("더 큰 수 : " + max(a,b));
		System.out.println("더 작은 수 : " + min(a,b));
		
		//Circle, area (pizza) 계산
		circ(a);
		area(a);
		
		circ(12); //int 매개변수
		circ(1.23456); // double 매개변수
		
		area(13);
		area(12.34);
		
		float c = 12.345f;
		circ(c);

	}

}
