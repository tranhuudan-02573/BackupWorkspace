package OOP2;

public class Song {
	private String name;
	private String actor;
	private String genre;

	// constructor
	public Song(String name, String actor, String genre) {
		super();
		this.name = name;
		this.actor = actor;
		this.genre = genre;
	}

	// getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	// equals
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Song) {
			Song that = (Song) obj;
			return this.name.equals(that.name) && this.actor.equals(that.actor) && this.genre.equals(that.genre);
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "[name=" + name + ", actor=" + actor + ", genre=" + genre + "]";
	}

}
