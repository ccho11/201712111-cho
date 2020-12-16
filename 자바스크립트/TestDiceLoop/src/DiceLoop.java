
public class DiceLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int SIZE = 6;
		
		int[] freq = new int [SIZE];
		
		System.out.println("------------------------------");
		System.out.println("    주사위의 눈        나온 눈의 합계       ");
		System.out.println("------------------------------");
		
		for (int i = 0; i<10000; i++) {
			++freq[(int) (Math.random()*SIZE)];
		}
		for (int j = 0; j<SIZE; j++) {
			System.out.println("      " + j + "      " + freq[j]);
		}
	}

}
