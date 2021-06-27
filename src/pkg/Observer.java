package pkg;

public class Observer implements ProtossUnit {

	@Override
	public void select() {
		System.out.println("An Observer has been selected.");
	}

	@Override
	public void move(int x, int y) {
		System.out.println("An Observer moved to (" + x + ", " + y + ").");
	}

	@Override
	public void attack() {
		System.out.println("An Observer has attacked enemies.");
	}

}
