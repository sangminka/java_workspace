package starCraft;

public class MainTest1 {

	public static void main(String[] args) {

		Zealot zealot1 = new Zealot("질럿");
		Zealot zealot2 = new Zealot("질럿");

		Marine marine1 = new Marine("마린");
		Zergling zergling1 = new Zergling("저글링");

		zealot1.attack(zergling1);
		zealot1.attack(zergling1);
		zealot1.attack(zergling1);
		zealot1.attack(zealot1);
		zealot2.attack(zealot1);
		zergling1.showInfo();
		zealot1.showInfo();
		zealot2.showInfo();
	}// end of class

}// end of main
