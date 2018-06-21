package strategy;

public class Dog extends Animal {

	@Override
	void cry() {
		System.out.println("멍멍 짇는다.");
	}
	
//	public Dog() {
//		super();
//		imb = new Walk();
//		
//	}
	
	@Override
	void move() {
		System.out.println("걷는다.");
	}
	// 걷는다에서 달린다로 변경을 하고 싶다면? 하나가 아닌 두개로 추가하고 싶다면?
//	@Override
//	void fly() {
//		System.out.println("날 수 없다.");
//	}
	
}
