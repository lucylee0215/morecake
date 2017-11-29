
/**
 * Write a description of class StringTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringTester
{
    // instance variables - replace the example below with your own
    public static void main(String [] args)
    {

        String weatherCondition = "";
        weatherCondition = "mixed rain and snow";
        weatherCondition.length ();
        System.out.println(weatherCondition.substring(0,5));

        System.out.println(WeatherConditionals.getWeatherAdvice(32, " heavy snow"));
    }

}
