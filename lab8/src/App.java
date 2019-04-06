/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

/**
 *  Main App Class for Displaying Screen.
 */
public class App {

    private Screen screen;
    private CreditCardNum num;
    private CreditCardExp exp;
    private CreditCardCVC cvc;
    private int count;

    public App() {

        screen = new Screen();
        num = new CreditCardNum();
        exp = new CreditCardExp();
        cvc = new CreditCardCVC();

        num.wrapDecorator(new CreditCardNumDecorator());
        exp.wrapDecorator(new CreditCardExpDecorator());
        
        screen.addSubComponent(num);
        screen.addSubComponent(exp);
        screen.addSubComponent(cvc);

        count = 0;

    }

    public String display() {
        String output = "";
        output += "========================================\n";
        output += screen.name() + "\n";
        output += "========================================\n";
        output += "\n\n\n\n";
        output += screen.display() + "\n";
        output += "\n\n\n\n";
        output += "========================================\n";
        return output;
    }

    public void key(String ch) {
    	boolean keycheck = ch.equals("X")||ch.equals("x")||ch.equals("1")||ch.equals("2")||ch.equals("3")||ch.equals("4")||
    			ch.equals("5")||ch.equals("6")||ch.equals("7")||ch.equals("8")||ch.equals("9")||ch.equals("0");
    	
    	if(keycheck&&ch.equalsIgnoreCase("X")&&count<24&&count>0)
    	{	
	    	 count--;
	    	 screen.key(ch,count);
    	}
    	else if(keycheck&&!ch.equalsIgnoreCase("X")&&count<23&&count>=0) //ok
    	{
    		 count++;
	         screen.key(ch, count);
    	}
    
    	//System.err.println("App.ch =" +ch);
    	//System.err.println("App.count =" +count);
    	
    }

}

