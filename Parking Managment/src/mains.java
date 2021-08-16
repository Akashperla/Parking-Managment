import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException; 
public class mains{
    int i,no=90;
	String num;
	Scanner scan=new Scanner(System.in);
	int[] check=new int[no];
	String[][] det=new String[no][2];
		
public static void main(String[] args) throws IOException
{ 
int a,b;
methods ob = new methods();
ob.start();
FileWriter filew=new FileWriter("Vehicle_Details.txt");
Scanner scan=new Scanner(System.in);
do{PrintWriter filep = new  PrintWriter(filew);
   System.out.println("MAIN MENU \nPress 1 for \"Vehicle Entry\"\nPress 2 for \"Vehicle Exit\"\nEnter here:");      
   a=scan.nextInt();
  
if(a==1)
{     System.out.println("Press 1 for \"2 Wheeler\"\nPress 2 for\"4 Wheeler\"\nEnter here:");
	  b=scan.nextInt();
	  if(b==1)
	  {   int n1=ob.entry(b);
		  System.out.println("Slot Alloted :"+ n1);
	      filep.println(ob.det[n1][0]+"\t\t"+ob.det[n1][1]);
	      filew.close();
	  }
	  else if(b==2)
	  {   int n2=ob.entry(b);
		  System.out.println("Slot Alloted :"+ n2);
	      filep.println(ob.det[n2][0]+"\t\t"+ob.det[n2][1]);
	      filew.close();
	  }
	  else
	  {
		  System.out.println("Invalid Entry!");
	  }
 }
 else if(a==2)
 { int n3;
    System.out.println("Enter the slot Number:");
    n3=scan.nextInt();
    ob.check[n3]=0;
 }
 else
{
	  System.out.println("Invalid Entry!");
}

}while(true);
}
}



