package search;

public class Program10 {
	public static void main(String[] args) {
		/*题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？*/
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
