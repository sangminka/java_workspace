package ex08;

public class AiCar extends  Car {

	@Override
	public void drive() {
		System.out.println("AI가 자율 주행을 합니다");
		System.out.println("스스로 방향을 변경합니다");
	}

	@Override
	public void stop() {
		System.out.println("AI가 스스로 차를 멈춥니다.");
		
	}

}
