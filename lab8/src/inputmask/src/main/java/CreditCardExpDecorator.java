
public class CreditCardExpDecorator  implements IDisplayDecorator{

	public String result;

	public CreditCardExpDecorator() {
		
	}
	public String decorator(String number) {
		
		result ="";
			for(int i=0; i< number.length(); i++){
				if( i == 2)
				{
					result += "/";
				}
			result += number.substring(i,i+1);
			}
		return result;
	}
	
	
}
