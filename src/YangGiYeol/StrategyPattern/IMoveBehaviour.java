package strategy;

public interface IMoveBehaviour {
	String move();
}

class Fly implements IMoveBehaviour {
	public String move() {
		return "난다";
	}
}

class Walk implements IMoveBehaviour {
	public String move() {
		return "걷는다";
	}
}

class Dash implements IMoveBehaviour {
	public String move() {
		return "달린다";
	}
}