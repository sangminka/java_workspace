package ch01;

public class Wizard extends Hero {

	public Wizard(String name, int hp) {
		super(name, hp);

	}

	public void freezing() {
		System.out.println("프리즈");
	}

	// 오버라이드
	@Override
	protected void attack() {
		System.out.println(super.name + "기본 공격을 합니다");
	}
}
