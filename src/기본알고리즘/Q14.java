package 기본알고리즘;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("사각형 출력");
		System.out.print("n의 값 : ");int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
