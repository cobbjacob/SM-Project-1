public class Student implements Comparable<Student> {
    private Profile profile;
    private Major major; //Major is an enum type
    private int creditCompleted;

    public Student(Profile profile, Major major, int creditCompleted){
        this.profile = profile;
        this.major = major;
        this.creditCompleted = creditCompleted;
    }

    //getters
    public Major getMajor(){
        return major;
    }
    public int getCreditCompleted(){
        return creditCompleted;
    }

    //setters
    public void setMajor(Major newMajor){
        major = newMajor;
    }
    public void setCreditCompleted(int newCreditCompleted){
        creditCompleted = newCreditCompleted;
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
    public boolean compareTo(Student student){

    }

}

