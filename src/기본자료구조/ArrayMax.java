package �⺻�ڷᱸ��;

import java.util.Scanner;

public class ArrayMax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("�迭 �� = ");
		int num=sc.nextInt();
		int[] a=new int[num];
		System.out.println();
		for(int i=0;i<a.length;i++) {
			System.out.print("�迭 ��� �� : ");
			a[i]=sc.nextInt();
			System.out.println();
		}
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println("�迭 �ִ� ���� "+max+"�Դϴ�.");

	}

}
