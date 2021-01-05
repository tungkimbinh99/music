package utils;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Convert extends Date {
    public Convert(int year, int month, int day) {
        super(year, month, day);
    }

    public static Date toDate(String date){
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        try {
            // Convert from String to Date
            java.util.Date startDate = df.parse(date);
            System.out.println("date: " + startDate.getTime());
            System.out.println("convert date: " + new Date(startDate.getTime()));
            return new Date(startDate.getTime());
        } catch (Exception ex) {

        }
        return new Date(new java.util.Date().getTime());
    }
}
