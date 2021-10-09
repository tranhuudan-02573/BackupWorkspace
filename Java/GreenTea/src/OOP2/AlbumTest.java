package OOP2;

import junit.framework.TestCase;

public class AlbumTest extends TestCase {

	Duration d1 = new Duration(4, 48);
	Duration d2 = new Duration(4, 12);
	Duration d3 = new Duration(4, 36);
	Duration d4 = new Duration(4, 17);

	File f1 = new File("khatvong.mp3", 5043.0, d1);
	File f2 = new File("noigapem.mp3", 4230.0, d2);
	File f3 = new File("mebay.mp3", 5130.0, d3);
	File f4 = new File("saobien.mp3", 48711.0, d4);
	Song s1 = new Song("khat vong", "pham minh tuan", "cach mang");
	Song s2 = new Song("noi anh gap em", "hoang hiep", "tru tinh");
	Song s3 = new Song("con duong co la me bay", "hoang hiep", "cach mang");
	Song s4 = new Song("sao bien", "pham minh tuan", "tru tinh");

	MusicItem mc1 = new MusicItem(f1, 115350, "quang dung", s1);
	MusicItem mc2 = new MusicItem(f2, 2651, "my tam", s2);
	MusicItem mc3 = new MusicItem(f3, 198, "quang dung", s3);
	MusicItem mc4 = new MusicItem(f4, 5361, "quang dung", s4);

	IMusicItems mcs1 = new MTMusicItems();
	IMusicItems mcs2 = new ConsMusicItems(mc1, mcs1);
	IMusicItems mcs3 = new ConsMusicItems(mc2, mcs2);
	IMusicItems mcs4 = new ConsMusicItems(mc3, mcs3);
	IMusicItems mcs5 = new ConsMusicItems(mc4, mcs4);

	AAlbum a1 = new SingerAlbum("con duong co la me bay", 2011, "quang dung", mcs5);
	AAlbum a2 = new GeneralAlbum("noi anh gap em", 2013, mcs4);

	public void testConstructor() {
		System.out.println("testConstructor: " + "\n" + mcs5);

	}

	public void testLessFavouriteThan() {
		System.out.println("testLessFavouriteThan");
		System.out.println(mc1.lessFavouriteThan(mc2));

	}

	public void testShorterThan() {
		System.out.println("testShorterThan");
		System.out.println(mc1.shorterThan(mc3));

	}

	public void testFavouriteRate() {
		System.out.println("testFavouriteRate");
		System.out.println(mc1.favouriteRate());
	}

	public void testmaxSize() {
		System.out.println("testmaxSize");
		System.out.println(a1.maxSize());
	}

	public void testTotalTime() {
		System.out.println("testTotalTime");
		System.out.println(a1.totalTime());
	}

	public void testSortByHitCounts() {
		System.out.println("testSortByHitCounts");
		System.out.println(mcs5.sortByHitCounts());
	}
	public void testThisActor() {
		System.out.println("testThisActor");
		System.out.println(a1.thisActor("pham minh tuan"));
	}
	

}
