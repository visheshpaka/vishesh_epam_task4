package vishesh.cleancode;
import java.util.*;
import java.io.*;
import java.io.IOException;
public class House_Construction_Cost_Estimation {
	BufferedWriter out;
    Scanner s;
    int material_type;
    double area_of_house;
     
    public void costCalculation() throws IOException
    {
    	s=new Scanner(System.in);
	    out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out),"ASCII"),512);
        out.write("Enter your choice from available materials:\n1.Standard material\n2.Above standard material\n3.High standard material\n4. High standard materials and fully automated home\n");
        out.flush();
        material_type=s.nextInt();
        out.write("Enter total area of the house : ");
        out.flush();
        area_of_house=s.nextDouble();
        
        try {
        	double cost=0;
        	switch(material_type)
        	{
        	case 1:cost=1200*area_of_house;
	                break;
	        case 2:cost=1500*area_of_house;
                    break; 
	        case 3:cost=1800*area_of_house;
	                break;
	        case 4:cost=2500*area_of_house;
	        	    break;
	        default:out.write("Invalid material type");
	    	        out.flush();
	    	        break;
        	}
        	out.write("Total construction cost of the house is Rs."+cost);
        	out.flush();
        	}
        catch(Exception e)
        {
        	out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out),"ASCII"),512);
            out.write("Exception arised, please enter valid input");
            out.flush();
        	
        	}
        	
        
    }

}
