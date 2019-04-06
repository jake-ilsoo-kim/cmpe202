
public class CreditCardNumDecorator  implements IDisplayDecorator{

	public String result;

	public CreditCardNumDecorator() {
		
	}
	public String decorator(String number) {
		
		result ="";
			for(int i=0; i< number.length(); i++){
				if( i == 4 || i == 8 || i ==12 )
				{
					result += " ";
				}
			result += number.substring(i,i+1);
			}
		return result;
	}
	
	
}
