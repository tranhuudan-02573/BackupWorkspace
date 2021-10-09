package bai5_4;

import junit.framework.TestCase;

public class AncestorTreeTest extends TestCase {
	public void testAncestorTree() {
		Parents p1 = new Parents("tran huu a", 1890);
		Parents p2 = new Parents("tran huu b", 1880);
		Parents p3 = new Parents("tran huu c", 1900);
		
		
		Father f1 = new Father(p1);
		Mother f3 = new Mother(p2);
		Father f2 = new Father(p3);
		
		
		IAncestorTree a1 = new MTAncestorTree();
		IAncestorTree a2 = new ConsAncestorTree(f1, a1);
		IAncestorTree a3 = new ConsAncestorTree(f3, a2);
		
		System.out.println("so do gia pha\nme: " + p3);
		System.out.println(a3);
		
		
	}

}
