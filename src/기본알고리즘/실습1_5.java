package 기본알고리즘;

import java.util.Scanner;

public class 실습1_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("n : ");int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println("1부터 n까지의 합은 "+sum);

	}

}
