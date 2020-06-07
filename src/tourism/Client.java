package tourism;
public class Client implements Transport{
    public String name;
    public String surname;
    public String destination;
    Mean myMean;

    public void chooseTransport(Mean mySexyMean) {
        this.myMean = mySexyMean;
    }

}