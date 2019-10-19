package HardwareStore.Tools;
import java.util.*;
import HardwareStore.CostConstants;

public class PaintingTool extends HardwareTool {
	
	public PaintingTool(String named) {
		unique_name = named;
		//rental_rate = CostConstants.concrete_rate;
    }
	
	public double rental_cost(int rental_period) {
		
		return rental_period * CostConstants.painting_rate;
	}

}
