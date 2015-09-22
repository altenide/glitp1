
public class CircleAdapter extends Circle implements Ipoint {

	private Circle c;

	public CircleAdapter(Circle c) {
		this.c = c;
	}

	@Override
	public int getX() {
		return c.getX();
	}
	

	
}
