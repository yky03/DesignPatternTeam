package strategy;

public interface IMoveBehaviour {
	String move();
}

class Fly implements IMoveBehaviour {
	public String move() {
		return "����";
	}
}

class Walk implements IMoveBehaviour {
	public String move() {
		return "�ȴ´�";
	}
}

class Dash implements IMoveBehaviour {
	public String move() {
		return "�޸���";
	}
}