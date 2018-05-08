package inheritance;

public class Grandparent {
	int litNess;

	public Grandparent(int litNess) {
		this.litNess = litNess;
	}

	boolean litNessOver9000() {
		if (litNess > 9000) {
			return true;
		} else {
			return false;
		}
	}

	void printLitNess() {
		System.out.println(litNess);
	}

}
