package 기본알고리즘;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("a의 값 : ");int a=sc.nextInt();
		System.out.println("b의 값 : ");int b=sc.nextInt();
		System.out.println("c의 값 : ");int c=sc.nextInt();
		System.out.println("d의 값 : ");int d=sc.nextInt();
		int min=a;
		if(min>b) min=b;
		if(min>c) min=c;
		if(min>d) min=d;
		System.out.println("최소값은 "+min+"입니다.");
	}
}