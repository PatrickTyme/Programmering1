package Opg1;

import java.util.ArrayList;

public class Swimmer {
    private String name;
    private ArrayList<Double> lapTimes;

    private TrainingPlan trainingPlan;



    public void setTrainingPlan(TrainingPlan trainingPlan) {
        this.trainingPlan = trainingPlan;
    }
    public TrainingPlan getTrainingPlan() {
        return trainingPlan;
    }

    public Swimmer(String name, ArrayList<Double> lapTimes) {
        this.name = name;
        this.lapTimes = lapTimes;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Double> getLapTimes() {
        return lapTimes;
    }

    /**
     * Return the fastest lap time.
     */
    public double bestLapTime() {
        double bestLap = lapTimes.get(0);
        for (double lapTime : lapTimes) {
            if (lapTime < bestLap) {
                bestLap = lapTime;
            }
        }
        return bestLap;
    }

    /**
     * Return how many training hours the swimmer has each week.
     */
    public int allTrainingHours() {
        return getTrainingPlan().getWeeklyStrengthHours() + getTrainingPlan().getWeeklyWaterHours();
    }

}

