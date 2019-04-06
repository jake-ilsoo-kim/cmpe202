/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardCVC implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String cvc = "" ;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		if ( cvc.equals("") )
			return "[123]" + "  " ;
		else
			return "[" + cvc + "]" + "  " ;
	}	

	public void key(String ch, int cnt) {
		
		if (ch.equalsIgnoreCase("x")&& cnt>=20 && cnt < 23)
		{
			cvc = cvc.substring(0, cvc.length()-1);
		}
		else if ( !ch.equalsIgnoreCase("x") && cnt > 20  && cnt <= 23 ) {
			
				cvc += ch ;
			
		}
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}