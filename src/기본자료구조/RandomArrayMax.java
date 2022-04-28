package 기본자료구조;

import java.util.Random;
import java.util.Scanner;

public class RandomArrayMax {

	public static void main(String[] args) {
		//Random 인스턴스 생성
		//Random 인스턴스는 난수 생성에 주로 사용된다.
		Random rd=new Random();
		Scanner sc=new Scanner(System.in);
		int entryCount=0;
		while(!(entryCount>0&&entryCount<7)) {
			System.out.print("포켓몬 개수 = ");
			entryCount=sc.nextInt();
			if(entryCount>6) {
				System.out.println("6보다 높은 수는 입력할 수 없습니다.");
			}else if(entryCount<0) {
				System.out.println("0보다 낮은 수는 입력할 수 없습니다.");
			}
		}
		int[] entry= new int[entryCount];
		//배열 요소값에 난수 넣기
		// 변수 = RandomInstance.nextInt(n)
		// 난수의 범위는 0~n-1
		for(int i=0;i<entry.length;i++) {
			entry[i]=rd.nextInt(101);
		}
		int max=0;
		int maxNum=0;
		for(int i=0;i<entry.length;i++) {
			System.out.println((i+1)+"번째 포켓몬 레벨 : "+entry[i]);
			if(max<entry[i]) {
				max=entry[i];
				maxNum=i+1;
			}
		}
		System.out.println("포켓몬 레벨의 최대 값은 "+max+"이며, "+maxNum+"번째 포켓몬입니다.");
		sc.close();
	}

}
