package com.mycompany;

import java.util.*; // *를 쓴다면 모든 기능을 다 가져온다는 뜻. 확실히 뭘가져올지 지정하는게 용량에좋음.
import com.hankook.Tire;

public class Car {
	Tire tire = new Tire(); // 패키지의 타이어 클래스를 가져오고 싶다 라는 뜻. 그러나 불가. 임포트를
	//사용해야 함. 오류가 안나게 하려면 꼭 임포트로 가져와야 함.
}
