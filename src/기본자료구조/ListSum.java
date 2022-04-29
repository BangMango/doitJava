package 기본자료구조;

public class ListSum {

	public static void main(String[] args) {
		int[] lst= {1,4,2,8,5};
		int value=0;
		for(int i=0;i<lst.length;i++) {
			value+=lst[i];
		}
		System.out.println("lst[]의 모든 요소 합 : "+value);
	}
}