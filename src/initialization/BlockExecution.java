package initialization;

public class BlockExecution {

	static {
		System.out.println("Static Block");
	}

	{
		System.out.println("Instance Initialization Block");
	}

	public BlockExecution() {
		System.out.println("Constructor Block");
	}

	public static void main(String[] args) {
		System.out.println("Main block");
		BlockExecution be = new BlockExecution();
//		BlockExecution be1=new BlockExecution();

	}

}