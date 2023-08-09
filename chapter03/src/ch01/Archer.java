package ch01;

public class Archer extends Hero {

	public Archer(String name, int hp) {
		super(name, hp);
	}

	public void fireArrow() {
		System.out.println("파이어 에로우");
	}

	// 오버라이드
	@Override
	protected void attack() {
		System.out.println(super.name + "기본 공격을 합니다");
	}
}
