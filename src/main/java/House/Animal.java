package House;

public abstract class Animal extends Creature{

    private String colour;
    private int age;
    private boolean isHungry;

    public Animal(String name, String colour, int age) {
        super(name);
        this.name = name;
        this.colour = colour;
        this.age = age;
        this.isHungry = true;
    }

    public void feed(){
        isHungry = false;
        System.out.println("Animal " + name + " is not hungry anymore");
    }

    @Override
    public abstract void sayHello();

    public void displayAnimalInfo(){
        System.out.println("Animal info:");
        System.out.println(name + ", colour: " + colour + ", age: " + age + ", isHungry: " + isHungry);
        sayHello();
        System.out.println("--------------");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

}


