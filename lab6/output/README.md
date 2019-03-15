
### Design Pattern
Composite Pattern and Strategy Pattern

1. Composite Pattern
 - Component class is an interface.
 - Composite class implements Component class.
 
2. Strategy Pattern
 - PackingSlip class and paperReceipt class are ConcreteStrategy.
 - Print class is an interface and Strategy.
 - Strategy Pattern is used for differences between PackingSlip class and paperReceipt class.
 
### Results
```
=================================
            FIVE GUYS
         BURGERS AND FRIES
          STORE # CA-1294
       5353 ALMADEN EXPY N60
         SAN JOSE, CA 95118
          (P) 408-646-9300


     3/15/2019  12:42:37 PM

           FIVE GUYS    
Order Number : 45
Sandwiches #1
1    LBB                     5.59
      {{{{ BACON }}}}
      LETTUCE
      TOMATO
       ->|G ONION
       ->|JAVA Grilled
1     LTL CAJ                2.79

   Sub. Total:              $8.38
   Tax:                     $0.75
   Total:                   $9.13

   Cash $20.00             $20.00
   Change                  $10.87
Register:1   Trans Sqe No:  57845
Cashier:Sakda* S.
 ******************************  
 Don't throw away your receipt!!! 


=================================
Patties - 1

Order Number : 45
      3/15/2019  12:42:37 PM
           FIVE GUYS    

Sandwiches #1
1    LBB
     {{{{ BACON }}}}
     LETTUCE
     TOMATO
      ->|G ONION
      ->|JAVA Grilled
1     LTL CAJ
Register:1  Trans Sqe No: 57845
Cashier:Sakda* S.



```

