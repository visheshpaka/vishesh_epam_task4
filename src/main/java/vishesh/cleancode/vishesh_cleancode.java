package vishesh.cleancode;

import java.io.*;
import java.io.IOException;

public class vishesh_cleancode  {
	public static void main(String[] args) throws IOException
	{
		Simple_and_Compound_Interest interest_obj = new Simple_and_Compound_Interest();
		interest_obj.calculateInterest();
		House_Construction_Cost_Estimation house_obj= new House_Construction_Cost_Estimation();
		house_obj.costCalculation();
	}
}
