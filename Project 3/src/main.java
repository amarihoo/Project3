import java.util.ArrayList;

import HardwareStore.HardwareStore;
import HardwareStore.Simulator;
import HardwareStore.Customers.CasualCustomer;
import HardwareStore.Customers.Customer;
import HardwareStore.Tools.ConcreteTool;
import HardwareStore.Tools.HardwareTool;
import HardwareStore.Tools.PaintingTool;
import HardwareStore.Tools.PlumbingTool;
import HardwareStore.Tools.WoodworkTool;
import HardwareStore.Tools.YardworkTool;

public class main {

	public static void main(String[] args) {
		
		ArrayList<Customer> customers = new ArrayList<Customer>();//12
		customers.add(new CasualCustomer("Customer 1"));
		customers.add(new CasualCustomer("Customer 2"));
		customers.add(new CasualCustomer("Customer 3"));
		customers.add(new CasualCustomer("Customer 4"));
		customers.add(new CasualCustomer("Customer 5"));
		customers.add(new CasualCustomer("Customer 6"));
		customers.add(new CasualCustomer("Customer 7"));
		customers.add(new CasualCustomer("Customer 8"));
		customers.add(new CasualCustomer("Customer 9"));
		customers.add(new CasualCustomer("Customer 10"));
		customers.add(new CasualCustomer("Customer 11"));
		customers.add(new CasualCustomer("Customer 12"));
		
		ArrayList<HardwareTool> tools = new ArrayList<HardwareTool>();//24
		tools.add(new PaintingTool("Paint Tool 1"));
		tools.add(new PaintingTool("Paint Tool 2"));
		tools.add(new PaintingTool("Paint Tool 3"));
		tools.add(new PaintingTool("Paint Tool 4"));
		tools.add(new PaintingTool("Paint Tool 5"));
		tools.add(new ConcreteTool("Concrete Tool 1"));
		tools.add(new ConcreteTool("Concrete Tool 2"));
		tools.add(new ConcreteTool("Concrete Tool 3"));
		tools.add(new ConcreteTool("Concrete Tool 4"));
		tools.add(new ConcreteTool("Concrete Tool 5"));
		tools.add(new PlumbingTool("Plumbing Tool 1"));
		tools.add(new PlumbingTool("Plumbing Tool 2"));
		tools.add(new PlumbingTool("Plumbing Tool 3"));
		tools.add(new PlumbingTool("Plumbing Tool 4"));
		tools.add(new PlumbingTool("Plumbing Tool 5"));
		tools.add(new WoodworkTool("Woodwork Tool 1"));
		tools.add(new WoodworkTool("Woodwork Tool 2"));
		tools.add(new WoodworkTool("Woodwork Tool 3"));
		tools.add(new WoodworkTool("Woodwork Tool 4"));
		tools.add(new WoodworkTool("Woodwork Tool 5"));
		tools.add(new YardworkTool("Yardwork Tool 1"));
		tools.add(new YardworkTool("Yardwork Tool 2"));
		tools.add(new YardworkTool("Yardwork Tool 3"));
		tools.add(new YardworkTool("Yardwork Tool 4"));
		
		/* create the simulator */
	    Simulator simulator = new Simulator();

	    /* create the observers */
	    HardwareStore hardware_store = new HardwareStore(simulator);
		hardware_store.setCustomers(customers);
		hardware_store.setTools(tools);
		hardware_store.setToolsAvailable(tools);

	    simulator.simulate(35,hardware_store);

	}


}
