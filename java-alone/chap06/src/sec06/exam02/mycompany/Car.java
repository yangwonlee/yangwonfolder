package sec06.exam02.mycompany;

import sec06.exam02.hankook.SnowTire;
import sec06.exam02.hyundai.Engine;
import sec06.exam02.kumho.BigWidthTire;
// 빈 라인에 우클릭 - 소스 - organize import를 누르면 바로 임포트를 가져옴. 유용.

public class Car {
// 필드
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	
	sec06.exam02.hankook.Tire tire3 = new sec06.exam02.hankook.Tire();
	sec06.exam02.kumho.Tire tire4 = new sec06.exam02.kumho.Tire();
	//sec06.exam2.~를 적은 이유는 타이어 클래스가 두 패키지에 모두 들어가 있어서. 정확히 적지 않으면
	//이클립스가 제대로 찾지 못하고 오류가 난다.
	
}
