
public class Box {
	int wid;
	int leg;
	int hei;
	
	
	Box(int a,int b,int c){
		wid=a;
		leg=b;
		hei=c;
	}
	
	boolean AA(Box aa) {
		if((wid==aa.wid)&&(leg==aa.leg)&&(hei==aa.hei))
			return true;
		else
			return false;
	}
}
