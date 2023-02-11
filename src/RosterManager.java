/**
 * This is the roster manager where the user input is read and the commands are executed.
 * @author Jaison Prajapati
 */

import java.util.Scanner;
public class RosterManager {
    Roster studentRoster = new Roster();
    public void run(){
        System.out.println("Roster Manager running...");
        Scanner scan = new Scanner(System.in);
        String command = "";
        String[] commands;
        while(scan.hasNext()){
            command = scan.nextLine();
            commands = command.split("\\s+");

            if(commands[0].equals("A")){
                addStudent(commands);
            }else if(commands[0].equals("R")){
                removeStudent(commands);
            }else if(commands[0].equals("P")){
                displayRoster();
            }else if(commands[0].equals("PS")){
                displayRosterStanding();
            }else if(commands[0].equals("PC")){
                displayRosterSchool();
            }else if(commands[0].equals("L")){
                listStudentsSchool(commands);
            }else if(commands[0].equals("C")){
                changeMajor(commands);
            }else if(commands[0].equals("Q")){
                programExecution();
            }else{
                System.out.println(commands[0] + " is an invalid command!");
            }
        }
    }
    public void addStudent(String[] commands){
        Profile newProfile = new Profile();
        newProfile.setFname(commands[1]);
        newProfile.setLname(commands[2]);
        Date studentDob = new Date(commands[3]);
        if(studentDob.isValid() == false){
            System.out.println("DOB invalid: " + commands[3] + " not a valid calendar date!");
            return;
        }else if(studentDob.age(studentDob) == false){
            System.out.println("DOB invalid: " + commands[3] + " younger than 16 years old!");
            return;
        }else{
            newProfile.setDob(studentDob);
        }

        int creditsCompleted = Integer.parseInt(commands[5]);
        if(commands[4].equals("CS") == true){
            Student newStudent = new Student(newProfile, Student.Major.CS, creditsCompleted);
            studentRoster.add(newStudent);
        }else if(commands[4].equals("MATH") == true){
            Student newStudent = new Student(newProfile, Student.Major.MATH, creditsCompleted);
            studentRoster.add(newStudent);
        }else if(commands[4].equals("EE") == true){
            Student newStudent = new Student(newProfile, Student.Major.EE, creditsCompleted);
            studentRoster.add(newStudent);
        }else if(commands[4].equals("ITI") == true){
            Student newStudent = new Student(newProfile, Student.Major.ITI, creditsCompleted);
            studentRoster.add(newStudent);
        }else if(commands[4].equals("BAIT") == true){
            Student newStudent = new Student(newProfile, Student.Major.BAIT, creditsCompleted);
            studentRoster.add(newStudent);
        }

        System.out.println(commands[1] + " " + commands[2] + " " + commands[3] + " added to the roster.");
    }

    public void removeStudent(String[] commands){

    }

    public void displayRoster(){
        studentRoster.print();
    }

    public void displayRosterStanding(){
        studentRoster.printByStanding();
    }

    public void displayRosterSchool(){
        studentRoster.printBySchoolMajor();
    }

    public void listStudentsSchool(String[] commands){

    }

    public void changeMajor(String[] commands){

    }

    public void programExecution(){
        System.out.println("Roster Manager terminated.");
        System.exit(0);
    }
}
