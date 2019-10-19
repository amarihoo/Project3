package HardwareStore.Options;
import HardwareStore.CostConstants;
import HardwareStore.Tools.HardwareTool;

public class ProtectiveGear extends Options {

	public ProtectiveGear(HardwareTool t) {
		tool = t;
	}
	
	@Override
	public double rental_cost(int rental_period) {
		double price = tool.rental_cost(rental_period);
		return price + CostConstants.protective_cost;
	}


}