import java.util.ArrayList;

public class Composite implements Component{

	private ArrayList<Component> component = new ArrayList<Component>();
	private String description;
	
	public Composite (String d)
	{
		description = d;
	}
	public void Print ()
	{
		System.out.println(description);
		//System.out.println(component);
		for(Component obj : component)
		{
			obj.Print();
		}
		
	}
	public void addChild(Component c)
	{
		component.add(c);
	}
	public void removeChild(Component c)
	{
		component.remove(c);
	}
	public Component getChild(int i)
	{
		return component.get(i);
	}
	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return component.size();
	}
	public ArrayList<Component> getArraylist()
	{
		return component;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "";
		
	}
	@Override
	public String getCategory() {
		// TODO Auto-generated method stub
		return "";
		
	}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}

