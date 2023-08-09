package ch05;

import starCraft.Marine;
import starCraft.Unit;
import starCraft.Zealot;
import starCraft.Zergling;

public class MainTest2 {

	public static void main(String[] args) {
		// unit 이라는 배열에 저글링 , 질럿, 마린을 담아 보세요
		//실행도 시켜 봅시다.
		Unit arrayUnit[] = new Unit[100];
		
		arrayUnit[0] = new Zealot("질럿");
		arrayUnit[1] = new Zealot("질럿");
		arrayUnit[2] = new Marine("마린");
		arrayUnit[3] = new Zergling("저글링");
		
		for (int i = 0; i < 4; i++) {
			arrayUnit[i].showInfo();
		}
		
		
	}

}
