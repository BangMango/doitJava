package 기본자료구조;

import java.util.Scanner;
//입력받은 10진수를 2진수~36진수로 기수변환
public class CardConvRev {
	//정수값 x를 r진수로 변환하여 배열 dㅇ 아랫자리부터 넣어두고 자릿수 반환
	static int cardConvR(int x,int r, char[] d) {
		int digits=0;//변환수 자릿수
		String dchar="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		do {
			d[digits++]=dchar.charAt(x%r);
			x/=r;
		}while(x!=0);
		return digits;
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no;
		int cd;
		int dno;
		int retry;
		char[] cno=new char[32];
		System.out.println("10진수를 기수 변환합니다.");
		do {
			do {
				System.out.print("변환할 음이 아닌 정수 : ");
				no=sc.nextInt();
			}while(no<0);
			
			do {
				System.out.print("어떤 진수로 변환할 지 입력하시오(2~36) : ");
				cd=sc.nextInt();
			}while(cd<2||cd>36);
			dno=cardConvR(no, cd, cno);
			System.out.println(cd+"진수로 :");
			for(int i=dno-1;i>=0;i--) {
				System.out.print(cno[i]);;
			}
			System.out.println("입니다.");
			System.out.print("한 번 더 할까요? (1.예 / 2.아니오) : ");
			retry=sc.nextInt();
			if(retry==2) {
				System.out.println("시스템을 종료합니다.");
			}else if(retry!=1) {
				System.out.println("옳지 않은 입력값입니다.");
				System.out.print("한 번 더 할까요? (1.예 / 2.아니오) : ");
				retry=sc.nextInt();
			}
		}while(retry==1);
	}
}