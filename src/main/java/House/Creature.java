package House;

public abstract class Creature {
    String name;

    public Creature(String name) {
        this.name = name;
    }


    public abstract void sayHello();
    public String getName() {
        return name;
    }

    public void play(Creature another) {
        System.out.println(this.getClass().getSimpleName() + " is playing with " + another.getClass().getSimpleName());

        if (this instanceof Cat && another instanceof Dog) {
            System.out.println("The dog is barking at the cat!");
        } else if (this instanceof Dog && another instanceof Cat) {
            System.out.println("The cat is running away from the dog!");
        }
    }

}


