package q3;

public class RainForecast extends ProvincialWeather {
	
	private String location;
	private double longitude;
	private double latitude;
	private double rainfall;

	public RainForecast(String province, String date, int noOfDistricts, String location, double longitude, double latitude, double rainfall) {
		super(province, date, noOfDistricts);
		this.location = location;
		this.longitude = longitude;
		this.latitude = latitude;
		this.rainfall = rainfall;
	}
	
    @Override
    public void printLine() {
    	// super.printLine(); I am not sure if base properties are needed since it does not specify in question
        System.out.println(" Location: " + location + " Longitude: " + longitude + " Latitude: " + latitude + " Rainfall: " + rainfall + " mm");
    }
    
    @Override
    public void printWeatherDetails() {
        super.printWeatherDetails();
        System.out.println("Location: " + location);
        System.out.println("Longitude: " + longitude);
        System.out.println("Latitude: " + latitude);
        System.out.println("Rainfall: " + rainfall + " mm");
    }

}
