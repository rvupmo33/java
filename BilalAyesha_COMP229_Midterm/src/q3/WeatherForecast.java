package q3;

public class WeatherForecast extends ProvincialWeather {
	
	private String location;
	private double longitude;
	private double latitude;
	private double temperature;
	private double humidity;
	
	public WeatherForecast(String province, String date, int noOfDistricts, String location, double longitude, double latitude, double temperature, double humidity) {
		super(province, date, noOfDistricts);
		this.location = location;
		this.longitude = longitude;
		this.latitude = latitude;
		this.temperature = temperature;
		this.humidity = humidity;
	}
	
    @Override
    public void printLine() {
    	// super.printLine(); I am not sure if base properties are needed since it does not specify in question
        System.out.println(" Location: " + location + " Longitude: " + longitude + " Latitude: " + latitude + " Temperature: " + temperature + " Humidity: " + humidity);
    }
    
    @Override
    public void printWeatherDetails() {
        super.printWeatherDetails();
        System.out.println("Location: " + location);
        System.out.println("Longitude: " + longitude);
        System.out.println("Latitude: " + latitude);
        System.out.println("Temperature: " + temperature);
        System.out.println("Humidity: " + humidity);
    }

}
