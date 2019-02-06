
public class GumballMachine
{
    
    private int num_gumballs;
    private boolean has_quarter;
    private boolean has_two_quarters;
    private boolean has_enough_money;
    private int typeofMachine=0;
    private int Machine1nowCoin=0;
    private int Machine2nowCoin=0;
    private int Machine3nowCoin=0;
    private int M2_num_gumballs;
    private int M3_num_gumballs;
    
    public GumballMachine( int typeofMachine, int size )
    {
        // initialise instance variables
        this.typeofMachine=typeofMachine;    
        //this.num_gumballs = size;
        if(typeofMachine==1)
        {
        this.has_quarter = false;
        this.num_gumballs = size;
        }else if (typeofMachine==2)
        {
         this.has_two_quarters=false;
         this.M2_num_gumballs = size;
        }else if (typeofMachine==3)
        {
         this.has_enough_money = false;
         this.M3_num_gumballs=size;
        }else
        {
          System.out.println("Exception. ");   
        }
        
           
    }

    public void insertQuarter(int coin)
    {   if(typeofMachine==1)
        {
        if ( coin == 25 )
            this.has_quarter = true ;
        else 
            this.has_quarter = false ;
    
        }else if(typeofMachine==2)
        {
            if ( coin == 25)
            {
                Machine2nowCoin=Machine2nowCoin+coin;
                if(Machine2nowCoin >= 50)
                {
                this.has_two_quarters = true;
                }
                else
                {
                    this.has_two_quarters = false;
                }
            }
            else 
            {
                System.out.println("Only Accepts Quarters");
                this.has_two_quarters = false;
            }
        }else if(typeofMachine==3)
        {
           if ( coin == 25 || coin ==5 || coin == 10 ) //Quarters, Nickels, Dimes
           {
               Machine3nowCoin=Machine3nowCoin+coin;
               if(Machine3nowCoin >= 50)
               {
                 this.has_enough_money = true;  
               }
               else
               {
                 this.has_enough_money = false;
               }
           }
            else
           {
               System.out.println("Machine"+typeofMachine+" : Only Accepts Nickels, Dimes, and Quarters");
               this.has_enough_money = false;
           }
        }
        else
        {
            System.out.println("Machine"+typeofMachine+" : Choose a right GumballMachine.");
        }
    }
    public void turnCrank()
    {
        
        if( this.has_quarter || this.has_two_quarters || this.has_enough_money)
        {
         RestOfGumball(typeofMachine);
        }
        else
        {
         System.out.println("Machine"+typeofMachine+" : put more money");   
        }
    
}
public void RestOfGumball(int typeofMachine)
    {
        if(typeofMachine==1)
        {
        if ( this.num_gumballs > 0 )
                {
                    this.num_gumballs-- ;
                    this.has_quarter = false ;
                    System.out.println( "Machine"+typeofMachine+" : Thanks for your quarter.  Gumball Ejected!" ) ;
                }
                else
                {
                    System.out.println( "Machine"+typeofMachine+" : No More Gumballs!  Sorry, can't return your quarter." ) ;
                }
        }else if(typeofMachine==2)
        {
             if ( this.M2_num_gumballs > 0 )
                {
                    this.M2_num_gumballs-- ;
                    this.has_two_quarters = false ;
                    System.out.println( "Machine"+typeofMachine+" : Thanks for your quarter.  Gumball Ejected!" ) ;
                }
                else
                {
                    System.out.println( "Machine"+typeofMachine+" : No More Gumballs!  Sorry, can't return your quarter." ) ;
                }
        }else if(typeofMachine==3)
        {
            if ( this.M3_num_gumballs > 0 )
                {
                    this.M3_num_gumballs-- ;
                    this.has_enough_money = false ;
                    System.out.println("Machine"+typeofMachine+" : Thanks for your quarter.  Gumball Ejected!" ) ;
                }
                else
                {
                    System.out.println( "Machine"+typeofMachine+" : No More Gumballs!  Sorry, can't return your quarter." ) ;
                }
        }
        
            
    }
}

