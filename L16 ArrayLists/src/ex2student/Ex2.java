package ex2student;

import java.util.ArrayList;
import java.util.List;
    public class Ex2 {
        /**
         * Tests all the methods.
         */
        public static void main(String[] args) {
            ArrayList<Integer> ints = new ArrayList<>();
            ints.add(12);
            ints.add(0);
            ints.add(45);
            ints.add(7);
            ints.add(-16);
            ints.add(0);
            ints.add(23);
            ints.add(-10);
// ints.addAll(List.of(12, 0, 45, 7, -16, 0, 23, -10));
            System.out.println("ints: " + ints);
            System.out.println();
// Test of sum1() method: correct sum is 61.
            int total = sum1(ints);
            System.out.println("Sum: " + total);
            System.out.println();

// Test of sum() method: correct sum is 61.
            System.out.println("Sum of for-each is: " + sum(ints));
            System.out.println();
// Test of minimum() method: correct minimum is -16.
            System.out.println("Minimum is: " + minimum(ints));
            System.out.println();
// Test of maximum() method: correct maximum is 45.
            System.out.println("Maximum is: " + maximum(ints));
            System.out.println();
// Test of average() method: correct average is 7.625.
            System.out.println("Average is " + average(ints));
            System.out.println();
// Test of zeroes() method: correct number of zeroes is 2.
            System.out.println("Number of zeroes: " + zeroes(ints));
            System.out.println();
// Test of evens() method: correct result is [12, 0, -16, 0, -10].
            System.out.println("Number of evens: " + evens(ints));
            System.out.println();
        }

        // sum made with for statement
        public static int sum1(ArrayList<Integer> list) {
            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                int number = list.get(i);
                sum += number;
            }
            return sum;
        }

        public static int sum(ArrayList<Integer> list) {
            int total = 0;
            for (int sum : list) {
                total = total + sum;
            }
            return total;
        }

        public static int minimum(ArrayList<Integer> list) {
            int min = 0;
            for (int number : list) {
                if (number < min) {
                    min = number;
                }
            }
            return min;
        }

        public static int maximum(ArrayList<Integer> list) {
            int max = 0;
            for (int number : list) {
                if (number > max) {
                    max = number;
                }
            }
            return max;
        }
        public static double average(ArrayList<Integer> list) {
            double average = 0;
            for (double number : list) {
                average = number + average;
            }
            return average / list.size();
        }
        public static int zeroes(ArrayList<Integer> list) {
            int zeroes = 0;
            for (int number : list) {
                if (number == 0) {
                    zeroes++;
                }
            }
            return zeroes;
        }
        public static ArrayList<Integer> evens(ArrayList<Integer> list) {
            ArrayList<Integer> evens = new ArrayList<>();
            for (int number : list) {
                if (number % 2 == 0) {
                    evens.add(number);
                }
            }
            return evens;
        }
    }