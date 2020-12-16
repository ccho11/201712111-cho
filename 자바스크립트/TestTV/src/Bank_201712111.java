
public class Bank_201712111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BadBank_201712111 b1=new BadBank_201712111();
		NormalBank_201712111 b2=new NormalBank_201712111();
		GoodBank_201712111 b3=new GoodBank_201712111();
		
		System.out.println("BadBank의 이자율: "+b1.getInterestRate());
		System.out.println("NormalBank의 이자율: "+b2.getInterestRate());
		System.out.println("GoodBank의 이자율: "+b3.getInterestRate());
	}
}
class BadBank_201712111 extends Bank_201712111{
	double getInterestRate() {
		return 10.0;
	}
}
class NormalBank_201712111 extends Bank_201712111{
	double getInterestRate() {
		return 5.0;
	}
}

class GoodBank_201712111 extends Bank_201712111{
	double getInterestRate() {
		return 3.0;
	}
}

