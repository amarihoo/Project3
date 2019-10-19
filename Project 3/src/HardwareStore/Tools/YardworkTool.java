package HardwareStore.Tools;
import java.util.*;
import HardwareStore.CostConstants;

public class YardworkTool extends HardwareTool {

	public YardworkTool(String named) {
		unique_name = named;
		//rental_rate = CostConstants.yardwork_rate;
		
	}

	public double rental_cost(int rental_period) {
		
		return rental_period * CostConstants.yardwork_rate;
	}


}
