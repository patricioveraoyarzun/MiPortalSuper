package arg.mps.seguros.broker.utils;

public class NumberUtil {

	public static Double getFloatAsDouble(Float fValue) {
	    return Double.parseDouble(fValue.toString());
	}
	
	public static double getFloatAsDouble(float value) {
		Float fValue = new Float(value);		
	    return getFloatAsDouble(fValue);
	}
}
