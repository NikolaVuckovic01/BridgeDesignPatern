public class LogitechRemoteControl extends AbstractRemoteControl{
    public LogitechRemoteControl(ITV tv){
        super(tv);
    }
    public void setChannelKeyboard(int channel){
        this.setChannel(channel);
        System.out.println("Logitech use keyword to channel");
    }
}
