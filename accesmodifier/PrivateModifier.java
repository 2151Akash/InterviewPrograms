package accesmodifier;

public class PrivateModifier {
	private void m7() {
		System.out.println("kach kach venkya");
	}
private static void m8() {
	PrivateModifier x=new PrivateModifier();
	x.m7();
}
public static void main(String[] args) {
	m8();
}
}
