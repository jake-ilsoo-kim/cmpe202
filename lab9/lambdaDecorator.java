package lambda;

public class lambdaDecorator {

	public static void main(String [] args) {
        
		Component ConcreteComponent = () -> {
			return "Hello World!";
		};
		
		Component ConcreateDecoratorA = () ->  "<em>" + ConcreteComponent.operation() + "</em>";
		Component ConcreateDecoratorB = () ->  "<h1>" + ConcreateDecoratorA.operation() + "</h1>";
		
		System.out.println(ConcreateDecoratorB.operation());
		
    }
	
}
