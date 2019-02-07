
Feb-07-2019
Jake(Ilsoo Kim)

1. Changed NoQuarterState to NoCoinState / Changed HasQuarterState to HasCoinState
  - Because Machine 3 has accept other coins not only Quarters.

2. Changed insertCoin() -> insertCoin(int coin)
  - Each Machine can put different type of coins.
  
3. Changed GumballMachine(int numberGumballs) -> GumballMachine(int numberGumballs, int typeOfMachine)
  - Depending on typeOfMachine function will be little different.
  
4. Created int sumOfCoin
  - After insert coins, we check that sum of inserted coin is enough for get a gumball or not. 
  
5. Made a NotEnoughMoneyState State.
  - After we put some coins, it is possible that it still has not enough money.
  - If inserted coin of Machine 2 is less than 50Cents or inserted coin of Machine 2 is less than 50cents, state must be NotEnoughMoneyState.
 
 
