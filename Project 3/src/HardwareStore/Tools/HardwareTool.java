package HardwareStore.Tools;
import java.util.*;
import HardwareStore.Customers.Customer;
import HardwareStore.Options.Options;

public abstract class HardwareTool {
    
	protected String unique_name;
   // protected double rental_rate;
    protected ArrayList<Options> options;
    protected boolean rental_status; 
    protected Customer rented_by;

    abstract public double rental_cost(int rental_period);
    //public double rental_rate() { return rental_rate; }
    
    //setters
    public void set_rented_by(Customer c) { rented_by = c; }
    public Customer rented_by() { return rented_by; }
    
    //getters
    public String get_name() { return unique_name; }
    public void rental_status(boolean rs) { rental_status = rs; }
    public ArrayList<Options> get_options() {return options; }
    public void options(ArrayList<Options> o) { options = o; }
}
