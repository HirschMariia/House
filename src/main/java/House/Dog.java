package House;

public class Dog extends Animal {

    public Dog(String name, String colour, int age) {
        super(name, colour, age);
    }

    @Override
    public void sayHello() {
        System.out.println("Gav! I'm dog. My name is " + super.getName());
    }

    public void bark() {
        System.out.println("Gav! Gav!");
    }

    @Override
    public void play(Creature another) {
        if (another instanceof Cat) {
            bark();
        } else {
            super.play(another);
        }
    }

    public void grow(){
        setAge(getAge() + 1);
        System.out.println(getName() + " has grown by 1 year. New age is " + getAge());
    }


}


