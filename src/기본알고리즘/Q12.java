package 기본알고리즘;

public class Q12 {

	public static void main(String[] args) {
		System.out.println("  |1 2 3 4 5 6 7 8 9");
		System.out.println("--+------------------");
		for(int i=1;i<=9;i++) {
			System.out.print(i+"|");
			for(int j=1;j<=9;j++) {
				if(j==9) {
					System.out.print(j*i+"\n");
				}else {
					System.out.print(j*i+" ");
				}
			}
		}
		

	}

}
