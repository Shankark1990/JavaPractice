package techelliptica;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b1 = (byte) 250;
		byte b2 = (byte) 120;
		byte b3 = (byte) 130;
		byte b4 = (byte) 300;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
		int n1=123;
		double result=n1;
		
		System.out.println(result);
		
		double n2=123.12;
		int result1= (int)n2;
		
		System.out.println(result1);
		
		int b11=123;
		byte b12=(byte)b11;
		System.out.println(b12);
		
		
		int b113=128;
		byte b114=(byte)b113;
		
		System.out.println(b114);
		
		int b13=128;
		byte b14=(byte)(b13*3);
		
		System.out.println(b14);
		
		int i=0X20;
		System.out.println(i);
		
		
		

	}

}
