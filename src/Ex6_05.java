
public class Ex6_05 {

	public static void main(String[] args) {
		// 문자열 비교 연산
		String s1 = "Java";
		String s2 = "Java";
		String s3 = "java";
		
		System.out.println(s1 == s2); // true
		System.out.println(s1 != s2); // false
		System.out.println(s2 == s3); // false -> 대문자, 소문자 구분
		System.out.println(s2 != s3); // true  -> 대문자, 소문자 구분
		
		String s4 = s2.concat(s3); //문자열 결합
		System.out.println(s4);

	}

}
