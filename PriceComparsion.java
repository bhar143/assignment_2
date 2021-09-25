package glassignment2;


public class PriceComparsion {
    int PriceComparsion ;

	public void priceRose(boolean[] compared_share_price) {
		// TODO Auto-generated method stub
		 Boolean b1 = true;  
	        Boolean b2 = false;  
	        int b3 = Boolean.compare(b1,b2);  
	        if(b3==0){  
	            System.out.println("Both values are equal");  
	        }  
	        else if(b3>0){  
	            System.out.println("total no of companies whose stack price rose today:1");  
	        }  
	        else{  
	            System.out.println("total no of companies whose stack price rose today:0");  
	        }  
	}

		

	public void priceDecline(boolean[] compared_share_price) {
		// TODO Auto-generated method stub
		 Boolean b1 = true;  
	        Boolean b2 = false;  
	        int b3 = Boolean.compare(b1,b2);  
	        if(b3==0){  
	            System.out.println("Both values are equal");  
	        }  
	        else if(b3<0){  
	            System.out.println("total no of companies whose stack price rose today:1");  
	        }  
	        else{  
	            System.out.println("total no of companies whose stack price rose today:0");  
	        }  

		  // second value
       // boolean b = false;
        // compare method
       // System.out.println(b + " comparing with " + b
       //                    + " = " + Boolean.compare(a, b));
	}

	}

