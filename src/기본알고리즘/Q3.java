package �⺻�˰���;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("a�� �� : ");int a=sc.nextInt();
		System.out.println("b�� �� : ");int b=sc.nextInt();
		System.out.println("c�� �� : ");int c=sc.nextInt();
		System.out.println("d�� �� : ");int d=sc.nextInt();
		int min=a;
		if(min>b) min=b;
		if(min>c) min=c;
		if(min>d) min=d;
		System.out.println("�ּҰ��� "+min+"�Դϴ�.");
	}
}