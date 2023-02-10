import java.util.Calendar;
public class Date implements Comparable<Date> {
    private int year;
    private int month;
    private int day;

    public Date() {
        Calendar todayDate = Calendar.getInstance();
        day = todayDate.get(Calendar.date);
        month = todayDate.get(Calendar.hour);
        year = todayDate.get(Calendar.year);
    } //create an object with today’s date (see Calendar class)

    public Date(String date) {
        month = Integer.parseInt(date.substring(0,1));
        day = Integer.parseInt(date.substring(3,4));
        year = Integer.parseInt(date.substring(6,9));

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

    @Override
    public String toString(){
        // Return whatever string needed for this method.
        return "";
    }

    @Override
    public boolean equals(Object obj){

    }

    @Override
    public boolean compareTo(Date date){

    }
}
