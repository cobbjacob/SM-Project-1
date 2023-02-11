/**
 * This is the profile class where the student profiles are.
 * @author Jaison Prajapati
 */

public class Profile implements Comparable<Profile> {
    private String lname;
    private String fname;
    private Date dob; //use the Date class described in (f)

    public Profile(){

    }

    public Profile(String lname, String fname, Date dob){
        this.lname = lname;
        this.fname = fname;
        this.dob = dob;
    }

    //getters
    /**
     * Getter for profile last name
     * @return last name of the profile
     */
    public String getLname(){
        return lname;
    }

    /**
     * Getter for profile first name
     * @return fist name of the profile
     */
    public String getFname(){
        return fname;
    }

    /**
     * Getter for profile date of birth
     * @return date of birth of the profile
     */
    public Date getDob(){
        return dob;
    }

    //setters
    /**
     * Setter for profile last name
     * @param newLname which is set
     */
    public void setLname(String newLname){
        lname = newLname;
    }

    /**
     * Setter for profile first name
     * @param newFname which is set
     */
    public void setFname(String newFname){
        fname = newFname;
    }

    /**
     * Setter for profile date of birth
     * @param newDob which is set
     */
    public void setDob(Date newDob){
        dob = newDob;
    }

    @Override //NEED TO FINISH THIS
    public String toString(){
        // Return whatever string needed for this method.
        return "";
    }

    @Override // NEED TO FINISH THIS
    public boolean equals(Object obj){
        return true;
    }

    @Override //NEED TO FINISH THIS
    public int compareTo(Profile profile){
        return -1;
    }

}


