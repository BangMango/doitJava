package 기본자료구조;

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
		System.out.print("소수인지 판단하고 싶은 숫자를 입력하시오 : ");int input=sc.nextInt();
		primeList=carculate(input);
		if(primeList.size()==0) {
			System.out.println(input+"은(는) 소수입니다.");
		}else {
			System.out.println(input+"은(는) 소수가 아닙니다.");
			for(int i=0;i<primeList.size();i++) {
				if(i==primeList.size()-1) {
					System.out.print(primeList.get(i));
				}else {
					System.out.print(primeList.get(i)+", ");
				}
			}
			System.out.println("이(가) "+input+"의 약수입니다.");
		}
		sc.close();
	}

}
