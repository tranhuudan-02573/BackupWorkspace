package OOP2;

public class ConsMusicItems implements IMusicItems {
	private MusicItem first;
	private IMusicItems rest;

	// constructor
	public ConsMusicItems(MusicItem first, IMusicItems rest) {
		super();
		this.first = first;
		this.rest = rest;
	}

	// getter and setter
	public MusicItem getFirst() {
		return first;
	}

	public void setFirst(MusicItem first) {
		this.first = first;
	}

	public IMusicItems getRest() {
		return rest;
	}

	public void setRest(IMusicItems rest) {
		this.rest = rest;
	}

	@Override
	public String toString() {
		return this.first.toString() + "\n" + this.rest.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConsMusicItems other = (ConsMusicItems) obj;
		if (first == null) {
			if (other.first != null)
				return false;
		} else if (!first.equals(other.first))
			return false;
		if (rest == null) {
			if (other.rest != null)
				return false;
		} else if (!rest.equals(other.rest))
			return false;
		return true;
	}

	public double maxSize() {
		return Math.max(this.first.getSize(), this.rest.maxSize());
	}

	public int totalTime() {
		return this.first.getDuration().change() + this.rest.totalTime();
	}

	// học thuộc

	// so sánh
	public IMusicItems sortByHitCounts() {
		return (this.rest.sortByHitCounts()).insertHitCountsOrder(this.first);
	}

	// kiểm tra và in ra danh sách theo khoảng cách
	public IMusicItems insertHitCountsOrder(MusicItem that) {
		if (that.hasHitCountsShorterThan(this.first))
			return new ConsMusicItems(that, this);
		return new ConsMusicItems(this.first, this.rest.insertHitCountsOrder(that));

	}

	public IMusicItems thisActor(String actor) {
		if (this.first.getActor().equals(actor))
			return new ConsMusicItems(this.first, this.rest.thisActor(actor));
		return this.rest.thisActor(actor);

	}

}
