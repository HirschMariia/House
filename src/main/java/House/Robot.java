package House;

import static java.lang.Character.getName;

public class Robot {

    private static int robotCount = 0;

    private static final int ROBOT_DEFAULT_VERSION = 1;

    private String name = "Name";

    private final String description;

    private final int version;

    public Robot(String name, String description, int version) {
        this.name = name;
        this.description = description;
        this.version = version;
        robotCount++;
    }

    public Robot(String name, String description) {
        this.name = name;
        this.description = description;
        this.version = ROBOT_DEFAULT_VERSION;
        robotCount++;
    }

    public static void printTotalRobotCount(){
        System.out.println("Total robot number = " + robotCount);
    }

    public void printCurrentRobotInfo() {
        System.out.println(name + ", description: " + description + ", version: " + version);
        System.out.println("Total robot number = " + robotCount);
    }

    public void walk(Animal animal) {
        System.out.println("Robot " + name + " is walking with " + animal.getName());
    }

    public void catchMouse(Mouse mouse){
        System.out.println(getName() + " is catching the mouse " + mouse.getName());
    }

    private boolean getName() {
        return false;
    }


}




