package HardwareStore.Tools;
import java.util.*;
import HardwareStore.CostConstants;

public class WoodworkTool extends HardwareTool {

	public WoodworkTool(String named) {
		unique_name = named;
		//rental_rate = CostConstants.woodwork_rate;
	}

	public double rental_cost(int rental_period) {
		
		return rental_period * CostConstants.woodwork_rate;
	}

}
