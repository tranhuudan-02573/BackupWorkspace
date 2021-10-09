package OOP2;

public class MusicItem {

	private File file;
	private int hitCounts;
	private String singer;
	private Song song;

	// constructor
	public MusicItem(File file, int hitCounts, String singer, Song song) {
		super();
		this.file = file;
		this.hitCounts = hitCounts;
		this.singer = singer;
		this.song = song;
	}

	// getter and setter
	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public int getHitCounts() {
		return hitCounts;
	}

	public void setHitCounts(int hitCounts) {
		this.hitCounts = hitCounts;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public Song getSong() {
		return song;
	}

	public void setSong(Song song) {
		this.song = song;
	}

	// equals

	@Override
	public String toString() {
		return "[" + this.file.toString() + ", hitCounts=" + hitCounts + ", singer=" + singer + ", song=" + song + "]";

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MusicItem other = (MusicItem) obj;
		if (file == null) {
			if (other.file != null)
				return false;
		} else if (!file.equals(other.file))
			return false;
		if (hitCounts != other.hitCounts)
			return false;
		if (singer == null) {
			if (other.singer != null)
				return false;
		} else if (!singer.equals(other.singer))
			return false;
		if (song == null) {
			if (other.song != null)
				return false;
		} else if (!song.equals(other.song))
			return false;
		return true;
	}

	public boolean lessFavouriteThan(MusicItem that) {
		return this.hitCounts < that.hitCounts;

	}

	public boolean shorterThan(MusicItem that) {
		return this.file.shorterThan(that.file);
	}

	public String favouriteRate() {
		if (this.hitCounts >= 40000)
			return "hot";
		else if (this.hitCounts >= 2000)
			return "popular";
		return "";

	}

	public double getSize() {
		return this.file.getSize();
	}

	public Duration getDuration() {
		return this.file.getDuration();
	}

	// học thuộc

	public boolean hasHitCountsShorterThan(MusicItem that) {
		// TODO Auto-generated method stub
		return this.hitCounts < that.hitCounts;
	}
	public String getActor() {
		return this.song.getActor();
	}

}
