package StopWatch;

public class Time {
    private  long startTime;
    private  long endTime;

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    public void start() {
        this.startTime = System.nanoTime();
    }
    public void stop() {
        this.endTime = System.nanoTime();
    }
    public double getElapsedTime() {
        return getEndTime()-getStartTime();
    }
}
