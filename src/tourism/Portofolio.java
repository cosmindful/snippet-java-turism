package tourism;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
// Import the Scanner class to read text files
import java.util.*; 
import java.io.*;

public class Portofolio {
List<Client> clientList = new ArrayList<Client>();

    public void importFile(File file) {
        for (String entry : readFile(file)) {
            String row[] = entry.split(",");
            Client newClient = new Client();
            newClient.name = row[0];
            newClient.surname = row[1];
            newClient.destination = row[2];
            System.out.println("adding "+ newClient.name);
            clientList.add(newClient);
        }
    }

    public Vector<String> readFile(File file) {
        Vector<String> list = new Vector<String>(); 
        try {
            final Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
              list.add(myReader.nextLine());
              //System.out.println(list);
            }
            myReader.close();
          } catch (final FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
          return list;
    }
}