package YangGiYeol.ObserverPattern;

//관찰자를 나타내는 인터페이스
public interface Observer {
	public abstract void update(NumberGenerator generator);
}
