public class Main {
    public static void main(String[] args) {
        ITV tv = new Sony();
        LogitechRemoteControl lrc = new LogitechRemoteControl(tv);
        lrc.turnOn();
        lrc.setChannelKeyboard(100);
        lrc.turnOff();
        ITV tv2 = new SamsungTV();
        LogitechRemoteControl lrc2 = new LogitechRemoteControl(tv2);
        lrc2.turnOn();
        lrc2.setChannelKeyboard(200);
        lrc2.turnOff();
    }
}
