
public class CalcTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double light_speed = 30e4;
		double distance  = 40e12;
		
		double secs;
		
		secs = distance/light_speed;
		
		double yearsecs = secs/(365.0*24.0*60.0*60.0);
		System.out.println("�������� ��ռ������� �Ÿ��� " +  yearsecs  + " �����Դϴ�.");
	}

}
