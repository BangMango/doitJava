package �⺻�˰���;

import java.util.Scanner;

public class �߾Ӱ�_���ϱ� {
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
		System.out.println("a�� �� : ");int a=sc.nextInt();
		System.out.println("b�� �� : ");int b=sc.nextInt();
		System.out.println("c�� �� : ");int c=sc.nextInt();
		System.out.println("�߾Ӱ��� "+center(a,b,c)+"�Դϴ�.");

	}

}
