package HardwareStore.Options;
import HardwareStore.CostConstants;
import HardwareStore.Tools.HardwareTool;

import java.util.*;

public class ExtensionCord extends Options {

	public ExtensionCord(HardwareTool t) {
		tool = t;
	}
	
	@Override
	public double rental_cost(int rental_period) {
		double price = tool.rental_cost(rental_period);
		return price + CostConstants.extension_cost;
	}

}
