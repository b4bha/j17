import java.io.*;
abstract class Staff
{
	private String name,add;
	
	public Staff()
	{
	    name=add=" ";
	}
   
	public Staff(String n,String a)
    {
		name=n;
        add=a;
    }

    public void accept()throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("ENTER NAME : ");
		name = br.readLine();
        System.out.print("ENTER ADDRESS : ");
        add = br.readLine();
    }
	
	public void display()
    {
       	System.out.println("Name : "+name+"\nAddress : "+add);
    }
}



class PartTimeStaff extends Staff
{
	private int no_of_hr;
	private double rate_per_hr;
	
	public PartTimeStaff()
	{
		super();
		no_of_hr=0;
		rate_per_hr=0;
    }

	PartTimeStaff(String n,String a,int h,int r)
    {
       	super(n,a);
	    no_of_hr=h;
     	rate_per_hr=r;
    }

    public void accept()throws Exception
	{
       	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		super.accept();
        System.out.print("NO OF HOUR : ");
        no_of_hr=Integer.parseInt(br.readLine());
        System.out.print("RATE PER HOUR : ");
        rate_per_hr=Double.parseDouble(br.readLine());
    }
	
    public void display()
    {
    	super.display();
        System.out.println("No_of_hour : "+no_of_hr+"\nRate_per_hour : "+rate_per_hr);
    }
}

class FullTimeStaff extends Staff
{
	private String dept;
    private int salary;
    
	public FullTimeStaff()
    {
       	super();
       	dept=" ";
       	salary=0;
    }
	
    public FullTimeStaff(String n,String a,String d,int s)
    {
       	super(n,a);
     	dept = d;
       	salary = s;
    }

	public void accept()throws Exception
    {
       	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       	super.accept();
        
		System.out.print("Dept :");
        dept = br.readLine();
        
		System.out.print("Salary :");
        salary = Integer.parseInt(br.readLine());
    }

	public void display()
    {
       	super.display();
       	System.out.println("Department : "+dept+"\nSalary: "+salary);
    }
}



public class Slip17_1
{
	public static void main(String[] args)throws Exception
    {
        int no,n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1:FullTimeStaff ");
        System.out.println("2:PartTimeStaff ");
        
		System.out.print("Which objects you want to create(1/2)? :");
        no = Integer.parseInt(br.readLine());
        
		System.out.print("Enter how many objects you want to create :");
        n = Integer.parseInt(br.readLine());

        Staff m[] = new Staff[n];

        if(no == 1)
        {
            for(int i=0; i < m.length ;i++)
            {
                m[i] = new FullTimeStaff();  
                m[i].accept();
            }
            System.out.println("\nFullTime Staff Objects");
            for(int i = 0; i < m.length; i++)
            {
                m[i].display();
            }
        }
        else if(no == 2)
        {
            for(int i = 0; i < m.length; i++)
            {
                m[i] = new PartTimeStaff(); 
                m[i].accept();
            }
            System.out.println("PartTime Staff Objects");
            for(int i = 0; i < m.length; i++)
            {
                m[i].display();
            }
        }
        else
        {
            System.out.println("Wrong choice :");
        }
    }
}