import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;
public class methods extends mains {
    LocalDateTime myDateObj = LocalDateTime.now();
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    
    public void start()
	{
		for(i=0;i<no;i++)
		{
			check[i]=0;
		}
	}
	public int entry(int b)
	{ 
	int n=0;
		if(b==1)
		{
		  for(i=0;i<40;i++)
		  {
			  if(check[i]==0)
			  {
				  check[i]=1;
				  System.out.println("Vehicle Number:");
				  det[i][0]=scan.nextLine();
				  det[i][1]=myDateObj.format(myFormatObj);
			      n=i;
				  break;
			  } 
		  }
		 
		}
		else if(b==2)
		{
			for(i=40;i<no;i++)
			  {
				  if(check[i]==0)
				  {
					  check[i]=1;
					  System.out.println("Vehicle Number:");
					  det[i][0]=scan.nextLine();
					  det[i][1]=myDateObj.format(myFormatObj);
					  n=i;
					  break;
				  }
		      	  }
		}
	 return n; 
    }

 
	
  
}	
