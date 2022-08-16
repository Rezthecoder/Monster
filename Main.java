package vscode.NewProblem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Player Suresh = new Player("Suresh", 100, 10);
    System.out.println(Suresh.toString());
    saveObject(Suresh);
    Suresh.setHitPoints(50);

//      System.out.println(Suresh.toString());
//      saveObject(Suresh);
//    loadObject(Suresh);
      System.out.println(Suresh.toString());

      Monster monster = new Monster("Goblin", 100, 10);
        System.out.println(monster.toString());
        saveObject(monster);
        monster.setHitPoints(50);
        System.out.println(monster.toString());
        loadObject(monster);


  }

  public static ArrayList<String> readValues() {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> values = new ArrayList<String>();
    boolean quit = false;
    int index = 0;
    System.out.println(
            """

                    Enter the values
                    1 to enter the string
                    0 to quit"""
    );
    while (!quit) {
        System.out.println("Choose an option");
      int choice = scanner.nextInt();
        scanner.nextLine();
      switch (choice) {
        case 0:
          quit = true;
          break;
        case 1:
          System.out.println("Enter your string");
          String nextLine = scanner.nextLine();
          values.add(nextLine);
           index++;
            break;

      }

    }
    return values;
 
  }
public static void saveObject(IStorage object){
    for(int i =0; i<object.write().size(); i++){
   System.out.println("Saving" + object.write().get(i) +"to storage");
    }
    }

    public static void loadObject(IStorage object){
        ArrayList<String> values = readValues();
  object.read(values);
      System.out.println(values);


    }   

    

}


