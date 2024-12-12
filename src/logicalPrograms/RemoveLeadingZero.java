package logicalPrograms;

public class RemoveLeadingZero {

	public static void main(String[] args) {
		String str = "000000000022123";

		StringBuffer sb = null;

		int i = 0;

		while (i < str.length() & str.charAt(i) == '0') {
			i++;

			sb = new StringBuffer(str);
			sb.replace(0, i, "");

		}

		System.out.println(sb.toString());

	}

}
