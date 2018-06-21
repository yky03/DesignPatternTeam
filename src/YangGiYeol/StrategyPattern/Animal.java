package strategy;

public class Animal {
	// 처음에는 cry()와 move() 메소드만을 소유 
	void cry() {
		
	}
	void move(){
	
	}
	// 새는 날 수 도 있지만 걸을 수 가 있다.
	// 개 역시 걸을 수 가 있지만 달릴 수 도있다.
	// 따라서 이러한 변경은 상속 및 형변환을 통한 오버라이딩으로 
	// 표현이 힘들며 코드 중복이 일어날 수 있는 가능성이 높다.
	// 따라서 불가피하게 부모클래스의 변경이 이루어져야만 한다.
	// => 이러한 변경은 전체적인 자식클래스의 변경을 동반하기에 좋은 선택이 아니다.
	// 이러한 코드를 의존성이 높다라고 한다.
	//void fly();
	
	// 메소드 요구사항의 변경으로 인하여 부모클래스가 수정되는 일을 최소화하기 위하여, 
	// 클래스 간에 인터페이스를 이용, Decoupling을 하여 의존성을 낮출 수 있도록 하는 
	// 디자인 패턴을 전략패턴이라고 한다.

	
//	public IMoveBehaviour imb;
//	
//	public String howToMove() {
//		return imb.move();
//	}
//	
//	public void setMove(IMoveBehaviour newMove) {
//		
//		imb = newMove;
//	}
}
