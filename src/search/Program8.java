package search;

public class Program8 {

	public static void main(String[] args) {
		/*题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
				1.程序分析：关键是计算出每一项的值。*/

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
