package 기본자료구조;

public class Multi_Demension_Array {
	//다차원 배열 정리
	public static void main(String[] args) {
		//다차원 배열 선언 (왜 대문자만 되지??)
		String[][] Class = new String[4][6];
		//다차원 배열 각 원소에 원소값 대입
		for(int i=0;i<Class.length;i++) {
			for(int j=0;j<Class[i].length;j++) {
				Class[i][j]=(i+1)+"번째 줄 "+(j+1)+"번";
			}
			/* Class[][] 의 형태
			 * [0,0] [1,0] [2,0] [3,0]
			 * [0,1] [1,1] [2,1] [3,1]
			 * [0,2] [1,2] [2,2] [3,2]
			 * ...
			 * [0,5] [1,5] [2,5] [3,5]
			 */
		}
		//다차원 배열 원소 값 출력
		for(int i=0;i<Class.length;i++) {
			for(int j=0;j<Class[i].length;j++) {
				if(j==Class[i].length-1) {
					System.out.println(Class[i][j]+" 번호 끝!");
				}else if(j==0) {
					System.out.print((i+1)+"번 줄 출석확인 시작~~ "+Class[i][j]+" 출석 완료! ");
				}else {
					System.out.print(Class[i][j]+" 출석 완료! ");
				}
			}
		}
	}

}