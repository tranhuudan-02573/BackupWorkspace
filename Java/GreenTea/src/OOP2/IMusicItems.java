package OOP2;

public interface IMusicItems {

	public double maxSize();

	public int totalTime();
	//

	// học thuộc

	public IMusicItems sortByHitCounts();

	public IMusicItems insertHitCountsOrder(MusicItem that);

	public IMusicItems thisActor(String actor);

}
