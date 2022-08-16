package vscode.NewProblem.InnerClass;

import java.util.ArrayList;

public class GearBox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear;

    public int getCurrentGear() {
        return currentGear;
    }

    public ArrayList<Gear> getGears() {
        return gears;
    }

    public int getMaxGears() {
        return maxGears;
    }

    GearBox(int maxGears){
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0,0.0);
        this.gears.add(neutral);

    }
    public class Gear{
        private int gearNumber;
        private double ratio;

        public int getGearNumber() {
            return gearNumber;
        }

        public double getRatio() {
            return ratio;
        }

        Gear(int gearNumber, double ratio){
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }
        public  double driveSpeed(int revs){
            return revs * this.ratio;
        }
    }


    }

