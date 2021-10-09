package bai45;

public interface IGallery {
	public double timeToDownload(double networkSpeed);
	public boolean smallerThan(int maximumSize);
	public boolean sameName(String givenName);
	
}
