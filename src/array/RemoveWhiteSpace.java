package array;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String op="";
		String space="Hello, welcome to java world";
		System.out.println(space.replaceAll("\\s", ""));
		
		for(int i=0;i<space.length();i++) {
			char ch=space.charAt(i);
			if(!Character.isWhitespace(ch))
				op +=ch;
		}
		
		System.out.println(op);

	}

}
