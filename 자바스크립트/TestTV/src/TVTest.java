
public class TVTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv = new TV();
		tv.channel = 7;
		tv.volume = 9;
		tv.onoff = true;
		
		tv.volumeup(10);
		
		System.out.println("�ڷ������� ä���� " + tv.channel + "�̰� ������ " + tv.volume + "�Դϴ�.");
		
	}

}
