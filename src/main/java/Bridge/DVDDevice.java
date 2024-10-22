package Bridge;

public class DVDDevice implements Device{
    @Override
    public void powerOn() {
        System.out.println("DVD Player is powered on.");
    }

    @Override
    public void powerOff() {
        System.out.println("DVD Player is powered off.");
    }

    @Override
    public void setChannel(int channel) {
        // DVD doesn't have channels, but can be set as a placeholder.
        System.out.println("DVD Player channel set to " + channel);
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("DVD Player volume set to " + volume);
    }
}
