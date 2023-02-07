import java.io.*;
import java.util.*;


public class Main {
    
    public static void main(String[] args) {
     
        //TODO: Read a list of competitors from a text file
        //TODO: Make a List of participants from that information NOTE: The list must be immutable
        //TODO: Give them a random time in range of H:M:S
        //TODO: Compare them, sort them
        //TODO: Write them back to a 



        
    }
}


public void writeToFile(List<?> list){

    try {
        FileOutputStream file = new FileOutputStream("RunningTimeResults.ser");
        ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(list);

        file.close();
        System.out.println("The file has been written!");
    }catch (IOException exeption){
        System.out.println(exeption);

    }
}