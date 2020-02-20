package vishesh.cleancode;

import java.util.*;
import java.io.*;
import java.lang.Math;

public class Simple_and_Compound_Interest {
	
	double principal_amount;
    double rate_of_interest;
    double time_in_years;
    BufferedWriter out;
    Scanner s;
    public void calculateInterest() throws IOException
	{
		try
		{
    	s=new Scanner(System.in);
		    out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out),"ASCII"),512);
			out.write("Enter principal amount : ");
			out.flush();
			principal_amount=s.nextDouble();
			out.write("Enter rate of interest per annum : ");
			out.flush();
			rate_of_interest=s.nextDouble();
			out.write("Enter time in years : ");
			out.flush();
			time_in_years=s.nextDouble();
			
			 double simple_interest=(principal_amount*time_in_years*rate_of_interest)/100;
			 out.write("Simple interest = "+simple_interest+"\n");
			 out.flush();
			 out.write("===========================================================\n");
			 out.flush();
			 
			 out.write("To calculate compound interest enter number of times interest applied per time period : ");
		     out.flush();
		     int no_interest_applied=s.nextInt();
			 double final_amount=principal_amount*(Math.pow(1+rate_of_interest/(no_interest_applied*100),no_interest_applied*time_in_years));
			 out.write("Compound interest = "+(final_amount-principal_amount)+"\n");
			 out.flush();
			 out.write("===========================================================\n");   
			 out.flush();
	}
		catch(Exception e)
		{
			out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out),"ASCII"),512);
			out.write("Exception arised,please give valid input");
			out.flush();
		}
	}
		}
		



