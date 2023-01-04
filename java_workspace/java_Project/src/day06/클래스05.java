package day06;

public class 클래스05 {

	public static void main(String[] args) {
		TV t= new TV();
			t.turnon();
			t.volumeUp();
			t.volumeUp();
			t.volumeUp();
			t.volumeUp();
			t.channelUp();
			t.channelUp();
			t.channelUp();
			t.channelUp();
			t.channelDown();
			t.channelDown();
			t.channelDown();
			t.channelDown();
			t.volumeDown();
			t.turnoff();
	}

}
	class TV {
		private boolean power;
		private int ch;
		private int vol;
		
		public void turnon() {
			power = true;
			System.out.println("Tv가 켜졌습니다.");
		}
		public void turnoff() {
			power = false;
			System.out.println("Tv가 꺼졌습니다.");
		}
		public void channelUp() {
			ch++;
			if(ch ==10) {
				ch = 1;
			}
			System.out.println("ch : "+ch);
		}
		public void channelDown() {
			ch--;
			if(ch == 1) {
				ch = 10;
			}
			System.out.println("ch : "+ch);
		}
			public void volumeUp() {
				vol++;
				if(vol == 100) {
					vol = 1;
				}
				System.out.println("vol :"+vol);
				}
				
				public void volumeDown() {
					vol--;
					if(vol == 0) {
						vol = 1;
					}
					System.out.println("vol :"+vol);
			}
				public int getCh() {
					return ch;
				}
				public void setCh(int ch) {
					this.ch = ch;
				}
				public int getVol() {
					return vol;
				}
				public void setVol(int vol) {
					this.vol = vol;
				}
		
	}