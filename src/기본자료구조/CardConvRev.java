package �⺻�ڷᱸ��;

import java.util.Scanner;
//�Է¹��� 10������ 2����~36������ �����ȯ
public class CardConvRev {
	//������ x�� r������ ��ȯ�Ͽ� �迭 d�� �Ʒ��ڸ����� �־�ΰ� �ڸ��� ��ȯ
	static int cardConvR(int x,int r, char[] d) {
		int digits=0;//��ȯ�� �ڸ���
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
		System.out.println("10������ ��� ��ȯ�մϴ�.");
		do {
			do {
				System.out.print("��ȯ�� ���� �ƴ� ���� : ");
				no=sc.nextInt();
			}while(no<0);
			
			do {
				System.out.print("� ������ ��ȯ�� �� �Է��Ͻÿ�(2~36) : ");
				cd=sc.nextInt();
			}while(cd<2||cd>36);
			dno=cardConvR(no, cd, cno);
			System.out.println(cd+"������ :");
			for(int i=dno-1;i>=0;i--) {
				System.out.print(cno[i]);;
			}
			System.out.println("�Դϴ�.");
			System.out.print("�� �� �� �ұ��? (1.�� / 2.�ƴϿ�) : ");
			retry=sc.nextInt();
			if(retry==2) {
				System.out.println("�ý����� �����մϴ�.");
			}else if(retry!=1) {
				System.out.println("���� ���� �Է°��Դϴ�.");
				System.out.print("�� �� �� �ұ��? (1.�� / 2.�ƴϿ�) : ");
				retry=sc.nextInt();
			}
		}while(retry==1);
	}
}