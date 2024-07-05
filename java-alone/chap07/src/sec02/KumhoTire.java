package sec02;

public class KumhoTire extends Tire {
	
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation< maxRotation) {
			System.out.println(location + "Tire 수명: " +
					 (maxRotation-accumulatedRotation) + "회");
			return true;
		}else {
			System.out.println("***" + location + "kumho Tire 펑크 ***");
						
			return false;
		}
    }
}

// 금호 타이어는 한국타이어와 코딩이 거의 비슷함으로 한국타이어에서 우클릭 copy를 누른 후, paste를 누르면
// 복붙이 가능하다. 다만 이름이 똑같기 때문에 이클립스에서는 한국타이어2로 저장을 하냐고 묻는데, 이것만
// 바꿔주면 된다.