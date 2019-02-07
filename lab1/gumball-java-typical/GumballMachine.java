

public class GumballMachine {
 
    State soldOutState;
    State noCoinState; //noQuarterState -> noCoinState
    State hasCoinState; //hasQuarterState -> hasCoinState
    State soldState;
    State notEnoughMoneyState; //crated for checking current money.
    
    State state = soldOutState;
    
    int typeOfMachine = 0; //Type Of Machine is 1, 2 or 3.
    int count = 0; // number of Gumballs in Machine
    int sumOfCoin = 0; // Sum of Inserted Coin.
    
    public GumballMachine(int numberGumballs, int typeOfMachine) {
        soldOutState = new SoldOutState(this);
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        soldState = new SoldState(this);
        notEnoughMoneyState = new NotEnoughMoneyState(this); // When money is not enough,

        this.count = numberGumballs;
        this.typeOfMachine = typeOfMachine;
        
        if (numberGumballs > 0) {
            state = noCoinState;
            }
        }
    
 
    public void insertCoin(int coin) {
        
        if(typeOfMachine==1||typeOfMachine==2) // If Type of Machine is 1 or 2, Coin should be Quarter. 
        {
            if(coin==25){
                this.sumOfCoin=sumOfCoin+coin;
                state.insertCoin();
            
            }
            else{
            state.ejectCoin(); //Coin is not Quarter, it has to be rejected.
            }
        }else if(typeOfMachine==3) //If Type of Machine is 3, Coin can be 5, 10, 25.
        {   
            if(coin==5||coin==10||coin==25){  
                this.sumOfCoin=sumOfCoin+coin;
                state.insertCoin();
            
            }
            else{
            state.ejectCoin(); //Coin is not 5, 10, or 25, it has to be rejected.
            }
        }
    }
        
    
    public void ejectCoin() {
        state.ejectCoin();
    }
 
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }
 
    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }
 
    int getCount() {
        return count;
    }
 
    void refill(int count) {
        this.count = count;
        state = noCoinState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public State getSoldState() {
        return soldState;
    }
    
    public State getNotEnoughMoneyState() { // Created NotEnoughMoneyState 
        return notEnoughMoneyState;
    }
    
    public int getSumOfCoin(){ //get Sum of Inserted Coins
        return sumOfCoin;   
    }
    
    public int getTypeOfMachine(){ //get Type of Machine 1, 2, or 3
        return typeOfMachine;   
    }
 
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
