import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Drumstyle92
 * class that contains the core of the program.
 */
public class Tester {
    /**
     * @param args main parameter.
     * Main method with a date, a given zone and printouts inside.
     */
    public static void main(String[] args) {
        // Creation of the date
        LocalDateTime today = LocalDateTime.now();
        // Date format
        DateTimeFormatter todayFormat = DateTimeFormatter.ofPattern("dd LLLL yy hh:mm");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Today: " + today.format(todayFormat));
        // creation of the data zone
        ZonedDateTime todayZonedDate = ZonedDateTime.now();
        System.out.println("----------------------------------------------------------------");
        System.out.println("Today's date zone: " + todayZonedDate.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
    }
}
