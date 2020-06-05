import java.io.File;

//import Transport.Mean;

//import Transport.Mean;

public class Test {
    public static void main(String args[]) 
    { 
        System.out.println("Warming up..."); 
        Portofolio pt = new Portofolio();
        pt.importFile(new File("clients.txt"));

        ClientTurism ct = new ClientTurism();
        ct.name = "Avramel";
        ct.surname = "Iancu";
        ct.destination = "Brunei";
        ct.chooseTransport(Transport.Mean.Taxi);


    } 
}