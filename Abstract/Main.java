package vscode.NewProblem.Abstract;

public class Main {
    public static void main(String[] args) {
Cat cat = new Cat("Tom", 2);
cat.name("Tom");
cat.setName("Jerry");
        System.out.println(cat.name);
        System.out.println(cat.getName());
        if (cat.name.compareTo((cat.getName())) == 0) {
            System.out.println("equal");
        }
    }

    }
