package 기본알고리즘;

import java.util.Scanner;

public class 중앙값_구하기 {
	public static int center(int a,int b,int c) {
		if(a>=b) {
			if(b>=c) {
				return b;
			}else if(a<=c) {
				return a;
			}else {
				return c;
			}
		}else if(a>c) {
			return a;
		}else if(b>c) {
			return c;
		}else {
			return b;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("a의 값 : ");int a=sc.nextInt();
		System.out.println("b의 값 : ");int b=sc.nextInt();
		System.out.println("c의 값 : ");int c=sc.nextInt();
		System.out.println("중앙값은 "+center(a,b,c)+"입니다.");

	}

}
