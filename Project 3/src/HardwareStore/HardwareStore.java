package HardwareStore;

import java.util.*;
import HardwareStore.Tools.*;
import HardwareStore.Customers.*;
import HardwareStore.Observer.Observer;

public class HardwareStore implements Observer {//observes simulation
	
	public int location_id;
	protected ArrayList<HardwareTool> tools= null;
	protected ArrayList<Customer> customers= null;
	//protected ArrayList<Options> options = Option.AccessoryKit,;
	protected ArrayList<RentalRecord> completed_rentals = null;
	ArrayList<RentalRecord> all_completed_rentals= null;
	ArrayList<HardwareTool> tools_available= null;
	double daily_profit = 0.0;
	double total_profit = 0.0;
	protected ArrayList<RentalRecord> active_rentals= null;
	String fileName = "output.txt";
	
	public void setTools(ArrayList<HardwareTool> newTools) { tools = newTools; }
	public void setCustomers(ArrayList<Customer> newCustomers) { customers = newCustomers; }
	public void setCompletedRentals(ArrayList<RentalRecord> cr) { completed_rentals = cr; }
	public void setAllCompletedRentals(ArrayList<RentalRecord> acr) { all_completed_rentals = acr; }
	public void setActiveRentals(ArrayList<RentalRecord> ar) { active_rentals = ar; }
	public void setToolsAvailable(ArrayList<HardwareTool> newTools) { tools_available = newTools; }
	public ArrayList<RentalRecord> completed_rentals() { return completed_rentals; }
	public ArrayList<RentalRecord> active_rentals() { return active_rentals; }
	public ArrayList<RentalRecord> all_completed_rentals() { return all_completed_rentals; }
	
	public HardwareStore(Simulator simulator) {
	        simulator.addObserver(this);

	}
	public ArrayList<HardwareTool> tools_available() { return tools_available; }
	public ArrayList<Customer> customers() { return customers; }
	
	public void update(int day) {
		int d = 36 - day;
		if (day <= 35) {
//			
			System.out.print(d + " ");
			if (completed_rentals != null) {
				System.out.println("Completed Rentals: " + completed_rentals.size());
				System.out.print(completed_rentals);
			}
			if (active_rentals != null) {
				System.out.println("Active Rentals: " + active_rentals.size());
				System.out.print(active_rentals);
			}
			if (tools_available != null) {
				System.out.println("Tools Available: " + tools_available.size());
				System.out.print(tools_available);
			}
			System.out.print("Daily Profit: " + daily_profit);
		}
		else {
//			
			System.out.print(all_completed_rentals.size());
			System.out.println("Total Profit: " + total_profit);
		}
		
	}
	
}
