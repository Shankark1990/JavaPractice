package finalKeyword;

public class FinalKeywordDemoInArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = add(10, 20);
		System.out.println(sum);

	}

	public static int add(final int i, final int j) {
		return i + j;
	}

}
