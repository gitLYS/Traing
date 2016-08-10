package search;

public class Program7 {

	public static void main(String[] args) {
		/*题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
		1.程序分析：利用while语句,条件为输入的字符不为 '\n '.*/

		String s = "1w \nhwd k j121i8y4e3irkjrfnrkjj";
		int A = 0, B = 0, C = 0, D = 0;
		char[] N = new char[100];
		for (int i = 0; i < s.length(); i++) {
			N[i] = s.charAt(i);
		}

		for (int i = 0; i < N.length; i++) {
			if((N[i]>'a'&&N[i]<'z') || (N[i]>'A'&&N[i]<'Z')){
				A++;
			}else if(N[i]>'0' && N[i]<'9'){
				B++;
			}else if(N[i]==' '){
				C++;
			}else if(N[i]=='\n'){
				D++;
			}
		}
		
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);

	}

}
