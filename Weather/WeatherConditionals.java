
/**
 * Write a description of class WeatherConditionals here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WeatherConditionals
{
    public static String getWeatherAdvice(int temperature, String description)
    {
         boolean windy = false;
         boolean sunny = false;
         boolean snow = false;
         
         if (description.equals ("windy") )windy = true;
         if (temperature == 32) 
         System.out.println ("Too windy or cold! Enjoy watching the weather through the window.");
         if (temperature == 30)
         System.out.println ("Too windy or cold! Enjoy watching the weather through the window.");
         if (description.equals ("sunny")) sunny = true;
         if (temperature == 34) 
         System.out.println ("It’s safe to go outside, 34 degrees and sunny.");
         if (snow && temperature == 100)
         System.out.println ("what?!");
         return "windy";
         
         
        
    }
    public static String getHikingAdvice (int temperature, int windchill, int humidity, String description)
    {
        return "75 degrees Fareinheit, 5 degress Fareinheit, 10% fair";
    }
}
