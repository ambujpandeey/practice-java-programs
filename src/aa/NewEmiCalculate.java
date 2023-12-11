package aa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewEmiCalculate {
	public static void main(String[] args) throws ParseException {

		String dateStr = "2023-10-21";

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date firstInstDate = sdf.parse(dateStr);

		int day = firstInstDate.getDate();

		List<Date> installmentDates = new ArrayList<>();

		// Calculate the next 18 installment dates with the dynamic day
		Date currentDate = firstInstDate;
		for (int i = 0; i < 18; i++) {
			while (currentDate.getDate() != day) {
				currentDate.setMonth(currentDate.getMonth() + 1);
			}
			Date nextInstDate = new Date(currentDate.getTime());
			installmentDates.add(nextInstDate);
			currentDate.setMonth(currentDate.getMonth() + 1);
		}

		// Print the result
		for (Date date : installmentDates) {
			System.out.println(sdf.format(date));
		}
	}
}
