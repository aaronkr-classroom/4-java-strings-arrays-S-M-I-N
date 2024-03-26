
public class Ex5_01 {

	// My Method
	public static void hello(String name) {
		System.out.println("Hello " + name);
	}
	
	public static void main(String[] args) {
		
		hello("Aaron");
		hello("Tom");
		hello("Loki");
		hello("Rocky");
		hello("Socky");
		hello(""); // () 안에 문자열이 있어야 함. 없으면 " "

	}

}
