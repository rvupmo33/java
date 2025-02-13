package q3;

public abstract class ProvincialWeather implements IWeatherReport {
	private String province;
	private String date;
	private int noOfDistricts;
	
	public ProvincialWeather(String province, String date, int noOfDistricts) {
		this.province = province;
		this.date = date;
		this.noOfDistricts = noOfDistricts;
	}
	
	@Override
	public void printLine() {
		System.out.println("Province: " + province + " Date: " + date + " Number of districts: " + noOfDistricts);
	}
	 
	@Override
	public void printWeatherDetails() {
		System.out.println("Province: " + province);
		System.out.println("Date: " + date);
		System.out.println("Number of districts: " + noOfDistricts);
	}
	
}
