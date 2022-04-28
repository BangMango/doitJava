package 기본자료구조;

public class Clone {

	public static void main(String[] args) {
		//Clone method : 배열복사
		int[] a= {1,2,3,4,5};
		// 변수 b는 a 값을 그대로 대입한다.
		int[] b=a.clone();
		
		b[3]=0;
		System.out.print("a =");
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+a[i]);
		}
		System.out.print("\nb =");
		for(int i=0;i<b.length;i++) {
			System.out.print(" "+b[i]);
		}

	}

}