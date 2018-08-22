
public class Calculator 
{
	
	
	public String AddNumbers(int a,int b,int c)
	{
		String result = "";
		int results[] = {0,0,0};
		results[0] = a;
		results[1] = b;
		results[2] = c;
		for(int i = 0; i < 3; i++)
		{
			int num1 = 0;
			int itr = 1;
			int itr2 = 2;
			if(results[num1] + results[itr] == results[itr2])
			{
				return "" + results[num1] + " + " + results[itr] + " = " + results[itr2];
			}
			itr2--;
			if(itr2 == 2)
			{
				System.out.println("dfsdfsd");
				itr++;
				num1++;
			}
			
		}
		
//		if((a + b) == c)
//		{
//			return "" + a + " + " + b + " = " + c; 			
//		}
//		else if((a + c) == b)
//		{
//			return "" + a + " + " + c + " = " + b; 
//		}
//		else if((b + c) ==a)
//		{
//			return "" + b + " + " + c + " = " + a; 
//		}
		
		return result;
	}
	
	public String MultiplyNumbers(int a,int b,int c)
	{
		
		String result = "";
		int results[] = {0,0,0};
		results[0] = a;
		results[1] = b;
		results[2] = c;
		for(int i = 0; i < 3; i++)
		{
			int num1 = 0;
			int itr = 1;
			int itr2 = 2;
			if(results[num1] * results[itr] == results[itr2])
			{
				return "" + results[num1] + " * " + results[itr] + " = " + results[itr2];
			}
			itr2--;
			if(itr2 == 2)
			{
				System.out.println("dfsdfsd");
				itr++;
				num1++;
			}
			
		}
		
		
		
		
		
		
		
		
//		String result = "";
//		
//		if((a * b) == c)
//		{
//			return "" + a + " * " + b + " = " + c; 			
//		}
//		else if((a * c) == b)
//		{
//			return "" + a + " * " + c + " = " + b; 
//		}
//		else if((b * c) ==a)
//		{
//			return "" + b + " * " + c + " = " + a; 
//		}
		
		return result;
	}
	
	public String DivideNumbers(int a,int b,int c)
	{
		String result = "";
		
		if((a / b) == c)
		{
			return "" + a + " / " + b + " = " + c; 			
		}
		if((b / a) == c)
		{
			return "" + b + " / " + a + " = " + c; 			
		}
		
		else if((a / c) == b)
		{
			return "" + a + " / " + c + " = " + b; 
		}
		
		else if((c / a) == b)
		{
			return "" + c + " / " + a + " = " + b; 
		}
		
		else if((b / c) ==a)
		{
			return "" + b + " / " + c + " = " + a; 
		}
		else if((c / b) ==a)
		{
			return "" + c + " / " + b + " = " + a; 
		}
		
		
		return result;
	}
	public String SubtractNumbers(int a,int b,int c)
	{
		String result = "";
		
		if((a - b) == c)
		{
			return "" + a + " - " + b + " = " + c; 			
		}
		else if((b - a) == c)
		{
			return "" + b + " - " + a + " = " + c; 			
		}
		
		else if((a - c) == b)
		{
			return "" + a + " - " + c + " = " + b; 
		}
		
		else if((c - a) == b)
		{
			return "" + c + " - " + a + " = " + b; 
		}
		
		else if((b - c) ==a)
		{
			return "" + b + " - " + c + " = " + a; 
		}
		else if((c - b) ==a)
		{
			return "" + c + " - " + b + " = " + a; 
		}
		
		
		return result;
	}
	
	
	public void FindAllResults(int a, int b, int c)
	{
		System.out.println("ADDING NUMBERS :"  + AddNumbers(a,b,c));
		System.out.println("SUBTRACT NUMBERS :"  + SubtractNumbers(a,b,c));
		System.out.println("Multiply NUMBERS :"  + MultiplyNumbers(a,b,c));
		System.out.println("Divide NUMBERS :"  + DivideNumbers(a,b,c));
		
	}
	
	

}
