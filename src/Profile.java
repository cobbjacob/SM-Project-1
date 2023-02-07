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
    public String getLname(){
        return lname;
    }
    public String getFname(){
        return fname;
    }
    public Date getDob(){
        return dob;
    }

    //setters
    public void setLname(String newLname){
        lname = newLname;
    }
    public void setFname(String newFname){
        fname = newFname;
    }
    public void setDob(Date newDob){
        dob = newDob;
    }

}


