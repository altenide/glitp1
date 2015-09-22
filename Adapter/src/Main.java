
public class Main {
	
	
	

	
	
	public static void main(String[] args) {
		//instanciation du cercle
		Circle c = new Circle();
		//populate the cercle
		c.setX(12);
		// stockage d'un point;
		Ipoint monPoint =  new CircleAdapter(c);
		Point p = (Point)((Circle) monPoint);
		p.getX();
	}
	

	
}
