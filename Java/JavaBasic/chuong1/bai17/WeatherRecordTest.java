package bai17;

import junit.framework.TestCase;

public class WeatherRecordTest extends TestCase {
	public void testDate() {
		new Date(2, 1, 2002);
		new Date(11, 9, 1999);
	}
	public void testTemperatureRange() {
		new TemperatureRange(12, 45);
	}
	public void testWeatherRecord() {
		new WeatherRecord(new Date(2, 1, 2002), new TemperatureRange(14, 40), new TemperatureRange(16, 35),
		new TemperatureRange(22, 55), 2000);
	}

}
