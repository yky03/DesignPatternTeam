package strategy;

public class Dog extends Animal {

	@Override
	void cry() {
		System.out.println("�۸� ���´�.");
	}
	
//	public Dog() {
//		super();
//		imb = new Walk();
//		
//	}
	
	@Override
	void move() {
		System.out.println("�ȴ´�.");
	}
	// �ȴ´ٿ��� �޸��ٷ� ������ �ϰ� �ʹٸ�? �ϳ��� �ƴ� �ΰ��� �߰��ϰ� �ʹٸ�?
//	@Override
//	void fly() {
//		System.out.println("�� �� ����.");
//	}
	
}
