package Bridge;

public class HomeEntertainmentSystem {
    public static void main(String[] args) {
        Device tv = new TVDevice();
        RemoteControl remote = new BasicRemote(tv);
        remote.powerOn();
        remote.setChannel(5);
        remote.setVolume(10);
        remote.powerOff();

        Device dvd = new DVDDevice();
        remote = new BasicRemote(dvd);
        remote.powerOn();
        remote.setChannel(1);
        remote.setVolume(7);
        remote.powerOff();
    }
}
