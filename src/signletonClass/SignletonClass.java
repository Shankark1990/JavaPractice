package signletonClass;

public class SignletonClass {
	
	private static SignletonClass intance=new SignletonClass();
	private SignletonClass() {}
	
	public static SignletonClass getInstance()
	{
		return intance;
	}
	
	public static void showMessage()
	{
		System.out.println("Hello SigletonClass");
	}

}
