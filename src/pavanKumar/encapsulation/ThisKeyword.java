package pavanKumar.encapsulation;

public class ThisKeyword {
	
	int x;
	int y;

	void setData(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	void display() {
		System.out.println(x+" "+y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisKeyword tk=new ThisKeyword();
		tk.setData(20, 12);
		tk.display();

	}

}
