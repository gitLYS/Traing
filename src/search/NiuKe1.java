package search;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class NiuKe1 {
	/*
	 * СQ�������ϲ���ʱ�뵽��������⣺��n������������ɶ�Ԫ�飬����С���ж��ٶ��أ�������أ�
	 * 
	 * ��������:
	 * 
	 * �����������������ݡ�
	 * 
	 * ����ÿ��������ݣ�
	 * 
	 * N - �������������n����
	 * 
	 * a1,a2...an - ��Ҫ���������
	 * 
	 * ��֤:
	 * 
	 * 1<=N<=100000,0<=ai<=INT_MAX.
	 * 
	 * 
	 * 
	 * �������:
	 * 
	 * ����ÿ�����ݣ��������������һ������ʾ����С�Ķ������ڶ�������ʾ�����Ķ�����
	 * 
	 * ��������: 6 45 12 45 32 5 6
	 * 
	 * �������: 1 2
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int total = sc.nextInt();
		int[] num = new int[total];
		while (total-- != 0) {
			list.add(sc.nextInt());
		}

		int MINCouple = 1;
		int maxTotal = 1;
		int minTotal = 1;
		int bigger = 1;
		int less = 1;

		Iterator<Integer> iterator = list.iterator();
		Iterator<Integer> iterator1 = list.iterator();

		int min = iterator.next();
		int max = min;
		iterator1.next();
		while (iterator.hasNext()) {
			int j = iterator.next();
			if (max < j) {
				max = j;
				maxTotal = 1;
			} else if (max == j) {
				maxTotal++;
			}

			if (min > j) {
				min = j;
				minTotal = 1;
			} else if (min == j) {
				minTotal++;
			}
		}

		MINCouple = minTotal * maxTotal;
		System.out.println(MINCouple);

	}

}
