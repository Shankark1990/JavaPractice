package pavanKumar.string;

public class RemoveJunkCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String junk_str="$^&&%$%We*(*l(&#&&#c(**om)((e";
		String remove_junk_char=junk_str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(remove_junk_char);

	}

}
