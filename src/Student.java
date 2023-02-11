/**
 * This is the student class where the student objects are created.
 * @author Jaison Prajapati
 */

public class Student implements Comparable<Student> {
    private Profile profile;
    private Major major; //Major is an enum type
    private int creditCompleted;

    public Student(Profile profile, Major major, int creditCompleted){
        this.profile = profile;
        this.major = major;
        this.creditCompleted = creditCompleted;
    }

    public enum Major{

    }

    //getters
    /**
     * Getter for major
     * @return the student's major
     */
    public Major getMajor(){
        return major;
    }

    /**
     * Getter for the credits completed
     * @return the student's credits completed
     */
    public int getCreditCompleted(){
        return creditCompleted;
    }

    //setters
    /**
     * Setter for new major
     * @param newMajor which is set
     */
    public void setMajor(Major newMajor){
        major = newMajor;
    }

    /**
     * Setter for credits completed
     * @param newCreditCompleted which is set
     */
    public void setCreditCompleted(int newCreditCompleted){
        creditCompleted = newCreditCompleted;
    }

    @Override //NEED TO FINISH THIS
    public String toString(){
        // Return whatever string needed for this method.
        return "";
    }

    @Override //NEED TO FINISH THIS
    public boolean equals(Object obj){
        return false;
    }

    @Override //NEED TO FINISH THIS
    public int compareTo(Student student){
        return -1;
    }

}

