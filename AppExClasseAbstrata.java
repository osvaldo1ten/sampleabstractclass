package pkgclassesabstrata;

public class AppExClasseAbstrata {
	
	public static void main(String[] args) {
		Diamante d = new Diamante();
		d.pegar();
		
		Cogumelo c = new Cogumelo();
		c.pegar();
		
		Moeda m = new Moeda();
		m.pegar();
		
		Item ma = new Maca();
		ma.pegar();
	}
}
