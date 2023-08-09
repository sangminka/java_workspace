package ch03;

public class TestMainTest {

	public static void main(String[] args) {

		Warrior warrior1 = new Warrior();
		Archer archer1 = new Archer();
		Wizard wizard1 = new Wizard();

		warrior1.age = 10;
		archer1.name = "궁수";
		wizard1.height = 160;

		System.out.println(warrior1.age);
		System.out.println(archer1.name);
		System.out.println(wizard1.height);

	}// end of main

}// end of class
