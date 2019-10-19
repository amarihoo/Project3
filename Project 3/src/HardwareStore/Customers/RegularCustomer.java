package HardwareStore.Customers;
import java.util.*;
import HardwareStore.Tools.HardwareTool;

public class RegularCustomer extends Customer {
	
	public RegularCustomer(String named) {
        customer_name = named;
        num_rentals = 0;
    }

	public void rentTool(ArrayList<HardwareTool> tools) {
		
		if(tools_rented.size() == 3) { 
			return ;
		//print error statement, max tool rental
		}
		else if(tools.size() > (3 - tools_rented.size())) {
			return;
			//print error statement, renting more than max
		}
		else { 
			int rental_period = (int)  (Math.random() * 3 + 3);
			num_rentals += 1;
			
			Iterator<HardwareTool> iter = tools.iterator();
			HardwareTool current_tool;
			
			while (iter.hasNext()) {
				current_tool = iter.next();
				current_tool.rental_status(true);
				current_tool.set_rented_by(this);
				tools_rented.add(current_tool);
		      }
			
			rental_records.add(new RentalRecord(tools, rental_period));
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