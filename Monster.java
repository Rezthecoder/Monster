package vscode.NewProblem;

import java.util.ArrayList;
import java.util.List;

public class Monster implements IStorage{
    private String name;
    private int hitPoints;
    private int strength;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }
    public Monster() {}

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(this.name);
        values.add(this.hitPoints + "");
        values.add(this.strength + "");
        return values;
    }

    @Override
    public void read(List<String> savedData) {
        if(savedData!=null && savedData.size()>0){
               this.name = savedData.get(0);
               this.hitPoints = Integer.parseInt(savedData.get(1));
               this.strength= Integer.parseInt(savedData.get(2));



            }
        }

    }
