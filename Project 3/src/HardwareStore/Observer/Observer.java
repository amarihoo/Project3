package Observer;
import HardwareStore.HardwareStore;
import HardwareStore.RentalRecord;

public interface Observer {
    
	void update(RentalRecord record,boolean endOfSim);

}
