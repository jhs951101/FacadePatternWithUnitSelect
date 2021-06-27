package pkg;

public class Corsair implements ProtossUnit {

	@Override
	public void select() {
		System.out.println("A Corsair has been selected.");
	}

	@Override
	public void move(int x, int y) {
		System.out.println("A Corsair moved to (" + x + ", " + y + ").");
	}

	@Override
	public void attack() {
		System.out.println("A Corsair has attacked enemies.");
	}

}
