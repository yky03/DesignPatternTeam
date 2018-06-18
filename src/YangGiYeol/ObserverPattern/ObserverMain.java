package YangGiYeol.ObserverPattern;

//동작 테스트용 클래스
public class ObserverMain {
	public static void main(String[] args) {
		
		NumberGenerator generator = new RandomNumberGenerator();
		Observer observer1 = new DigitObserver();
		Observer observer2 = new GraphObserver();
		
		generator.addObserver(observer1);
		generator.addObserver(observer2);
		generator.execute();
		
		
	}
}
