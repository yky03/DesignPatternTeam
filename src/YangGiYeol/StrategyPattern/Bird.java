package strategy;

public class Bird extends Animal {

	@Override
	void cry() {
		System.out.println("±±�ϰ� ���.");
	}

//	public Bird() {
//		super();
//		imb = new Fly();
//	}
	@Override
	void move() {
		System.out.println("����.");
	}

//	@Override
//	void fly() {
//		System.out.println("����.");
//	}
	
}
