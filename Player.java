package vscode.NewProblem;

import java.util.ArrayList;
import java.util.List;

public class Player implements IStorage {

  private String name;
  private int hitPoints;
  private int strength;
  private String weapons;

  Player(String name, int hitPoints, int strength) {
    this.name = name;
    this.hitPoints = hitPoints;
    this.strength = strength;
    this.weapons = "Pistol";
  }

  public Player() {}

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

  public String getWeapons() {
    return weapons;
  }

  public void setWeapons(String weapons) {
    this.weapons = weapons;
  }

  @Override
  public String toString() {
    return (
      "Player [hitPoints=" +
      hitPoints +
      ", name=" +
      name +
      ", strength=" +
      strength +
      ", weapons=" +
      weapons +
      "]"
    );
  }

  @Override
  public List<String> write() {
    List<String> data = new ArrayList<String>();
    data.add(0, this.name);
    data.add(1, "" + this.hitPoints);
    data.add(2, "" + this.strength);
    data.add(3, this.weapons);
    return data;
  }

  @Override
  public void read(List<String> savedData) {
    if (savedData != null && savedData.size() > 0) {
      this.name = savedData.get(0);
      this.hitPoints = Integer.parseInt(savedData.get(1));
      this.strength = Integer.parseInt(savedData.get(2));
      this.weapons = savedData.get(3);
    }
  }
}
