package bai33;

import junit.framework.TestCase;

public class WeatherRecordTest extends TestCase {
	 Date date1 = new Date(6, 8, 2020);
	 Date date2 = new Date(6, 10, 2002);
	 TemperatureRange temper1 = new TemperatureRange(26, 31);
	 TemperatureRange temper2 = new TemperatureRange(28, 35);
	 TemperatureRange temper3 = new TemperatureRange(27, 33);
	 WeatherRecord weather1 = new  WeatherRecord(date1, temper1, temper2, temper3, 335 );
	 WeatherRecord weather2 = new WeatherRecord(date2, temper2 , temper1, temper2, 377);
	 public void testWithinRange() {
		 assertFalse(temper1.within(temper2));
	 }
	 public void testRainyDay() {
		 assertTrue(weather2.rainyDay(weather1));
	}
	 public void testRecordDay() {
		 assertTrue(weather1.recordDay());
	 }
	 
	 
	 
	 
}
