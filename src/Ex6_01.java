import java.util.Scanner;

public class Ex6_01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String[] myArray = new String[3]; // 0,1,2  총 3개
		
		System.out.println("3개 문자열 입력하세요: ");
		
		// 사용자에게 값 입력 받기
		for(int i =0; i < 3; i++) {
			myArray[i] = s.nextLine();
		}
		
		// 배열 값 출력하기
		for(int i =0; i < 3; i++) {
			System.out.print(myArray[i]+ " ");
		}
	}

}
