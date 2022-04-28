package 기본알고리즘;

import java.util.Scanner;

public class Q17 {
	public static void spiraNum(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int j=(i-1)*2+1;j>=1;j--) {
				System.out.print(i);
			}
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		spiraNum(9);
	}

}
