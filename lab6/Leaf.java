import java.util.ArrayList;

public class Leaf implements Component{

	private String name;
	private double price;
	private String category;
	
	public Leaf(String name, String category, double price) {
		this.name = name;
		this.category =category;
		this.price = price; 
	}
	@Override
	public void Print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addChild(Component c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeChild(Component c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Component getChild(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public ArrayList<Component> getArraylist() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	@Override
	public String getCategory() {
		// TODO Auto-generated method stub
		return this.category;
	}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

}
