package controller;

public class Calculate {
	
	
	public int cal(int a, int b,int v)
	{
	    int c;
	   System.out.println("the v value is=="+v);
		switch (v) {
		case 1: 
			c = a + b;
			break;
		case 2: 
			c = a-b;
			break;
		case 3: 
			c = a*b;
			break;
		case 4: 
		     if(b>0)
		     {
		    	 c = a/b;
		     }
		     else
		     {
		    	 c = 0;
		     }
		     break;
		case 5: 
			c = a%b;
			break;
		     

		default: c = 0;
			break;
		}
		
		return c;
	}

}
