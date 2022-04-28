package 기본자료구조;

import java.util.Scanner;

public class ArrayMax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("배열 값 = ");
		int num=sc.nextInt();
		int[] a=new int[num];
		System.out.println();
		for(int i=0;i<a.length;i++) {
			System.out.print("배열 요소 값 : ");
			a[i]=sc.nextInt();
			System.out.println();
		}
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println("배열 최대 값은 "+max+"입니다.");

	}

}
