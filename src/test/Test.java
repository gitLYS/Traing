package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		int gifts[] = { 1, 2, 3, 2, 2 };
		int key = method(gifts, gifts.length);
		System.out.println(key);
	}

	public static int method(int[] gifts, int n) {

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < gifts.length; i++) {
			if (!map.containsKey(gifts[i]))
				map.put(gifts[i], 1);
			else
				map.put(gifts[i], map.get(gifts[i]) + 1);
		}

		Iterator<Integer> iterator = map.values().iterator();
		int repeat = iterator.next();
		while (iterator.hasNext()) {
			int j = iterator.next();
			if (j > repeat) {
				repeat = j;
			}
		}
		// System.out.println(repeat);
		int half = n / 2;
		int theKey = 0;
		Iterator<Integer> keys = map.keySet().iterator();
		while (keys.hasNext()) {
			int j = keys.next();
			if (repeat == map.get(j) && half < repeat) {
				// System.out.println(theKey);
				theKey = j;
			}
		}
		return theKey;
	}

	public static Vector<String> method1(int n) {
		Vector<String> gray = new Vector<>();
		if (n == 1) {
			gray.add("0");
			gray.add("1");
		}

		Vector<String> last_gray = method1(n - 1);
		for (int i = 0; i < last_gray.size(); i++) {
			gray.add("0" + last_gray.get(i));
		}
		for (int i = last_gray.size() - 1; i >= 0; i--) {
			gray.add("1"+last_gray.get(i));
		}

		return gray;

	}
}
