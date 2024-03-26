import java.util.Scanner;

public class Ex6_02 {

	public static void main(String[] args) {
		
		int[] myNums = new int[10];
		
		// 배열 채우기
		for(int i=0; i < myNums.length; i++) {
			myNums[i] = i * i;
		}
		
		for(int i=0; i < myNums.length; i++) {
			System.out.println(i + "X" + i + "="+ myNums[i]);
		}

	}

}
