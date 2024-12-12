package pavanKumar.string;

import java.util.Iterator;

public class SplitStr {

	public static void main(String[] args) {
		String pop = "xXHelloNaveenxXXAutomationXxXLabsXXxXJava";
		String p[] = pop.split("xX");
//		System.out.print(p[0] + ":" + p[0].length());

		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i]);
		}
	}
}
