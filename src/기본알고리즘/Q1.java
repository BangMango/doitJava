package �⺻�˰���;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("a�� �� : ");int a=sc.nextInt();
		System.out.println("b�� �� : ");int b=sc.nextInt();
		System.out.println("c�� �� : ");int c=sc.nextInt();
		System.out.println("d�� �� : ");int d=sc.nextInt();
		int max=a;
		if(max<b) max=b;
		if(max<c) max=c;
		if(max<d) max=d;
		System.out.println("�ִ��� "+max+"�Դϴ�");

	}

}