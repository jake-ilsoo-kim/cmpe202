
/**
 * Write a description of class NotEnoughMoneyState here.
 *
 * @author (Jake (Ilsoo Kim) )
 * @version (Feb-07-2019)
 */
public class NotEnoughMoneyState implements State
{
    GumballMachine gumballMachine;

    public NotEnoughMoneyState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertCoin() {
            System.out.println("You inserted coin");
		
    	    if(gumballMachine.getTypeOfMachine()==1&&gumballMachine.getSumOfCoin()==25)
    	    {
              gumballMachine.setState(gumballMachine.getHasCoinState());
            }
            else if(gumballMachine.getTypeOfMachine()==2&&gumballMachine.getSumOfCoin()==50)
            {
              gumballMachine.setState(gumballMachine.getHasCoinState());  
            }
            else if(gumballMachine.getTypeOfMachine()==3&&gumballMachine.getSumOfCoin()==50)
            {
              gumballMachine.setState(gumballMachine.getHasCoinState());
            }
            else{
              System.out.println("But it's not enough");  
             gumballMachine.setState(gumballMachine.getNotEnoughMoneyState());
            }
            
	}
 
	public void ejectCoin() {
		System.out.println("You haven't inserted correct coin");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there's not enough coin");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	} 
 
	public String toString() {
		return "NotEnoughMoneyState - waiting more coin";
	}
}
