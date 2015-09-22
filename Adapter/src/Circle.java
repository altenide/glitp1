
public class Circle implements ICircle {

	private int x;

	@Override
	public int getX() {
		System.out.println("circleor ? method getx");
		return x;
	}

	@Override
	public void CircleMethod() {
		System.out.println("Circle method");
		
	}

	@Override
	public void setX(int x) {
		System.out.println("circleor ? method set y");
		this.x = x;
	}

	
}
