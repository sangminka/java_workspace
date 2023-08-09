package ch05;

public class Liquor extends ClawMachine{

	String type;
	public Liquor(String name, int price) {
		super(name, price);
		this.type = "양주";
	}

}
