
public class BuildOrder {

	public static Component getOrder()
	{
		Composite order = new Composite("ORDER");
		
		Composite burger = new Composite("BURGER");
		burger.addChild(new Leaf("LBB","BURGER", 5.59));
		burger.addChild(new Leaf("BACON","MEAT",0));
		burger.addChild(new Leaf("LETTUCE","TOPBUN",0));
		burger.addChild(new Leaf("TOMATO","TOPBUN",0));
		burger.addChild(new Leaf("G ONION","BOTTOMBUN",0));
		burger.addChild(new Leaf("JAVA Grilled","BOTTOMBUN",0));
		
		order.addChild(burger);
		order.addChild(new Leaf("LTL CAJ","FRIES",2.79));
		
		return order;
	}
}
