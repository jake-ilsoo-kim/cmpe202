Patterns

Chain of Responsibility
Screen, CreditCard Number, credit card Exp, and CreditCard CVC are Chain of Responsibility. When CreditCard Number can't handel requtest, it passed on to next handler: CreditCard Exp. And so on. Screen -> Creditcard Number -> CreditCard Exp -> CreditCard CVC
Decorator
For using display of CreditCard Number and CreditCard Exp I use Decorator pattern. It makes a space between CreditCard Number. And it puts "/" in CreditCard Exp.
