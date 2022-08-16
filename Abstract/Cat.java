package vscode.NewProblem.Abstract;

public class Cat extends Animal {

    @Override
    public void name(String name) {
        System.out.println("Cat name is " + name);
    }

    public Cat(String name, int age) {
        super(name, age);
    }
}

