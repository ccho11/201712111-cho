
public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5, y=5;
		int step;
		boolean tile[][] = new boolean[10][10];
		int walk3[][] = new int[10][10];
		tile[5][5] = true;
		
		{for(step = 0; step<20; step++){
			int direction = (int)(Math.random()*4);
			if(direction == 0 && x>0)
				x--;
			else if(direction == 1 && x<9)
				x++;
			else if(direction == 0 && y>0)
				y--;
			else if(y<9)
				y++;
			tile[y][x] = true;
				
			if(step%3 == 0)
				walk3[y][x]=step;
		}	
			
			for(int i = 0; i<10; i++) {
				for(int j = 0; j<10; j++) {
					if(walk3[j][i] != 0)
						System.out.print(walk3[j][i]+" ");
					else if(tile[j][i] == true)
						System.out.print("# ");
					else
						System.out.print(". ");
					
				}
				System.out.println();
			}
			System.out.println();
			System.out.println("-------------------");
			System.out.println();
		}
		System.out.println("전체 걸음 수는 " + step );
	}

}
