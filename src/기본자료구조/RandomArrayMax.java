package �⺻�ڷᱸ��;

import java.util.Random;
import java.util.Scanner;

public class RandomArrayMax {

	public static void main(String[] args) {
		//Random �ν��Ͻ� ����
		//Random �ν��Ͻ��� ���� ������ �ַ� ���ȴ�.
		Random rd=new Random();
		Scanner sc=new Scanner(System.in);
		int entryCount=0;
		while(!(entryCount>0&&entryCount<7)) {
			System.out.print("���ϸ� ���� = ");
			entryCount=sc.nextInt();
			if(entryCount>6) {
				System.out.println("6���� ���� ���� �Է��� �� �����ϴ�.");
			}else if(entryCount<0) {
				System.out.println("0���� ���� ���� �Է��� �� �����ϴ�.");
			}
		}
		int[] entry= new int[entryCount];
		//�迭 ��Ұ��� ���� �ֱ�
		// ���� = RandomInstance.nextInt(n)
		// ������ ������ 0~n-1
		for(int i=0;i<entry.length;i++) {
			entry[i]=rd.nextInt(101);
		}
		int max=0;
		int maxNum=0;
		for(int i=0;i<entry.length;i++) {
			System.out.println((i+1)+"��° ���ϸ� ���� : "+entry[i]);
			if(max<entry[i]) {
				max=entry[i];
				maxNum=i+1;
			}
		}
		System.out.println("���ϸ� ������ �ִ� ���� "+max+"�̸�, "+maxNum+"��° ���ϸ��Դϴ�.");
		sc.close();
	}

}
