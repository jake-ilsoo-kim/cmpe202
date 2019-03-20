  

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;
        
        // 1st CustomBurger
        CustomBurger customBurger1 = new CustomBurger( "Build Your Own Burger" ) ;
       
        //Burger - Organic Biscon* +4.00 1/2lb. +12.00 On a Bum + 0;
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Organic Biscon*", "1/2lb.", "On A Bun" } ;
        b.setOptions( bo ) ;
        
        // 2 Cheese is +1.00
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Yellow American", "Spicy Jalapeno Jack"} ;
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;
        
        //Danish Blue Cheese + 1.50
        PremiumCheese pc = new PremiumCheese( "Cheese Options" ) ;
        String[] pco = { "Danish Blue Cheese"} ;
        pc.setOptions( pco ) ;
        pc.wrapDecorator( c ) ;
        
        // 1 Sauce is free, 2nd Sauce is +0.50
        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "Mayonnaise", "Thai Peanut Sauce" } ;
        s.setOptions( so ) ;
        s.wrapDecorator( pc ) ;
        
        // Unlimited Toppings
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles" } ;
        t.setOptions( to ) ;
        t.wrapDecorator( s ) ;
        
        //Each one is +1.00. Marinated Tomatoes is +2.00
        PremiumToppings pt = new PremiumToppings( "Premium Toppings Options" ) ;
        String[] pto = { "Marinated Tomatoes" } ;
        pt.setOptions( pto ) ;
        pt.wrapDecorator( t ) ;
        
        // 
        Bun bu = new Bun( "Bun Options" ) ;
        String[] buo = { "Ciabatta (Vegan)" } ;
        bu.setOptions( buo ) ;
        bu.wrapDecorator( pt ) ;

        // Each one is +3.00
        Side si = new Side( "Side Options" ) ;
        String[] sio = { "Shoestring Fries" } ;
        si.setOptions( sio ) ;
        si.wrapDecorator( bu ) ;
        
        
        //SetDecorator for Price
        customBurger1.setDecorator( si ) ;
        
        
        customBurger1.addChild( b ) ;
        customBurger1.addChild( c ) ;
        customBurger1.addChild( pc ) ;
        customBurger1.addChild( s ) ;
        customBurger1.addChild( t ) ;
        customBurger1.addChild( pt ) ;
        customBurger1.addChild( bu ) ;
        customBurger1.addChild( si ) ;
        
        
        // 2nd CustomBurger
        CustomBurger customBurger2 = new CustomBurger( "\nBuild Your Own Burger" ) ;
        
        //Burger - Hormone & Antibiotic Free Beef* +0 1/3lb. +9.00 On a Bum + 0;
        Burger b2 = new Burger( "Burger Options" ) ;
        String[] bo2 = { "Hormone & Antibiotic Free Beef*", "1/3lb.", "On A Bun" } ;
        b2.setOptions( bo2 ) ;
        
        // 2 Cheese is +1.00
        Cheese c2 = new Cheese( "Cheese Options" ) ;
        String[] co2 = { "Smoked Gouda", "Greek Feta"} ;
        c2.setOptions( co2 ) ;
        c2.wrapDecorator( b2 ) ;  
       
        //Fresh Mozzarella + 1.50
        PremiumCheese pc2 = new PremiumCheese( "Cheese Options" ) ;
        String[] pco2 = { "Fresh Mozzarella"} ;
        pc2.setOptions( pco2 ) ;
        pc2.wrapDecorator( c2 ) ;    
        
        // 1 Sauce is free, 2nd Sauce is +0.50
        Sauce s2 = new Sauce( "Sauce Options" ) ;
        String[] so2 = { "Habanero Salsa" } ;
        s2.setOptions( so2 ) ;
        s2.wrapDecorator( pc2 ) ;
        
        // Unlimited Toppings
        Toppings t2 = new Toppings( "Toppings Options" ) ;
        String[] to2 = { "Crushed Peanuts"} ;
        t2.setOptions( to2 ) ;
        t2.wrapDecorator( s2 ) ;
        
        //Each one is +1.00. Marinated Tomatoes is +2.00
        PremiumToppings pt2 = new PremiumToppings( "Premium Toppings Options" ) ;
        String[] pto2 = { "Sunny Side Up Egg*", "Marinated Tomatoes" } ;
        pt2.setOptions( pto2 ) ;
        pt2.wrapDecorator( t2 ) ;
 
        //Gluten-Free Bun is +1.00
        Bun bu2 = new Bun( "Bun Options" ) ;
        String[] buo2 = { "Gluten-Free Bun" } ;
        bu2.setOptions( buo2 ) ;
        bu2.wrapDecorator( pt2 ) ;
 
        //Each one is +3.00
        Side si2 = new Side( "Side Options" ) ;
        String[] sio2 = { "Shoestring Fries" } ;
        si2.setOptions( sio2 ) ;
        si2.wrapDecorator( bu2 ) ;
        
        //SetDecorator for Price
        customBurger2.setDecorator( si2 ) ;
        
        
        customBurger2.addChild( b2 ) ;
        customBurger2.addChild( c2 ) ;
        customBurger2.addChild( pc2 ) ; 
        customBurger2.addChild( s2 ) ; 
        customBurger2.addChild( t2 ) ; 
        customBurger2.addChild( pt2 ) ; 
        customBurger2.addChild( bu2 ) ;
        customBurger2.addChild( si2 ) ;
        
        // Add Custom Burger to the ORder
        order.addChild( customBurger1 );
        order.addChild( customBurger2 );
        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/