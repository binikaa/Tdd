
public class StringCalculator {	
	
     public static String add(String number)
     {
	        double sum =0; 
	        if(number.length()==0)
	        {
	          return "0";
	        }
	        else if(number.charAt(number.length()-1)==',')
       	    {
       	     return "Number expected but Eof found";
         	}
	         
	        
	        else  if(number.contains(",\n"))
	        {
	          return "Number expected but '\n' found at position "+number.indexOf(",\n");
	        }
	        
	        else if(number.length()>0 )
	         {
	           for(String s : number.split("\\n|,"))
	             {
	                
	                 double num = Double.parseDouble(s);
	                 sum+=num;
	                         
	               }  
	           return Double.toString(sum);
	          }
	        
	        else{
	        	return "0";
	        	}
	        
	}
}
	

	

