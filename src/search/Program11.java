package search;

public class Program11 {
	/*
	 * ��Ŀ����1��2��3��4�����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ�������Ƕ��٣�
	 * 1.��������������ڰ�λ��ʮλ����λ�����ֶ���1��2��3��4��������е����к���ȥ �����������������С�
	 */
	public static void num4() {
		int i, j, k;
		int count = 0;
		for (i = 1; i < 5; i++)
			for (j = 1; j < 5; j++)
				for (k = 1; k < 5; k++) {
					if (i != k && i != j && j != k)
						count++;
				}
		System.out.println(count);
	}
	
	
	
	
}
