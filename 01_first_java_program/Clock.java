import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        String formattedDateTime = now.format(formatter);

        System.out.printf("The current time is %s \n", formattedDateTime);
    }
}