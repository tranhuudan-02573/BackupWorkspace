package bai5_14;

import junit.framework.TestCase;

public class RiverTest extends TestCase {

	public void testMaxLength() {
		ARiver s = new Source(new Location(1, 1, "s"), 120.0D);
		ARiver t = new Source(new Location(1, 5, "t"), 50.0D);
		ARiver u = new Source(new Location(3, 7, "u"), 100.0D);
		ARiver b = new Confluence(new Location(3, 3, "b"), 60.0D, s, t);
		ARiver a = new Confluence(new Location(5, 5, "a"), 30.0D, b, u);
		IListRiver empty = new MTListRiver();
		ConsListRiver l1 = new ConsListRiver(s, empty);
		ConsListRiver l2 = new ConsListRiver(t, l1);
		ConsListRiver l3 = new ConsListRiver(u, l2);
		ConsListRiver l4 = new ConsListRiver(b, l3);
		ConsListRiver l5 = new ConsListRiver(a, l4);
		assertEquals(l5.maxLength(), 120.0D, 0.01D);
	}

	public void testConfluences() {
		ARiver s = new Source(new Location(1, 1, "s"), 120.0D);
		ARiver t = new Source(new Location(1, 5, "t"), 50.0D);
		ARiver u = new Source(new Location(3, 7, "u"), 100.0D);
		ARiver b = new Confluence(new Location(3, 3, "b"), 60.0D, s, t);
		ARiver a = new Confluence(new Location(5, 5, "a"), 30.0D, b, u);
		IListRiver empty = new MTListRiver();
		ConsListRiver l1 = new ConsListRiver(s, empty);
		ConsListRiver l2 = new ConsListRiver(t, l1);
		ConsListRiver l3 = new ConsListRiver(u, l2);
		ConsListRiver l4 = new ConsListRiver(b, l3);
		ConsListRiver l5 = new ConsListRiver(a, l4);
		assertEquals(l5.confluences(), 2);
	}

	public void testIListLocation() {
		ARiver s = new Source(new Location(1, 1, "s"), 120.0D);
		ARiver t = new Source(new Location(1, 5, "t"), 50.0D);
		ARiver u = new Source(new Location(3, 7, "u"), 100.0D);
		ARiver b = new Confluence(new Location(3, 3, "b"), 60.0D, s, t);
		ARiver a = new Confluence(new Location(5, 5, "a"), 30.0D, b, u);
		IListRiver empty = new MTListRiver();
		ConsListRiver l1 = new ConsListRiver(s, empty);
		ConsListRiver l2 = new ConsListRiver(t, l1);
		ConsListRiver l3 = new ConsListRiver(u, l2);
		ConsListRiver l4 = new ConsListRiver(b, l3);
		ConsListRiver l5 = new ConsListRiver(a, l4);
		Mouth m = new Mouth(new Location(7, 5, "m"), a);
		new ConsListLocation(m.getLocation(), l5.getLocation());
	}
}
