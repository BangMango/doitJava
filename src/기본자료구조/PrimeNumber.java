package �⺻�ڷᱸ��;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber {
	static ArrayList<Integer> carculate(int input){
		ArrayList<Integer> primeList=new ArrayList<>();
		for(int i=2;i<=input-1;i++) {
			if(input%i==0) {
				primeList.add(i);
			}
		}
		
		return primeList;
	}

	public static void main(String[] args) {
		ArrayList<Integer> primeList=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.print("�Ҽ����� �Ǵ��ϰ� ���� ���ڸ� �Է��Ͻÿ� : ");int input=sc.nextInt();
		primeList=carculate(input);
		if(primeList.size()==0) {
			System.out.println(input+"��(��) �Ҽ��Դϴ�.");
		}else {
			System.out.println(input+"��(��) �Ҽ��� �ƴմϴ�.");
			for(int i=0;i<primeList.size();i++) {
				if(i==primeList.size()-1) {
					System.out.print(primeList.get(i));
				}else {
					System.out.print(primeList.get(i)+", ");
				}
			}
			System.out.println("��(��) "+input+"�� ����Դϴ�.");
		}
		sc.close();
	}

}
