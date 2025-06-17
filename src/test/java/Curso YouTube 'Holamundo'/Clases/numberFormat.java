import java.text.NumberFormat;
import java.util.Locale;

public class numberFormat {
    public static void main(String[] args) {
        Locale locale = Locale.forLanguageTag("es-ES");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale); // This NumberFormat's method allows us to format numbers as currency according to the specified locale.
        String result = numberFormat.format(3000); 
        System.out.println("Formatted number: " + result);

        NumberFormat percentage = NumberFormat.getPercentInstance(); 
        System.out.println(percentage.format(0.35));// This NumberFormat's method allows us to format numbers as percentage.
    }
}

