package pavanKumar.encapsulation;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EncapsuleAccount acc=new EncapsuleAccount();
		acc.setAccno(1001);
		acc.setName("Shankar");
		acc.setAmount(9000000000.09);
		
		System.out.println("Account#: "+acc.getAccno());
		System.out.println("Name: "+acc.getName());
		System.out.println("Amount: "+acc.getAmount());

	}

}
