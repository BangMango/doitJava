package 기본자료구조;

public class ListReverse {

	public static void main(String[] args) {
		int[] lst= {1,2,3,4,5};
		System.out.print("lst[] 원 상태 : ");
		for(int i=0;i<lst.length;i++) {
			
			System.out.print(lst[i]);
		}
		System.out.println();
		for(int i=0;i<lst.length/2;i++) {
			int t=lst[i];
			lst[i]=lst[lst.length-i-1];
			lst[lst.length-i-1]=t;
			System.out.println("lst["+i+"]와 lst["+(lst.length-i-1)+"]의 요소를 서로 교환합니다.");
		}
		System.out.print("lst[] 역순 정렬 완료 후 상태 : ");
		for(int i=0;i<lst.length;i++) {
			
			System.out.print(lst[i]);
		}
	}

}
