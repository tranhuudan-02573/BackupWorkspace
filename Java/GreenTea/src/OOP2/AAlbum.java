package OOP2;

public abstract class AAlbum {
	protected String title;
	protected int year;
	protected IMusicItems list;

	// constructor
	public AAlbum(String title, int year, IMusicItems list) {
		super();
		this.title = title;
		this.year = year;
		this.list = list;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AAlbum other = (AAlbum) obj;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[title=" + title + ", year=" + year + this.list.toString() + "]";
	}

	public double maxSize() {
		return this.list.maxSize();
	}

	public int totalTime() {
		return this.list.totalTime();
	}
	public IMusicItems thisActor(String actor) {
		return this.list.thisActor(actor);
	}

}
