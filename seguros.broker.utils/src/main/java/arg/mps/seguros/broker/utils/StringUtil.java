package arg.mps.seguros.broker.utils;

import org.apache.commons.lang3.StringUtils;

public class StringUtil {

	public static boolean isNullOrEmpty(String string) {
		return string == null || string.length() == 0;
	}
	
	public static boolean isNumber(String nroStr) {
		return StringUtils.isNumeric(nroStr);
	}
}
