public abstract class AbstractRemoteControl {
    private ITV itv;

    public AbstractRemoteControl(ITV tv){
        this.itv=tv;
    }
    public void turnOn(){
        itv.on();
    }
    public void turnOff(){
        itv.off();
    }
    public void setChannel(int channel){
        itv.switchChannel(channel);
    }
}
