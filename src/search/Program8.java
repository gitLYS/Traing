package search;

public class Program8 {

	public static void main(String[] args) {
		/*��Ŀ����s=a+aa+aaa+aaaa+aa...a��ֵ������a��һ�����֡�����2+22+222+2222+22222(��ʱ����5�������)������������м��̿��ơ�
				1.����������ؼ��Ǽ����ÿһ���ֵ��*/

		int foradd = 9;
		int times = 2;
		int result = 0;
		while (times != 0) {
			int i = times--;
			int temp = 0;
			while (i != 0) {
				temp = (int) (foradd * Math.pow(10,--i ) + temp);
			}
			result = result + temp;
		}
		System.out.println(result);
	}
}
