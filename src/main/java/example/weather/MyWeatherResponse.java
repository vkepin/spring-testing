package example.weather;

public class MyWeatherResponse
{
    private String weather;

    public MyWeatherResponse()
    {
    }

    public MyWeatherResponse(String weather)
    {
        this.weather = weather;
    }

    public String getWeather()
    {
        return weather;
    }

    public void setWeather(String weather)
    {
        this.weather = weather;
    }
}
