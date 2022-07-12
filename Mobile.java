package week1.day2;

public class Mobile {
	public void makeCall() {
		String name="oppo";
		System.out.println("Mobile Name:"+name);
		
		// TODO Auto-generated method stub

	}
	public void sendMsg() {
		String color="white";
		System.out.println("Mobile color:"+color);
		
		// TODO Auto-generated method stub

	}
	private void payBills() {
		short price=15000;
		System.out.println("Mobile price is:"+price);
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		Mobile call=new Mobile();
		System.err.println("This is my mobile");
		call.makeCall();
		call.sendMsg();
		call.payBills();
		// TODO Auto-generated method stub

	}

}
