
public class TVTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv = new TV();
		tv.channel = 7;
		tv.volume = 9;
		tv.onoff = true;
		
		tv.volumeup(10);
		
		System.out.println("텔레비전의 채널은 " + tv.channel + "이고 볼륨은 " + tv.volume + "입니다.");
		
	}

}
