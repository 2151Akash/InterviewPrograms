package accesmodifier;

public class ProtectedModifier {
	public class Final {

	}
	protected void m9() {
		System.out.println("kacha badam");
	}
protected void m10() {
	m9();
}
public static void main(String[] args) {
	ProtectedModifier b=new ProtectedModifier();
	b.m10();
}
}
