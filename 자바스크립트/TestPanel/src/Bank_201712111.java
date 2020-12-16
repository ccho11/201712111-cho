
public class Bank_201712111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BadBank_201712111 aa=new BadBank_201712111();
		NormalBank_201712111 ss=new NormalBank_201712111();
		GoodBank_201712111 dd=new GoodBank_201712111();
		
		System.out.println("BadBank의 이자율 : "+aa.getInterestRate());
		System.out.println("NormalBank의 이자율 : "+ss.getInterestRate());
		System.out.println("GoodBank의 이자율 : "+dd.getInterestRate());
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