package 기본알고리즘;

public class Q15 {
	public static void triangleLB(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void triangleLU(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void triangleRU(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void triangleRB(int n) {
		for(int i=1;i<n;i++) {
			for(int j=n-1;j>=0;j--) {
				if(i<j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		triangleLB(5);
		triangleLU(5);
		triangleRU(5);
		triangleRB(5);

	}

}
