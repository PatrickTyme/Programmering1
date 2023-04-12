package model;

import jdk.jfr.Frequency;

import java.util.Random;

public class YatzyDice {
    // Face values of the 5 dice.
    // 1 <= values[i] <= 6 for i in [0..4]
    private int[] values = new int[5];

    // Number of times the 5 dice have been thrown.
    // 0 <= throwCount <= 3.
    private int throwCount = 0;

    // Random number generator.
    private final Random random = new Random();

    /**
     * Return the 5 face values of the dice.
     */
    public int[] getValues() {
        return values;
    }

    /**
     * Set the 5 face values of the dice.<br/>
     * Pre: 1 <= values[i] <= 6 for i in [0..4].<br/>
     * Note: This method is only to be used in tests.
     */
    void setValues(int[] values) {
        this.values = values;
    }

    /**
     * Return the number of times the 5 dice has been thrown.
     */
    public int getThrowCount() {
        return throwCount;
    }

    /**
     * Reset the throw count.
     */
    public void resetThrowCount() {
        throwCount = 0;
    }

    /**
     * Roll the 5 dice. Only roll dice that are not hold.<br/>
     * Note: holdStatus[index] is true, if die no. index is hold (for index in [0..4]).
     */
    public void throwDice(boolean[] holdStatus) {

    }

    // -------------------------------------------------------------------------

    /**
     * Return all results possible with the current face values.<br/>
     * The order of the results is the same as on the score board.<br/>
     * Note: This is an optional method. Comment this method out,<br/>
     * if you don't want use it.
     */
    public int[] getResults() {
        int[] results = new int[15];
        for (int i = 0; i <= 5; i++) {
            results[i] = this.sameValuePoints(i + 1);
        }
        results[6] = this.onePairPoints();
        results[7] = this.twoPairPoints();
        results[8] = this.threeSamePoints();
        results[9] = this.fourSamePoints();
        results[10] = this.fullHousePoints();
        results[11] = this.smallStraightPoints();
        results[12] = this.largeStraightPoints();
        results[13] = this.chancePoints();
        results[14] = this.yatzyPoints();

        return results;
    }

    // -------------------------------------------------------------------------

    // Return an int[7] containing the frequency of face values.
    // Frequency at index v is the number of dice with the face value v, 1 <= v <= 6.
    // Index 0 is not used.
    // Note: This method can be used in several of the following methods.
    private int[] frequency() {
        int[] frequency = new int[7];
        for (int value : getValues()) {
            frequency[value]++;
        }
        return frequency;
    }

    /**
     * Return same-value points for the given face value.<br/>
     * Returns 0, if no dice has the given face value.<br/>
     * Pre: 1 <= value <= 6;
     */
    public int sameValuePoints(int value) {
        return frequency()[value] * value;
    }

    /**
     * Return points for one pair (for the face value giving the highest points).<br/>
     * Return 0, if there aren't 2 dice with the same face value.
     */
    public int onePairPoints() {
        int pairPoint = 0;
        int[] freq = frequency();
        for (int i = 1; i < freq.length; i++) {

            if (freq[i] >= 2) {
                pairPoint = i * 2;
            }
        }
        return pairPoint;
    }

    /**
     * Return points for two pairs<br/>
     * (for the 2 face values giving the highest points).<br/>
     * Return 0, if there aren't 2 dice with the same face value<br/>
     * and 2 other dice with the same but different face value.
     */
    public int twoPairPoints() {
        int twoPairPoint = 0;
        int isThereTwoPairs = 0;
        int[] freq = frequency();
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] >= 2) {
                twoPairPoint += i * 2;
                isThereTwoPairs++;
            }
        }
        if (isThereTwoPairs < 2) {
            twoPairPoint = 0;
        }
        return twoPairPoint;
    }

    /**
     * Return points for 3 of a kind.<br/>
     * Return 0, if there aren't 3 dice with the same face value.
     */
    public int threeSamePoints() {
        int threeSame = 0;
        int[] freq = frequency();
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] >= 3) {
                threeSame = i * 3;
            }
        }
        return threeSame;
    }

    /**
     * Return points for 4 of a kind.<br/>
     * Return 0, if there aren't 4 dice with the same face value.
     */
    public int fourSamePoints() {
        int fourSame = 0;
        int[] freq = frequency();
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] >= 4) {
                fourSame = i * 4;
            }
        }
        return fourSame;
    }

    /**
     * Return points for full house.<br/>
     * Return 0, if there aren't 3 dice with the same face value<br/>
     * and 2 other dice with the same but different face value.
     */
    public int fullHousePoints() {
        int fullHouse = 0;
        int twoNumbers = 0;
        int[] freq = frequency();
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] == 3 || freq[i] == 2) {
                fullHouse += i * freq[i];
                twoNumbers++;
            }
        }
        if (twoNumbers < 2) {
            fullHouse = 0;
        }
        return fullHouse;
    }

    /**
     * Return points for small straight.<br/>
     * Return 0, if the dice aren't showing 1,2,3,4,5.
     */
    public int smallStraightPoints() {
        int smallStraight = 0;
        int[] freq = frequency();
        for (int i = 1; i < freq.length - 1; i++) {
            if (freq[i] == 1) {
                smallStraight++;
            }
        }
        if (smallStraight == 5) {
            return 15;
        }
        return 0;
    }


    /**
     * Return points for large straight.<br/>
     * Return 0, if the dice aren't showing 2,3,4,5,6.
     */
    public int largeStraightPoints() {
        int largeStraight = 0;
        int[] freq = frequency();
        for (int i = 2; i < freq.length; i++) {
            if (freq[i] == 1) {
                largeStraight++;
            }
        }
        if (largeStraight == 5) {
            return 20;
        }
        return 0;
    }

    /**
     * Return points for chance (the sum of face values).
     */
    public int chancePoints() {
        int points = 0;
        for (int value : getValues()) {
            points += value;
        }
        return points;
    }

    /**
     * Return points for yatzy (50 points).<br/>
     * Return 0, if there aren't 5 dice with the same face value.
     */
    public int yatzyPoints() {
        int[] freq = frequency();
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] == 5) {
                return 50;
            }
        }
        return 0;
    }
}
