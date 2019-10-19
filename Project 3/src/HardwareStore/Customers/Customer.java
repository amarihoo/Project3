package HardwareStore.Customers;
import java.util.*;
import HardwareStore.Tools.HardwareTool;

public abstract class Customer {
	protected String customer_name;
	protected ArrayList<HardwareTool> tools_rented = new ArrayList<>();
	
	//protected int num_tools;
	protected int num_rentals;
	protected ArrayList<RentalRecord> rental_records;

	public abstract void rentTool(ArrayList<HardwareTool> tools);
	public abstract void returnTool(RentalRecord record);
	
	//getters
	public String get_name() { return customer_name; }
	public ArrayList<HardwareTool> tools_rented() { return tools_rented; }
	
}


	

	

