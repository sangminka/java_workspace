package ch05;

public class MachineMainTest {

	public static void main(String[] args) {
		ClawMachine[] arrClawMachine = new ClawMachine[10];
		
		arrClawMachine[0] = new Phone("스마트폰1" ,3_000);
		arrClawMachine[1] = new Phone("스마트폰2" ,3_000);
		arrClawMachine[2] = new Liquor("양주1" ,4_000);
		arrClawMachine[3] = new Liquor("양주2" ,4_000);
		arrClawMachine[4] = new TeddyBear("곰인형" ,1_000);
		arrClawMachine[5] = new TeddyBear("곰인형" ,1_000);
		
		for (ClawMachine clawMachine : arrClawMachine) {
			if(clawMachine != null) {
				clawMachine.showInfo();
			if (clawMachine instanceof Phone) {
				System.out.println("휴대폰");
			}else if (clawMachine instanceof Liquor) {
				System.out.println("양주");
			}else if (clawMachine instanceof TeddyBear) {
				System.out.println("곰인형");
			}
			}
			
		}
		
		

	}//end of main

}//end of class
