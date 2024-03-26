
public class Ex6_04 {

	public static void main(String[] args) {
		
		String s = new String("Java Programming");
		
		System.out.println("s.length() : " + s.length());
		System.out.println("s.charAt(5) : " + s.charAt(5)); //인덱스 기준 0부터 셈.
		System.out.println("s.subString(6) : " + s.substring(6)); // 6번 째 부터 출력
		System.out.println("s.subString(2,7) : " + s.substring(2,7)); // 2부터 7이전 까지 출력
		System.out.println("s.indexOf('p') : " + s.indexOf('p')); // 소문자 p가 없어서 -1 출력됨.
		System.out.println("s.toLowerCase() : " + s.toLowerCase()); 
		System.out.println("s.toUpperCase() : " + s.toUpperCase());
	}

}
