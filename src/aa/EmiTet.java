package aa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmiTet {
	public static void main(String[] args) {
        String firstInstDateStr = "2023-10-21";
        LocalDate firstInstDate = LocalDate.parse(firstInstDateStr);
        
        List<LocalDate> installmentDates = new ArrayList<>();
        
        // Calculate the next 18 installment dates where the day is 21
        LocalDate currentDate = firstInstDate;
        for (int i = 0; i < 18; i++) {
            while (currentDate.getDayOfMonth() != 21) {
                currentDate = currentDate.plusMonths(1);
            }
            installmentDates.add(currentDate);
            currentDate = currentDate.plusMonths(1);
        }
        
        // Print the result
        for (LocalDate date : installmentDates) {
            System.out.println(date);
        }
    }

}
