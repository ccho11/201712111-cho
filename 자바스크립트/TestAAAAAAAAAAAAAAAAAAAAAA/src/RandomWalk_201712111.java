
public class RandomWalk_201712111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dir;
		boolean[][] tile=new boolean[10][10];
		int x=5,y=5;
		
		for(int step=0; step<20; step++) {
			dir=(int)(Math.random()*4);
			if(dir==0 && x<9)
				x++;
			else if(dir==1 && x>0)
				x--;
			else if(dir==2 && y<9)
				y++;
			else if(y>0)
				y--;
			tile[y][x]=true;
			
			for(int i=0; i<10; i++) {
				for(int j=0; j<10; j++) {
					if(tile[j][i]==true)
						System.out.print(" #");
					else
						System.out.print(" .");
				}
				System.out.println(" "+(step+1)+"ÀÏ¶§");
			}
			System.out.println("----------------------");
		}
	}

}
