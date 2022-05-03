package 기본자료구조;

public class Q4_Q5 {
	//int[] b의 요소를 int[] a에 대입하는 사용자 정의 함수
	static void copy(int[] a,int[] b) {
		for(int i=0;i<b.length;i++) {
			a[i]=b[i];
		}
	}
	//int[] b의 요소를 int[] a에 역순으로 대입하는 사용자 정의 함수
	static void rcopy(int[] a,int[] b) {
		for(int i=0;i<b.length;i++) {
			a[i]=b[b.length-i-1];
		}
	}

	public static void main(String[] args) {
		int[] a=new int[5];
		int[] b= {1,6,7,2,8};
		copy(a,b);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		rcopy(a,b);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
	}
}
