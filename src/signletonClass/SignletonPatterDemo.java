package signletonClass;

public class SignletonPatterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SignletonClass obj=new SignletonClass();
		
		SignletonClass obj=SignletonClass.getInstance();
		obj.showMessage();
	}

}
