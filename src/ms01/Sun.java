package ms01;


public class Sun implements Person{
	private String friend;
	
	public void bap() {
		System.out.println("?λ―Έλ°₯ ?«?΄ ?«?΄===> ? λΉ΅μ΄ μ’μ");
	}
	public void setFriend(String friend) {
		this.friend=friend;
	}
	public void getFriend() {
		System.out.println("??€? μΉκ΅¬"+friend+"???€");
	}
}
