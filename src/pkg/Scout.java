package pkg;

public class Scout implements ProtossUnit {

	@Override
	public void select() {
		System.out.println("A Scout has been selected.");
	}

	@Override
	public void move(int x, int y) {
		System.out.println("A Scout moved to (" + x + ", " + y + ").");
	}

	@Override
	public void attack() {
		System.out.println("A Scout has attacked enemies.");
	}

}
