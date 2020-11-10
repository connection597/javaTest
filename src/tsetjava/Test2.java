//정수 한 개를 입력받아서, 그 수가 3의 배수인지 판단해보자.
package tsetjava;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		
		String msg = "3의 배수가 아닙니다";
		if(num %3==0) {
			msg = "3의 배수 입니다";
		}
		System.out.println("입력하신 정수는" + msg);
		sc.close();
	}

}
