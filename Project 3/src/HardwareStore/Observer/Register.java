package Observer;

import java.util.ArrayList;
import java.util.Iterator;

import HardwareStore.HardwareStore;
import HardwareStore.RentalRecord;

public class Register implements Observer {

    ArrayList<RentalRecord> rental_records;
    Store store;

    public Register(Store hardware_store) {
        this.store = hardware_store;
        rental_records = new ArrayList<RentalRecord>();
        hardware_store.registerObserver(this);
    }

	public void update(RentalRecord record, boolean endOfSim) {
		
		this.rental_records.add(record);
		
		if (!endOfSim) {
			System.out.println("Day:" + record.day());
			//System.out.println("Customer:" + record.customer().get_name());
			
			System.out.println("Cost:" + record.cost());
			//System.out.println("Rental Period:" + record.rental_period());
			System.out.println("Tools:" + record.tools());
		}
		else {
			int total_profit = 0;
			Iterator<RentalRecord> iter = rental_records.iterator();
			
			while(iter.hasNext()) {
				total_profit += iter.next().cost();
			}
			System.out.print("Total number of rentals:" + rental_records.size());
			System.out.println("Total Profit: " + total_profit);
		}
		
	}

}
