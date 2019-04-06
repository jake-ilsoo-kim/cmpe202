Patterns

1. Chain of Responsibility
  - Screen, CreditCard Number, credit card Exp, and CreditCard CVC are Chain of Responsibility. 
  - When credit card Number can't handle the request, it passed on to next handler: CreditCard Exp. 
  - And so on. Screen -> Creditcard Number -> CreditCard Exp -> CreditCard CVC

 2. Decorator
  - For using the display of credit card Number and credit card Exp I use Decorator pattern. 
  - It makes a space between CreditCard Number. And it puts "/" in credit card Exp.
