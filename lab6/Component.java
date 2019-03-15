import java.util.ArrayList;

public interface Component {

	void Print ();
	void addChild(Component c);
	void removeChild(Component c);
	Component getChild(int i);
	int getLength();
	public ArrayList<Component> getArraylist();
	String getName();
	String getCategory();
	double getPrice();

}