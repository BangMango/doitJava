package �⺻�ڷᱸ��;

public class Multi_Demension_Array {
	//������ �迭 ����
	public static void main(String[] args) {
		//������ �迭 ���� (�� �빮�ڸ� ����??)
		String[][] Class = new String[4][6];
		//������ �迭 �� ���ҿ� ���Ұ� ����
		for(int i=0;i<Class.length;i++) {
			for(int j=0;j<Class[i].length;j++) {
				Class[i][j]=(i+1)+"��° �� "+(j+1)+"��";
			}
			/* Class[][] �� ����
			 * [0,0] [1,0] [2,0] [3,0]
			 * [0,1] [1,1] [2,1] [3,1]
			 * [0,2] [1,2] [2,2] [3,2]
			 * ...
			 * [0,5] [1,5] [2,5] [3,5]
			 */
		}
		//������ �迭 ���� �� ���
		for(int i=0;i<Class.length;i++) {
			for(int j=0;j<Class[i].length;j++) {
				if(j==Class[i].length-1) {
					System.out.println(Class[i][j]+" ��ȣ ��!");
				}else if(j==0) {
					System.out.print((i+1)+"�� �� �⼮Ȯ�� ����~~ "+Class[i][j]+" �⼮ �Ϸ�! ");
				}else {
					System.out.print(Class[i][j]+" �⼮ �Ϸ�! ");
				}
			}
		}
	}

}