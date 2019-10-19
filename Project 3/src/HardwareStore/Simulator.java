package HardwareStore;
import java.util.*;

import HardwareStore.Customers.*;
import HardwareStore.Options.*;
import HardwareStore.Tools.*;

public class Simulator {//Observable to print file
	
	int day;
	int days;
	private List<HardwareStore> observers = new ArrayList<>();
	 
    public void addObserver(HardwareStore observer) {
        this.observers.add(observer);
    }
 
    public void removeObserver(HardwareStore observer) {
        this.observers.remove(observer);
    }
    
    public void notifyObservers() {
    	
    	Iterator<HardwareStore> iter = observers.iterator();
    	HardwareStore observer;
        
    	while(iter.hasNext()) {
        	observer = iter.next();
        	observer.update(days);
        }
            
    }

	public void simulate(int d, HardwareStore hardware_store) {
		
		int rental_days;
		RentalRecord current_rental;
		ArrayList<RentalRecord> rentals = new ArrayList<>();
		
		days = d;
		day = 1;
		Customer customer;
		ArrayList<HardwareTool> tools = new ArrayList<>();
		ArrayList<HardwareTool> tools_available =new ArrayList<>();
		ArrayList<Customer> customers =new ArrayList<>();
		
		while (days > 0) {
			
			hardware_store.setCompletedRentals(null);
			rentals =hardware_store.active_rentals();
			
			if (rentals == null) {
			      System.out.println("no active rentals");
			}
			else {
				Iterator<RentalRecord> iter = rentals.iterator();
				
				while (iter.hasNext()) {//return items before opening
					current_rental = iter.next();
					rental_days = (current_rental.getRentalPeriod() - 1);
					
					if (rental_days == 0) {
						current_rental.Return();
						//rentals = hardware_store.active_rentals();
						rentals.remove(current_rental);
						hardware_store.setActiveRentals(rentals);
						rentals = hardware_store.completed_rentals();
						rentals.add(current_rental);
						hardware_store.setCompletedRentals(rentals);
						rentals = hardware_store.all_completed_rentals();
						rentals.add(current_rental);
						hardware_store.setAllCompletedRentals(rentals);
						
					}
			      }
			}
			
			Random rand = new Random(); 
			HardwareTool tool;
			customers = hardware_store.customers();
			//options = hardware_store.options();
			int num_options = 0;
			int option = 0;
			
			for (int i = 0; i < rand.nextInt(customers.size()); i++){
				customer = customers.get(rand.nextInt(customers.size()));
		    
		    	for (int x = 0; x < 3; x++) {
		    		tools_available = hardware_store.tools_available();
		    		tool = tools_available.get(rand.nextInt(tools_available.size()));
		
		    		for (num_options = rand.nextInt(6); num_options > 0; num_options--) {
		    			option = rand.nextInt(3);
		    			
		    			if (option == 0) {
		    				tool = new AccessoryKit(tool);
		    			}
		    			else if (option == 1) {
		    				tool = new ExtensionCord(tool);
		    			}
		    			else if (option == 2) {
		    				tool = new ProtectiveGear(tool);
		    			}
		    		}
		    		
		    		tools.add(tool);
		    
		    	}
		    	customer.rentTool(tools);
		    } 
			notifyObservers();
		
		days -= 1;
		day += 1;
		}
		
		
}	}

