package �⺻�ڷᱸ��;

public class ListReverse {

	public static void main(String[] args) {
		int[] lst= {1,2,3,4,5};
		System.out.print("lst[] �� ���� : ");
		for(int i=0;i<lst.length;i++) {
			
			System.out.print(lst[i]);
		}
		System.out.println();
		for(int i=0;i<lst.length/2;i++) {
			int t=lst[i];
			lst[i]=lst[lst.length-i-1];
			lst[lst.length-i-1]=t;
			System.out.println("lst["+i+"]�� lst["+(lst.length-i-1)+"]�� ��Ҹ� ���� ��ȯ�մϴ�.");
		}
		System.out.print("lst[] ���� ���� �Ϸ� �� ���� : ");
		for(int i=0;i<lst.length;i++) {
			
			System.out.print(lst[i]);
		}
	}

}
