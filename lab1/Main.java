

public class Main {

    public static void main(String[] args) {
        
        GumballMachine gumballMachine1 = new GumballMachine(1,5);

        System.out.println(gumballMachine1);
        gumballMachine1.insertQuarter( 25 );
        gumballMachine1.turnCrank();
        System.out.println(gumballMachine1);
        
        GumballMachine gumballMachine3 = new GumballMachine(3,5);

        System.out.println(gumballMachine3);
        gumballMachine3.insertQuarter( 5 );
        gumballMachine3.insertQuarter( 5 );
        gumballMachine3.insertQuarter( 25 );
        gumballMachine3.insertQuarter( 10 );
        gumballMachine3.insertQuarter( 10 );
        gumballMachine3.turnCrank();
        System.out.println(gumballMachine3);

        
        GumballMachine gumballMachine2 = new GumballMachine(2,5);

        System.out.println(gumballMachine2);
        gumballMachine2.insertQuarter( 25 );
        gumballMachine2.insertQuarter( 25 );
        gumballMachine2.turnCrank();
        System.out.println(gumballMachine2);
        
        
        //gumballMachine.insertQuarter( 25 );
        //gumballMachine.turnCrank();
        //gumballMachine.insertQuarter( 25 );
        //gumballMachine.turnCrank();

        //System.out.println(gumballMachine);
        
    
    }
}
