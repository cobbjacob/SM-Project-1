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

        boolean validCreditsCompleted = true;
        try{
            Integer.parseInt(commands[5]);
        }catch(NumberFormatException e){
            validCreditsCompleted = false;
            System.out.println("Credits completed invalid: not an integer!");
        }

        if(validCreditsCompleted == true){
            int creditsCompleted = Integer.parseInt(commands[5]);
            if(creditsCompleted < 0){
                System.out.println("Credits completed invalid: cannot be negative!");
                return;
            }else{
                if(commands[4].equalsIgnoreCase("CS") == true){
                    Student newStudent = new Student(newProfile, Student.Major.CS, creditsCompleted);
                    if(studentRoster.contains(newStudent) == true){
                        System.out.println(commands[1] + " " + commands[2] + " " + commands[3] + " is already in the roster.");
                        return;
                    }
                    studentRoster.add(newStudent);
                    System.out.println(commands[1] + " " + commands[2] + " " + commands[3] + " added to the roster.");
                }else if(commands[4].equalsIgnoreCase("MATH") == true){
                    Student newStudent = new Student(newProfile, Student.Major.MATH, creditsCompleted);
                    if(studentRoster.contains(newStudent) == true){
                        System.out.println(commands[1] + " " + commands[2] + " " + commands[3] + " is already in the roster.");
                        return;
                    }
                    studentRoster.add(newStudent);
                    System.out.println(commands[1] + " " + commands[2] + " " + commands[3] + " added to the roster.");
                }else if(commands[4].equalsIgnoreCase("EE") == true){
                    Student newStudent = new Student(newProfile, Student.Major.EE, creditsCompleted);
                    if(studentRoster.contains(newStudent) == true){
                        System.out.println(commands[1] + " " + commands[2] + " " + commands[3] + " is already in the roster.");
                        return;
                    }
                    studentRoster.add(newStudent);
                    System.out.println(commands[1] + " " + commands[2] + " " + commands[3] + " added to the roster.");
                }else if(commands[4].equalsIgnoreCase("ITI") == true){
                    Student newStudent = new Student(newProfile, Student.Major.ITI, creditsCompleted);
                    if(studentRoster.contains(newStudent) == true){
                        System.out.println(commands[1] + " " + commands[2] + " " + commands[3] + " is already in the roster.");
                        return;
                    }
                    studentRoster.add(newStudent);
                    System.out.println(commands[1] + " " + commands[2] + " " + commands[3] + " added to the roster.");
                }else if(commands[4].equalsIgnoreCase("BAIT") == true){
                    Student newStudent = new Student(newProfile, Student.Major.BAIT, creditsCompleted);
                    if(studentRoster.contains(newStudent) == true){
                        System.out.println(commands[1] + " " + commands[2] + " " + commands[3] + " is already in the roster.");
                        return;
                    }
                    studentRoster.add(newStudent);
                    System.out.println(commands[1] + " " + commands[2] + " " + commands[3] + " added to the roster.");
                }else{
                    System.out.println("Major code invalid: " + commands[4]);
                }
            }
        }
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
