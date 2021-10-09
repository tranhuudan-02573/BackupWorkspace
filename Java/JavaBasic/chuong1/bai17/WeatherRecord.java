package bai17;

public class WeatherRecord { // ghi chép thời tiết
	private Date date; // thời gian
	private TemperatureRange today; // nhiệt độ trong ngày 
	private TemperatureRange normal; // nhiệt độ bình thường 
	private TemperatureRange record; // nhiệt độ ghi được
	private double precipitation; // lượng mưa
	// contructor
	public WeatherRecord(Date date, TemperatureRange today, TemperatureRange normal, TemperatureRange record, double precipitation) {
		this.date = date;
		this.today = today;
		this.normal = normal;
		this.record = record;
		this.precipitation = precipitation;
	}
	// getter and setter
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public TemperatureRange getToday() {
		return today;
	}
	public void setToday(TemperatureRange today) {
		this.today = today;
	}
	public TemperatureRange getNormal() {
		return normal;
	}
	public void setNormal(TemperatureRange normal) {
		this.normal = normal;
	}
	public TemperatureRange getRecord() {
		return record;
	}
	public void setRecord(TemperatureRange record) {
		this.record = record;
	}
	public double getPrecipitation() {
		return precipitation;
	}
	public void setPrecipitation(double precipitation) {
		this.precipitation = precipitation;
	}
	
	
}
