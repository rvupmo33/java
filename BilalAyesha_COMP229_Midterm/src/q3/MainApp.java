package q3;
import java.util.ArrayList;
import java.util.Collection;

public class MainApp {

	public static void main(String[] args) {
		
        Collection<IWeatherReport> weatherReports = new ArrayList<>();

        RainForecast rainForecast1 = new RainForecast("Ontario", "2024-10-19", 15, "Toronto", -79.3832, 43.6532, 30.5);
        RainForecast rainForecast2 = new RainForecast("Quebec", "2024-10-19", 12, "Montreal", -73.5673, 45.5017, 22.7);
        WeatherForecast weatherForecast1 = new WeatherForecast("Manitoba", "2024-10-19", 10, "Winnipeg", -97.1384, 49.8951, 20.3, 60.2);
        WeatherForecast weatherForecast2 = new WeatherForecast("Albeta", "2024-10-19", 8, "Calgary", -114.0719, 51.0447, 18.6, 55.3);

        weatherReports.add(rainForecast1);
        weatherReports.add(rainForecast2);
        weatherReports.add(weatherForecast1);
        weatherReports.add(weatherForecast2);

	}

}
