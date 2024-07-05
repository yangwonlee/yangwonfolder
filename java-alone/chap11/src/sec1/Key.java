package sec1;

public class Key {
	public int number;

	public Key(int number) {
		this.number = number;
	}
		
	@Override
		public boolean equals(Object obj) {
			if (obj instanceof Key) {
			Key Comparekey = (Key)obj; //강제 형변환
				if (this.number == Comparekey.number)
				return true;
			}
			return false;		
	}
		@Override
		public int hashCode() {
			return number;
	}
}