package ms01;


public class Daughter implements Person{
	private String friend;
	
	public void bap() {
		System.out.println("?λ―Έλ°₯ ?«?΄ ?«?΄===> ? ??λ°? μ’μ ");
	}
	public void setFriend(String friend) {
		this.friend=friend;
	}
	public void getFriend() {
		System.out.println("?Έ? μΉκ΅¬"+friend+"???€");
	}
}
