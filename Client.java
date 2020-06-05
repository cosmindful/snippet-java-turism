public class Client implements Transport{
    String name;
    String surname;
    String destination;
    Mean myMean;

    public void chooseTransport(Mean mySexyMean) {
        this.myMean = mySexyMean;
    }

}