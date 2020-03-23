package test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;


public class HypertensionClassificationTest {
	@Test
	public void 至適血圧のテスト() {
		int systolicBP	=119;
		int diastolicBP	=79;
		String expected = "至適血圧";
		
		HypertensionClassification	classifier = new HypertensionClassification();

		String actual;
		actual = classifier.diagnose(systolicBP, diastolicBP);
		assertThat(actual, is(expected));
	}
	@Test
	public void 正常血圧のテスト() {
		int systolicBP	=129;
		int diastolicBP	=79;
		String expected2 = "正常血圧";
		
		HypertensionClassification	classifier = new HypertensionClassification();
		

		String actual;
		actual = classifier.diagnose(systolicBP, diastolicBP);
		assertThat(actual, is(expected2));
	}
	@Test
	public void 正常高値血圧のテスト() {
		int systolicBP	=131;
		int diastolicBP	=79;
		String expected3 = "正常高値血圧";
		
		HypertensionClassification	classifier = new HypertensionClassification();
		

		String actual;
		actual = classifier.diagnose(systolicBP, diastolicBP);
		assertThat(actual, is(expected3));
	}
	@Test
	public void Ⅰ度高血圧のテスト() {
		int systolicBP	=142;
		int diastolicBP	=92;
		String expected4 = "Ⅰ度高血圧";
		
		HypertensionClassification	classifier = new HypertensionClassification();
		

		String actual;
		actual = classifier.diagnose(systolicBP, diastolicBP);
		assertThat(actual, is(expected4));
	}
	@Test
	public void II度高血圧のテスト() {
		int systolicBP	=170;
		int diastolicBP	=95;
		String expected5 = "II度高血圧";
		
		HypertensionClassification	classifier = new HypertensionClassification();
		

		String actual;
		actual = classifier.diagnose(systolicBP, diastolicBP);
		assertThat(actual, is(expected5));
	}
	@Test
	public void Ⅲ度高血圧のテスト() {
		int systolicBP	=180;
		int diastolicBP	=95;
		String expected6 = "Ⅲ度高血圧";
		
		HypertensionClassification	classifier = new HypertensionClassification();
		

		String actual;
		actual = classifier.diagnose(systolicBP, diastolicBP);
		assertThat(actual, is(expected6));
	}
	@Test
	public void 孤立性収縮期高血圧テスト() {
		int systolicBP	=140;
		int diastolicBP	=85;
		String expected7 = "（孤立性）収縮期高血圧";
		
		HypertensionClassification	classifier = new HypertensionClassification();
		

		String actual;
		actual = classifier.diagnose(systolicBP, diastolicBP);
		assertThat(actual, is(expected7));
	}
	
}

