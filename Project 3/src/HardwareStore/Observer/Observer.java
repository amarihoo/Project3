package HardwareStore.Observer;
import java.io.IOException;
import java.util.ArrayList;
import HardwareStore.HardwareStore;
import HardwareStore.Customers.RentalRecord;

public interface Observer {
    void update(int day) throws IOException;

}
