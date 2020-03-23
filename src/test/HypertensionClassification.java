package test;

public class HypertensionClassification {
	public String diagnose(int systolicBP, int diastolicBP) {
		if ( systolicBP < 120 && diastolicBP < 80 ) {
			return "至適血圧";
		}else if ( systolicBP < 130 && diastolicBP < 85 ) {
			return "正常血圧";
		}else if ( systolicBP >= 140 && diastolicBP < 90 ) {
			return "（孤立性）収縮期高血圧";
		}else if ( systolicBP >= 180 || diastolicBP >= 110 ) {
			return "Ⅲ度高血圧";
		}else if ( systolicBP >= 160 || diastolicBP >= 100 ) {
			return "II度高血圧";
		}else if ( systolicBP >= 140 || diastolicBP >= 90 ) {
			return "Ⅰ度高血圧";
		}else {
			return "正常高値血圧";
		}
	}
}
