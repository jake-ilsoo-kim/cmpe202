import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class PackingSlip implements Print{
	@Override
	public void print(Component component, int ordernum, double cash) {
		// TODO Auto-generated method stub
		System.out.println("=================================");		
		System.out.println("Patties - 1");
		System.out.println("");
		System.out.println("Order Number : "+ ordernum);
		
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/YYYY  HH:mm:ss a");
		Calendar cal = Calendar.getInstance();
		String datestr = sdf.format(cal.getTime());
		System.out.println("      "+datestr);
		System.out.println("           FIVE GUYS    ");
		System.out.println("");
		System.out.println("Sandwiches #1");
		
		int i=0;
		for (i=0; i<component.getLength();i++)
		{
			String mainCategory= component.getChild(i).getCategory();
			String mainName= component.getChild(i).getName();
			for(int j=0; j<component.getChild(i).getLength(); j++)
			{
				String name = (component.getChild(i).getChild(j).getName());
				String category = component.getChild(i).getChild(j).getCategory();
				
				if (category=="BURGER")
				{
					 System.out.println("1    " + name);
				}
				else if(category=="MEAT")
				{
					System.out.println("     {{{{ " + name + " }}}}");
				}
				else if(category=="TOPBUN")
				{
					 System.out.println("     " + name);
				}
				else if(category=="BOTTOMBUN")
				{
					System.out.println("      ->|" + name);
				}
				
			}
			
			if (mainCategory=="FRIES")
			{
				 System.out.println("1     " + mainName);
			}
		}
		
		System.out.println("Register:1  Trans Sqe No: 57845");
		System.out.println("Cashier:Sakda* S.");
		System.out.println("");
		
	}


	
}
