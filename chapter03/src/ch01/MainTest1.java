package ch01;

public class MainTest1 {

	public static void main(String[] args) {
		
		Warrior warrior1 = new Warrior("검사" , 100);
		//오버라이드 메서드
		//1. 자기 자신에 메서드를 확인 (자식 - Warrior)
		//2. 자기 자신에 attack()메서드가 없다면 부모 객체를 확인한다.ㄴ
		warrior1.attack();

		
	}//end of main

}//end of class
