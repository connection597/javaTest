//코리아 초등학교에서 1학년부터 4학년까지 중간고사 시험을 보았다. 
//    4학년은 70점 이상이면 합격, 그 이외의 학년은 60점 이상이면 합격이다. 
//    이를 판단하는 프로그램을 작성해보자.
//    점수가 0미만 100초과이면 경고문구 출력!
package tsetjava;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학년과 점수를 입력 :");
		int grade = sc.nextInt();
		int score = sc.nextInt();
		
		String msg = "잘못 입력하셨습니다";
		if(0<=score && score <=100) {
			if(60<=score) {
				if(grade != 4) { //1~3학년 . 60점 이상
					msg ="합격입니다";
				}else if (score >= 70) { //4학년 . 70점 이상
					msg = "합격 입니다";
				}else { //4학년 . 70점 미만
					msg = "불합격 입니다";
				}
			}else {
				msg = "불합격 입니다";
			}
		}
        System.out.println(msg);
	}

}
