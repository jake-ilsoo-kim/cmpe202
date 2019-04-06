/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String number = "" ;
	private IDisplayDecorator dd ;
	
	public void wrapDecorator(IDisplayDecorator dd) {
		this.dd = dd;
	}
	
    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		if ( number.equals("") )
			return "[4444 4444 4444 4444]" + "  " ;
		else
			//return "[" + number + "]" + "  " ;
			return "[" + dd.decorator(number) + "]" + "  " ;
	}	

	public void key(String ch, int cnt) {
		
		if (ch.equalsIgnoreCase("x")&& cnt>=0 && cnt < 16)
		{
			//cnt=cnt-1;
			number = number.substring(0,  number.length()-1);
//			if( cnt == 4 || cnt == 8 || cnt ==12 )
//			{
//				number = number.substring(0,  number.length()-1);
//				cnt = cnt-1;
//			}
				//System.err.println("CardNum.ch =" +ch);
	    		//System.err.println("CardNum.cnt =" +cnt);
		}
		else if ( !ch.equalsIgnoreCase("x") && cnt <= 16 )
		{
//			if( cnt == 5 || cnt == 9 || cnt ==13 )
//			{
//				number += " ";
//			}
			number += ch ;
				//System.err.println("CardNum.ch =" +ch);
	    		//System.err.println("CardNum.cnt =" +cnt);
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