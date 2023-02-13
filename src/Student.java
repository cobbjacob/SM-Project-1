/**
 * This is the student class where the student objects are created.
 * @author Jaison Prajapati
 */

public class Student implements Comparable<Student> {
    private Profile profile;
    private Major major; //Major is an enum type
    private int creditCompleted;

    /**
     * This is the method which makes student objects with a passed in profile, major, and credits completed.
     * @param profile This is the profile which is passed in.
     * @param major This is the major which is passed in.
     * @param creditCompleted This is the number of credits completed which is passed in.
     */
    public Student(Profile profile, Major major, int creditCompleted){
        this.profile = profile;
        this.major = major;
        this.creditCompleted = creditCompleted;
    }

    /**
     * This is the method to make a student object with only a profile.
     * @param profile This is the passed in profile.
     */
    public Student(Profile profile){
        this.profile = profile;
    }

    /**
     * This is the enum method for the majors and their class code and school.
     */
    public enum Major{
        CS ("01:198", "SAS"),
        MATH ("01:640", "SAS"),
        EE ("14:332", "SOE"),
        ITI ("04:547", "SC&I"),
        BAIT ("33:136", "RBS");
        String code;
        String school;
        Major(String c, String s){
            code = c;
            school = s;

        }
    }

    /**
     * This is a helper method which tells you which year a student is.
     * @return Returns a string of the type of student they are.
     */
    public String standing(){
        if(creditCompleted < 30){
            return "Freshman";
        }else if(creditCompleted >= 30 && creditCompleted < 60){
            return "Sophomore";
        }else if(creditCompleted >= 60 && creditCompleted < 90 ){
            return "Junior";
        }else{
            return "Senior";
        }
    }

    //getters
    /**
     * Getter for profile
     * @return the student's profile
     */
    public Profile getProfile(){
        return profile;
    }

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
     * Setter for new profile
     * @param newProfile which is set
     */
    public void setProfile(Profile newProfile){
        profile = newProfile;
    }

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

    /**
     * This overrides the toString method for the Student object.
     * @return This returns a string value of the student object.
     */
    @Override //NEED TO FINISH THIS
    public String toString(){
        // Return whatever string needed for this method.
        return "";
    }

    /**
     * This overrides the equals method for the student object.
     * @param oStudent This is the student which is passed in.
     * @return Returns true if they are the same and false if they are different.
     */
    @Override
    public boolean equals(Object oStudent){
        if (oStudent instanceof Student student){
            boolean oProfile = this.profile.equals(student.profile);
            boolean oMajor = this.major.equals(student.major);
            boolean oCredits = this.creditCompleted == student.creditCompleted;
            return oProfile && oMajor && oCredits;
        }
        return false;
    }

    /**
     * This overrides the compareTo method for the student object.
     * @param student the object to be compared.
     * @return Returns 0 if they are the same and -1 if they are different.
     */
    @Override
    public int compareTo(Student student){
        if(this.profile.equals(student.getProfile()) == true){
            return 0;
        }else{
            return -1;
        }
    }

}

