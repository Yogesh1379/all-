package test;

public class practice {
	
	
	/*
*
**
***
****
*****
	 * 
	*/
/*	public static void main(String [] arg)
	{
		int r=5;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<=i; j++)
			{
				
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}
	
	/*
	 
	  *
     * *
    * * *
   * * * *
  * * * * *
 * * * * * *
	 */
	
	
/*public static void main (String [] args)
{
	for(int i=0 ;i<=5;i++)
	{
		for(int k=0; k<=5-i-1;k++)
		{
			System.out.print(" ");
		}
		for(int j=0; j<=i;j++)
		{
			System.out.print(" " +"*");
		}
		System.out.println();
	}
	
}  
	
	/*
 * * * * * 
 * * * *  
 * * *   
 * *    
 *
	 */
	
/*	public static void main (String [] args)
	{
		int r=1;
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			for(int k=5; k>=i;k--)
			{
				System.out.print(" ");
			}
			
			System.out.println();
		}
	}   

	/*
	 * 
	*
   ***
  *****
 *******
*********
	 * 	 */
	/*public static void main(String arg[])
	{
		for (int i=0; i<5;i++)
		{
			for (int j=1;j<=5-i-1;j++)
			{
				System.out.print(" ");
				}
				for(int k=0; k<2*i+1;k++)
				{
					System.out.print("*");
				}
				
			
			System.out.println();
		}
		
	} */
	
	/*
  * * * * *
   * * * *
    * * *
     * *
      *
	 */
/*	public static void main(String arg[]) {
		for(int i=5; i>=0;i--)
		{
			for(int k=0;k<5-i+1;k++)
			{
			System.out.print(" ");
			}

			for(int j=0; j<i; j++)
			{
			 System.out.print(" *"); 
			}
			
		System.out.println();
		}
	} */
	
	 public static void main(String args[]){  
		  int r,sum=0,temp;    
		  int n=121; 
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;   
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
	
/*	public static void main(String args[]){ 
		int n=454%10;
		 System.out.println(n); 
	}  */
}
