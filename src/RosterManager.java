import java.util.Scanner;
public class RosterManager {
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

    }

    public void removeStudent(String[] commands){

    }

    public void displayRoster(){

    }

    public void displayRosterStanding(){

    }

    public void displayRosterSchool(){

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
