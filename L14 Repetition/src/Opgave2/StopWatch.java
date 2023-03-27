package Opgave2;

import java.time.Duration;
import java.time.LocalTime;

public class StopWatch {
    public StopWatch() {
    }

    LocalTime startTime;
    LocalTime endTime;

    public void start() {
        startTime = LocalTime.now();
    }

    public void stop() {
        endTime = LocalTime.now();
    }

    public double elapsedTime() {
      return Duration.between(this.startTime, this.endTime).toMillis() / 1000.0;
    }

}