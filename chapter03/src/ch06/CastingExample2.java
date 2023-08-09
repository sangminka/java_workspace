package ch06;

public class CastingExample2 {

	public static void main(String[] args) {
		
		
		// 다운 캐스팅이란
		// 다운 캐스팅이란 업캐스팅된 객체를 다시 원래의 하위 
		// 클래스 타입으로 변환하는것을 말합니다. 다운캐스팅은
		// 수동적으로 형변환 연산자를 사용하여 이루어 집니다.
		// 업캐스팅된 객체를 하위 클래스에 메서드나 속성을 사용하기위해 
		// 필요합니다.
		Bird bird = (Bird)animal;
		bird.fly();
		
		//배열을 활용
		Animal[] animals = new Animal[3];
		animals[0] = new Animal();
		animals[1] = new Bird();
		animals[2] = new Animal();
		
		System.out.println("=========================================");
		// 0 -- Animal
		// 1 -- Bird
		// 2 -- Animal
		for (Animal a : animals) {
			a.makeSound();
			//데이터 타입을 확인하고 싶다면 instanceof 연산자
			if(a instanceof Bird) {
				Bird targetBird = (Bird)a;				
				targetBird.fly();
			}
			System.out.println("--------------------------");
		}
		
//		for (int i = 0; i < animals.length; i++) {
//			
//		}

	}// end of main

}// end of class
