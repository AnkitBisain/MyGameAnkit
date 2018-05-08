package inheritance;

public class InheritanceRunner {
	public static void main(String[] args) {
		Kid kid = new Kid(99999999, true);
		Parent parent = new Parent(9000, true);
		Grandparent grandparent = new Grandparent(0);
		System.out.println("grandparent:");
		System.out.println(grandparent.litNessOver9000());
		grandparent.printLitNess();
		System.out.println("parent:");
		System.out.println(parent.litNessOver9000());
		parent.printLitNess();
		System.out.println(parent.isKinish);
		System.out.println("kid:");
		System.out.println(kid.litNessOver9000());
		kid.printLitNess();
		System.out.println(kid.isKinish);
	}
}
