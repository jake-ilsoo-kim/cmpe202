import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class PaperReceipt implements Print{
	@Override
	public void print(Component component, int ordernum, double cash) {
		// TODO Auto-generated method stub
		System.out.println("=================================");
		System.out.println("            FIVE GUYS");
		System.out.println("         BURGERS AND FRIES");
		System.out.println("          STORE # CA-1294");
		System.out.println("       5353 ALMADEN EXPY N60");
		System.out.println("         SAN JOSE, CA 95118");
		System.out.println("          (P) 408-646-9300");
		System.out.println("");
		System.out.println("");
		
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/YYYY  HH:mm:ss a");
		Calendar cal = Calendar.getInstance();
		String datestr = sdf.format(cal.getTime());
		System.out.println("     "+datestr);
		System.out.println("");
		
		
		System.out.println("           FIVE GUYS    ");
		System.out.println("Order Number : "+ ordernum);
		System.out.println("Sandwiches #1");
		
		double finalprice =0.00;
		
		int i=0;
		for (i=0; i<component.getLength();i++)
		{
			String mainCategory= component.getChild(i).getCategory();
			String mainName= component.getChild(i).getName();
			double mainPrice= component.getChild(i).getPrice();
			
			for(int j=0; j<component.getChild(i).getLength(); j++)
			{
				String name = (component.getChild(i).getChild(j).getName());
				String category = component.getChild(i).getChild(j).getCategory();
				double price = component.getChild(i).getChild(j).getPrice();
				
				if (category=="BURGER")
				{
					 System.out.println("1    " + name + "                     " + price);
					 finalprice=finalprice+price;
				}
				else if(category=="MEAT")
				{
					System.out.println("      {{{{ " + name + " }}}}");
				}
				else if(category=="TOPBUN")
				{
					 System.out.println("      " + name);
				}
				else if(category=="BOTTOMBUN")
				{
					System.out.println("       ->|" + name);
				}
				
			}
			
			if (mainCategory=="FRIES")
			{
				 System.out.println("1     " + mainName + "                " + mainPrice);
				 finalprice=finalprice+mainPrice;
			}
		}
		System.out.println("");
		double printFinalPrice = Double.parseDouble(String.format("%.2f", finalprice));
		double tax = printFinalPrice*0.09;
		double printTax = Double.parseDouble(String.format("%.2f", tax));
		double totalPrice = Double.parseDouble(String.format("%.2f", printFinalPrice+printTax));
		DecimalFormat fmt = new DecimalFormat("##.00");
		String printCash = fmt.format(cash);
		double change = cash-totalPrice;
		System.out.println("   Sub. Total:              $"+printFinalPrice);
		System.out.println("   Tax:                     $"+printTax);
		System.out.println("   Total:                   $"+totalPrice);
		System.out.println("");
		System.out.println("   Cash $"+printCash+"             $"+printCash);
		System.out.println("   Change                  $"+change);
		System.out.println("Register:1   Trans Sqe No:  57845");
		System.out.println("Cashier:Sakda* S.");
		System.out.println(" ******************************  ");
		System.out.println(" Don't throw away your receipt!!! ");
		System.out.println("");
		System.out.println("");
	}


	
}
