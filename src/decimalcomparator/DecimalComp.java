package decimalcomparator;

import java.text.DecimalFormat;

public class DecimalComp {

	public static boolean areEqualByThreeDecimalPlaces(double x, double y) {

		double xResult = Math.round(x * 1000d) / 1000d;
		double yResult = Math.round(y * 1000d) / 1000d;

		if (xResult == yResult) {
			return true;
		} else {
			return false;
		}

	}

}
