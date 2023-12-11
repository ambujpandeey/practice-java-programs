package aa;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewEmiCalculate2 {
	public static void main(String[] args) {

        String dateStr = "2023-10-23";

        LocalDate firstInstDate = LocalDate.parse(dateStr);
        int day = firstInstDate.getDayOfMonth();

        if (day < 1 || day > 31) {
            System.out.println("Invalid day extracted from the date.");
            return;
        }

        List<Date> installmentDates = new ArrayList<>();

        // Calculate the next 18 installment dates with the dynamic day
        LocalDate currentDate = firstInstDate;
        for (int i = 0; i < 18; i++) {
            while (currentDate.getDayOfMonth() != day) {
                currentDate = currentDate.plusMonths(1);
            }
            Date sqlDate = Date.valueOf(currentDate);
            installmentDates.add(sqlDate);
            currentDate = currentDate.plusMonths(1);
        }

        // Print the result
        for (Date date : installmentDates) {
            System.out.println(date);
        }
        
        
    }

}
