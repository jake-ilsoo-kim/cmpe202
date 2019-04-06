/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExp implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String date = "" ;
	private IDisplayDecorator dd ;
	
	public void wrapDecorator(IDisplayDecorator dd) {
		this.dd = dd;
	}

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		if ( date.equals("") )
			return "[MM/YY]" + "  " ;
		else
			return "[" + dd.decorator(date) + "]" + "  " ;
	}	

	public void key(String ch, int cnt) {
		if (ch.equalsIgnoreCase("x")&& cnt>=16 && cnt < 20)
		{
			date = date.substring(0, date.length()-1);
		}
		else if ( !ch.equalsIgnoreCase("x") && cnt > 16 && cnt <= 20  )
			{
				date += ch ;
			}
		else if ( nextHandler != null )
			{
			nextHandler.key(ch, cnt) ;
			}
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}