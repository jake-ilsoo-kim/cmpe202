
Lab9

I used Lambda for Decorator Pattern. 

Since Lambda can define the internal implementation code of a function, it is not necessary to create each ConcreteDecorator class.

In original Decorator Pattern, there are one Component Interface, one ConcreteComponent and two ConcreateDecorators.
However, I have a Component Interface and another class in Lambda. 


- ConcreteComponent
```
Component ConcreteComponent = () -> {
			return "Hello World!";
		};
```

- ConcreateDecoratorA
```
Component ConcreateDecoratorA = () ->  "<em>" + ConcreteComponent.operation() + "</em>";
```

- ConcreateDecoratorB
```
Component ConcreateDecoratorB = () ->  "<h1>" + ConcreateDecoratorA.operation() + "</h1>";
```		
    

Using Lambda, each ConcreateDecorator can be made faster and more convenient.

  
  
