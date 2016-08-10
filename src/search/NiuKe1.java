package search;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class NiuKe1 {
	/*
	 * 小Q今天在上厕所时想到了这个问题：有n个数，两两组成二元组，差最小的有多少对呢？差最大呢？
	 * 
	 * 输入描述:
	 * 
	 * 输入包含多组测试数据。
	 * 
	 * 对于每组测试数据：
	 * 
	 * N - 本组测试数据有n个数
	 * 
	 * a1,a2...an - 需要计算的数据
	 * 
	 * 保证:
	 * 
	 * 1<=N<=100000,0<=ai<=INT_MAX.
	 * 
	 * 
	 * 
	 * 输出描述:
	 * 
	 * 对于每组数据，输出两个数，第一个数表示差最小的对数，第二个数表示差最大的对数。
	 * 
	 * 输入例子: 6 45 12 45 32 5 6
	 * 
	 * 输出例子: 1 2
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int total = sc.nextInt();
		while (total-- != 0) {
			list.add(sc.nextInt());
		}

		
		int MINCouple = 1;
		int maxTotal =1;
		int minTotal = 1;
		
		Iterator<Integer> iterator = list.iterator();
		Iterator<Integer> iterator1 = list.iterator();
		int min = iterator.next();
		int max = min;
		iterator1.next();
		while (iterator.hasNext()) {
			
			
			
			
			int j = iterator.next();
			if(max < j){
				max = j;
				maxTotal = 1;
			}else if(max == j){
				maxTotal++;
			}
				
			if(min > j){
				min = j;
				minTotal = 1;
			}else if(min == j){
				minTotal++;
			}
		}
		
	
		MINCouple = minTotal*maxTotal;
		System.out.println(MINCouple);
		
	}
	
	
	
	
	
}
