package HardwareStore.Customers;
import HardwareStore.Tools.HardwareTool;
import java.util.*;
import HardwareStore.Options.Options;

public class RentalRecord {
	
	protected Customer customer;
	protected ArrayList<HardwareTool> tools;
	protected double rental_price;
	protected double total_price;
	protected int rental_period;
	protected boolean completed; //return
	public void rental_period(int rp) { rental_period = rp; }
	//public void rental_price(int p) { rental_price = p; }
	public int getRentalPeriod() { return rental_period; }
	public Customer getRentalCustomer() { return customer; }
	public double getRentalPrice() { return rental_price; }
	public ArrayList<HardwareTool> getRentalTools() { return tools; }
	
	public RentalRecord(ArrayList<HardwareTool> t, int rp) {
		
		tools = t;
		customer = tools.get(0).rented_by();
		rental_period = rp;
		HardwareTool tool = null;
		
		Iterator<HardwareTool> iter = tools.iterator();
		
		while (iter.hasNext()) {
			tool = iter.next();
			rental_price = tool.rental_cost(rental_period);
			total_price += rental_price;
		}
			
		//pass tools, options, days, total cost
	}
	public RentalRecord Return() {
		
		customer.returnTool(this);
		completed = true;
		return this;
		
	}

}
