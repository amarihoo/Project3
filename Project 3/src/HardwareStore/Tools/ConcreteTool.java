package HardwareStore.Tools;
import HardwareStore.CostConstants;

public class ConcreteTool extends HardwareTool {

	public ConcreteTool(String named) {
        unique_name = named;
        //rental_rate = CostConstants.concrete_rate;
    }

	public double rental_cost(int rental_period) {
		
		return rental_period * CostConstants.concrete_rate;
	}

}
