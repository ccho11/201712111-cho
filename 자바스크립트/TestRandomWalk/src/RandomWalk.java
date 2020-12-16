
public class RandomWalk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int direct;
		boolean[][] tile = new boolean[10][10];
		
		int x = 5, y = 5;
		tile[y][x] = true;
		
		
		for(int steps = 0; steps<10; steps++) {
			direct = (int)(Math.random()*4);
			
			if(direct == 0 && y<9)
				x--;
			else if(direct == 1 && x<9)
				x++;
			else if(direct == 2 && y>0)
				y--;
			else if(x>0)
				x--;
			
			
			for(int i = 0; i<10; i++) {
				for (int j = 0; j<10; j++) {
					if(tile[i][j] == true)
						System.out.print("#");
					else
						System.out.print(".");

				}
		System.out.println("  " + (steps+1) + "ÀÏ¶§");

			}
			System.out.println("-------------------");
		}
		
	}
}
