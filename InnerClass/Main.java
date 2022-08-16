package vscode.NewProblem.InnerClass;

public class Main {
    public static void main(String[] args) {
GearBox mcLaren = new GearBox(8);
GearBox.Gear first = mcLaren.new Gear(1, 0.8);
 double speed = first.driveSpeed(500);
        System.out.println(speed);

    }
}
