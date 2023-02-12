/**
 * This is the roster class where the students are stored.
 * Helper methods are made to sort the students in different ways.
 * @author Jaison Prajapati
 */

public class Roster {
    private Student[] roster;
    private int size;
    private int find(Student student){ //search the given student in roster
        for(int i = 0; i < roster.length; i++){
            if(roster[i] == student){
                return i;
            }
        }
        return -1;
    }
    private void grow(){ //increase the array capacity by 4
        if(roster == null){
            Student[] newRoster = new Student[4];
            roster = newRoster;
        }else{
            Student[] newRoster = new Student[roster.length + 4];
            for(int i = 0; i < roster.length; i++){
                newRoster[i] = roster [i];
            }
            roster = newRoster;
        }
    }
    public boolean add(Student student){ //add student to end of array
        if(roster == null){
            grow();
        }
        for(int i = 0; i < roster.length; i++){
            if(roster[i] == null){
                roster[i] = student;
                return true;
            }
        }
        return false;
    }
    public boolean remove(Student student){ //maintain the order after remove
        for(int i = 0; i < roster.length; i++){
            if(roster[i] == student){
                roster[i] = roster[i+1];
                return true;
            }
        }
        return false;
    }
    public boolean contains(Student student){ //if the student is in roster
        if(roster == null){
            return false;
        }
        for(int i = 0; i < roster.length; i++){
            if(roster[i] == null){
                return false;
            }else{
                if(roster[i].getProfile().getFname().equalsIgnoreCase(student.getProfile().getFname()) == true &&
                        roster[i].getProfile().getLname().equalsIgnoreCase(student.getProfile().getLname()) == true &&
                        roster[i].getProfile().getDob().getDay() == student.getProfile().getDob().getDay() &&
                        roster[i].getProfile().getDob().getMonth() == student.getProfile().getDob().getMonth() &&
                        roster[i].getProfile().getDob().getYear() == student.getProfile().getDob().getYear()){
                    return true;
                }
            }
        }
        return false;
    }
    public void print(){ //print roster sorted by profiles
        if(roster == null){
            System.out.println("Student roster is empty!");
        }
    }
    public void printBySchoolMajor(){ //print roster sorted by school major
        if(roster == null){
            System.out.println("Student roster is empty!");
        }
    }
    public void printByStanding(){ //print roster sorted by standing
        if(roster == null){
            System.out.println("Student roster is empty!");
        }
    }
}
