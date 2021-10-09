package bai5_11;

public class Mail {
	private String from;
	private Date date;
	private String message;
	// constructor
	public Mail(String from, Date date, String message) {
		this.from = from;
		this.date = date;
		this.message = message;
	}
	// getter and setter
	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean compareDate(Mail that) {
		return this.date.compareDate(that.date);
	}

	public String getDate() {
		return this.date.getDate();
	}
}
