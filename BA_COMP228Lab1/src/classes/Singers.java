package classes;

public class Singers {
	private int singerId;
	private String singerName;
	private String singerAddress;
	private String singerDateOfBirth;
	private int singerPublishedAlbums;
	
	public Singers() {
		
	}
	
	public Singers(int sId) {
		singerId = sId;
	}
	
	public Singers(int sId, String sName) {
		singerId = sId;
		singerName = sName;
	}
	
	public Singers(int sId, String sName, String sAddress) {
		singerId = sId;
		singerName = sName;
		singerAddress = sAddress;
	}
	
	public Singers(int sId, String sName, String sAddress, String sDOB) {
		singerId = sId;
		singerName = sName;
		singerAddress = sAddress;
		singerDateOfBirth = sDOB;
	}
	
	public Singers(int sId, String sName, String sAddress, String sDOB, int sAlbums) {
		singerId = sId;
		singerName = sName;
		singerAddress = sAddress;
		singerDateOfBirth = sDOB;
		singerPublishedAlbums = sAlbums;
	}
	
	public int getID() {
		return singerId;
	}
	
	public void setID(int sId) {
		singerId = sId;
	}
	
	public String getName() {
		return singerName;
	}
	
	public void setName(String sName) {
		singerName = sName;
	}
	
	public String getAddress() {
		return singerAddress;
	}
	
	public void setAddress(String sAddress) {
		singerAddress = sAddress;
	}
	
	public String getDOB() {
		return singerDateOfBirth;
	}
	
	public void setDOB(String sDOB) {
		singerDateOfBirth = sDOB;
	}
	
	public int getAlbums() {
		return singerPublishedAlbums;
	}
	
	public void setAlbums(int sAlbums) {
		singerPublishedAlbums = sAlbums;
	}
	
	public void setAllValues(int sId, String sName, String sAddress, String sDOB, int sAlbums) {
		singerId = sId;
		singerName = sName;
		singerAddress = sAddress;
		singerDateOfBirth = sDOB;
		singerPublishedAlbums = sAlbums;

	}
	
	
}
