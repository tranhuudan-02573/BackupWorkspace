package bai33;

public class WeatherRecord { // ghi chép thời tiết
	private Date d; // ngày
	private TemperatureRange normal; // nhiệt độ bình thường 
	private TemperatureRange today; // nhiệt độ hôm nay 
	private TemperatureRange record; // nhiệt độ ghi được
	private double precipitation; // lượng mưa
	// contructor
	public WeatherRecord(Date d, TemperatureRange normal, TemperatureRange today, TemperatureRange record,
double precipitation) {
		super();
		this.d = d;
		this.normal = normal;
		this.today = today;
		this.record = record;
		this.precipitation = precipitation;
	}
	// getter and setter
		public Date getD() {
		return d;
	}
	public void setD(Date d) {
		this.d = d;
	}
	public TemperatureRange getNormal() {
		return normal;
	}
	public void setNormal(TemperatureRange normal) {
		this.normal = normal;
	}
	public TemperatureRange getToday() {
		return today;
	}
	public void setToday(TemperatureRange today) {
		this.today = today;
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
	// kiểm tra nhiệt độ trong ngày có được bình thường không
	public boolean withinRange() { 
		return this.today.within(this.normal);
	}
	// so sánh lượng mưa của hôm nay có cao hơn lượng mưa của ngày hôm trước không
	public boolean rainyDay(WeatherRecord that) { 
		return this.precipitation >= that.precipitation;
	}
	// kiểm tra lượng mưa hôm nay có ghi được kỉ lục cao nhất hay thấp nhất so với những ngày hôm trước không
	public boolean recordDay() { 
		return !this.today.within(this.record);
	}
	
	
}
