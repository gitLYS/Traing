package search;

public class Program10 {
	public static void main(String[] args) {
		/*��Ŀ��һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻�����£������� ��10�����ʱ�������������ף���10�η�����ߣ�*/
		double high = 100.0;
		int flag = 0;
		double total = 0.0;
		while (flag++ != 10) {
			total = total + high;
			high = high / 2;
		}
		System.out.println(high);
		System.out.println(total);
	}
}
