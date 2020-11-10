// 정수 한 개를 입력받아서, 그 수가 50 이상의 수인지 50미만의 수인지 판단해보자.
package tsetjava;

import java.util.Scanner;

public class TestIF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num =sc.nextInt();
		
		String msg = "50미만입니다";
		if(num>=50) {
			msg ="50이상 입니다";
		}
		System.out.print("입력한 정수는 " + msg);
		sc.close();

	}

}
