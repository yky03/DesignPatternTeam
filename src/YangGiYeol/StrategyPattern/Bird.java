package strategy;

public class Bird extends Animal {

	@Override
	void cry() {
		System.out.println("Â±Â±ÇÏ°í ¿î´Ù.");
	}

//	public Bird() {
//		super();
//		imb = new Fly();
//	}
	@Override
	void move() {
		System.out.println("³­´Ù.");
	}

//	@Override
//	void fly() {
//		System.out.println("³­´Ù.");
//	}
	
}
