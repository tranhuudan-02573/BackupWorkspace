package OOP2;

public class MTMusicItems implements IMusicItems {

	@Override
	public String toString() {
		return "";
	}

	@Override
	public double maxSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int totalTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	//
	// học thuộc

	@Override
	public IMusicItems sortByHitCounts() {
		// TODO Auto-generated method stub
		return new MTMusicItems();
	}

	@Override
	public IMusicItems insertHitCountsOrder(MusicItem that) {
		// TODO Auto-generated method stub
		return new ConsMusicItems(that, new MTMusicItems());
	}

	@Override
	public IMusicItems thisActor(String actor) {
		// TODO Auto-generated method stub
		return new MTMusicItems();
	}

}
