package 기본알고리즘;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("a의 값 : ");int a=sc.nextInt();
		System.out.println("b의 값 : ");int b=sc.nextInt();
		System.out.println("c의 값 : ");int c=sc.nextInt();
		System.out.println("d의 값 : ");int d=sc.nextInt();
		int max=a;
		if(max<b) max=b;
		if(max<c) max=c;
		if(max<d) max=d;
		System.out.println("최댓값은 "+max+"입니다");

	}

}