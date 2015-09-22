package model;
import java.util.List;
import java.util.Observable;



import view.MyComponent;

public class DataAdapter extends Observable implements IModel {
	
	public List<MyComponent> observers;
	
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		super.notifyObservers();
	}
	
}