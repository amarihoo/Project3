package HardwareStore.Customers;
import java.util.*;

import HardwareStore.Tools.HardwareTool;

public class BusinessCustomer extends Customer {

	public BusinessCustomer(String named) {
        customer_name = named;
        num_rentals = 0;
    }
	
	
	public void rentTool(ArrayList<HardwareTool> tools) {
		
		if(tools_rented.size() == 3) { 
			//print error statement
			System.out.print("At tool capacity");
			return ;
			
		}
		else {
			//num_tools = 3;
			num_rentals = 1;
			int rental_period = 7;
			
			Iterator<HardwareTool> iter = tools.iterator();
			HardwareTool current_tool;
			
			while (iter.hasNext()) {
				current_tool = iter.next();
				current_tool.rental_status(true);
				current_tool.set_rented_by(this);
				tools_rented.add(current_tool);
		      }
			
			rental_records.add(new RentalRecord(tools, rental_period));
			//print rental statement
			
		}
		
	}

	public void returnTool(RentalRecord record) {
		
		ArrayList<HardwareTool> tools = record.tools;
		Iterator<HardwareTool> iter = tools.iterator();
		HardwareTool current_tool;
		
		while (iter.hasNext()) {
			current_tool = iter.next();
			current_tool.rental_status(false);
			current_tool.set_rented_by(null);
			current_tool.options(null);
			tools_rented.remove(current_tool);
			
	      }
		
	}

}
