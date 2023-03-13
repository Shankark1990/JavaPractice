package interfaceDemo;

public class AustrolianTraffice implements CentralTraffic, ContinentalTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CentralTraffic a=new AustrolianTraffice();
		a.greenGo();
		a.redStop();
		a.yellowSlow();
		AustrolianTraffice at=new AustrolianTraffice();
		
		at.walkSymbol();
		
		ContinentalTraffic ct=new AustrolianTraffice();
		ct.trainSymbol();
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		
		System.out.println("Green go implemented...");
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("RedStop implemented...");
		
	}

	@Override
	public void yellowSlow() {
		// TODO Auto-generated method stub
		System.out.println("YellowSlow implemented...");
		
	}
	
	public void walkSymbol()
	{
		System.out.println("WalkSymbol implemented...");
	}

	@Override
	public void trainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("trainSymbol implemented...");
	}

}
