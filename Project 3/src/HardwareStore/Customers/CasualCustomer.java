package HardwareStore.Customers;
import java.util.*;
import HardwareStore.Tools.HardwareTool;

public class CasualCustomer extends Customer {
	
	public CasualCustomer(String named) {
        customer_name = named;
        num_rentals = 0;
    }

	public void rentTool(ArrayList<HardwareTool> tools) {

		if(tools_rented.size() == 3) { 
			return ;
			//print error statement
		}
		else if(tools.size() != 1 || tools.size() != 2){
			return;
			//print error statement
		}
		else {
			num_rentals += 1;
			int rental_period = (int) ( Math.random() + 1.5);
			
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