
public class Timer {
    private ClockHand hundrets;
    private ClockHand seconds;
    
    public Timer() {
        this.hundrets = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    
    public void advance() {
        this.hundrets.advance();
        
        if (this.hundrets.value() == 0) {
            this.seconds.advance();
        }
    }
    
    @Override
    public String toString() {
        return seconds + ":" + hundrets;
    }
}
