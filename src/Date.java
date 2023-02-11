/**
 * This is the date class where the current date is.
 * There are methods which also help to decide whether an input date is valid or not.
 * @author Jaison Prajapati
 */

import java.util.Calendar;
public class Date implements Comparable<Date> {
    private int year;
    private int month;
    private int day;

    public Date() {
        Calendar todayDate = Calendar.getInstance();
        day = todayDate.get(Calendar.DAY_OF_MONTH);
        month = todayDate.get(Calendar.MONTH) + 1;
        year = todayDate.get(Calendar.YEAR);
    } //create an object with today’s date (see Calendar class)

    public Date(String date) {
        String[] inputDate = date.split("/");
        month = Integer.parseInt(inputDate[0]);
        day = Integer.parseInt(inputDate[1]);
        year = Integer.parseInt(inputDate[2]);

    } //take “mm/dd/yyyy” and create a Date object

    public boolean isValid() {
        if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && (day < 1 || day > 31)){
            return false;
        }
        if((month == 4|| month == 6 || month == 9 || month == 11) && (day < 1 || day > 30)){
            return false;
        }
        if(month < 1 || month > 12){
            return false;
        }
        if(leapYear() == true){
            if(month == 2 && (day < 1 || day > 29)) {
                return false;
            }
        }
        if(leapYear() == false){
            if(month == 2 && (day < 1 || day > 28)) {
                return false;
            }
        }
        return true;
    } //check if a date is a valid calendar date

    public boolean age(Date student) {
        Date today = new Date();
        if(today.getYear() - student.getYear() < 16){
            return false;
        }else if(today.getYear() - student.getYear() == 16 && today.getMonth() - student.getMonth() < 0){
            return false;
        }else if(today.getYear() - student.getYear() == 16 && today.getDay() - student.getDay() < 0){
            return false;
        }else{
            return true;
        }
    }

    public boolean leapYear(){
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    return true;
                }else{
                    return false;
                }
            }else{
                return true;
            }
        }else{
            return false;
        }
    }

    /**
     * Getter for year
     * @return the current year
     */
    public int getYear(){
        return year;
    }

    /**
     * Getter for month
     * @return the current month
     */
    public int getMonth(){
        return month;
    }

    /**
     * Getter for day
     * @return the current day
     */
    public int getDay(){
        return day;
    }

    /**
     * Setter for year
     * @param year which is set
     */
    public void setYear(int year){
        this.year = year;
    }

    /**
     * Setter for month
     * @param month which is set
     */
    public void setMonth(int month){
        this.month = month;
    }

    /**
     * Setter for day
     * @param day which is set
     */
    public void setDay(int day){
        this.day = day;
    }

    @Override
    public String toString(){
        // Return whatever string needed for this method.
        return Integer.toString(month) + '/' + Integer.toString(day) + '/' + Integer.toString(year);
    }

    @Override //NEED TO FINISH THIS
    public boolean equals(Object obj){
        return true;
    }

    @Override // NEED TO FINISH THIS
    public int compareTo(Date date){
        return -1;
    }
}
