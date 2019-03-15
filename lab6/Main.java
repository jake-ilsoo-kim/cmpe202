
public class Main {

	public static void main(String[] args) {
		
		Component theorder = BuildOrder.getOrder();
		
		PaperReceipt paperReceipt = new PaperReceipt();
		// OrderName, OrderNum, Cash
		paperReceipt.print(theorder, 45 , 20.00);
		
		PackingSlip packingslip = new PackingSlip();
		packingslip.print(theorder,  45 , 20.00);
		
		
		
	}
			
	
			
}