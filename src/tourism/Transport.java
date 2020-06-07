package tourism;
public interface Transport {
    public enum Mean{
        Bus,
        Taxi
    }
    public void chooseTransport(Mean mean);
}