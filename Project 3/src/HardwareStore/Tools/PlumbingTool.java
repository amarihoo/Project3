package HardwareStore.Tools;
import java.util.*;
import HardwareStore.CostConstants;

public class PlumbingTool extends HardwareTool {

	public PlumbingTool(String named){
		unique_name = named;
		//rental_rate = CostConstants.plumbing_rate;
		
	}
	
	public double rental_cost(int rental_period) {
		
		return rental_period * CostConstants.plumbing_rate;
	}
	

	

}
