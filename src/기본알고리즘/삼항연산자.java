package 기본알고리즘;

import java.util.Scanner;

public class 삼항연산자 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("a의 값 : ");int a=sc.nextInt();
		System.out.println((a>0)?"a는 양수입니다.":"a는 0이거나 음수입니다.");

	}

}
