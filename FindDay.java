package HackerRank;


import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class FindDay {
//	Scanner scan = new Scanner(System.in);
//	
//	int month = scan.nextInt();
//	int day = scan.nextInt();
//	int year = scan.nextInt();
//	
    //public static String findDay(int month, int day, int year) {
	public static void main(String[] args) {
		
		Calendar data = Calendar.getInstance();
		data.set(2020, 0, 8);
		
		String nomeDia = "";
		int dia = data.get(Calendar.DAY_OF_WEEK);
		
		switch(dia) {
			case Calendar.SUNDAY: nomeDia = "SUNDAY";break;
			case Calendar.MONDAY: nomeDia = "MONDAY";break;
			case Calendar.TUESDAY: nomeDia = "TUESDAY";break;
			case Calendar.WEDNESDAY: nomeDia = "WEDNESDAY";break;
			case Calendar.THURSDAY: nomeDia = "THURSDAY";break;
			case Calendar.FRIDAY: nomeDia = "FRIDAY";break;
			case Calendar.SATURDAY: nomeDia = "SATURDAY";break;
		}
		
		System.out.println(nomeDia);
		
		

    }
}
