package ch05;

public class Phone extends ClawMachine {

	String type;
	public Phone(String name, int price) {
		
		super(name, price);
		this.type = "휴대폰";
	}

}
