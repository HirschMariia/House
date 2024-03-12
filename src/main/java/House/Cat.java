package House;

public class Cat extends Animal {

    public Cat(String catName){
        this(catName, "white", 1);
    }

    public Cat(String catName, String catColour, int catAge){
        super(catName, catColour, catAge);
    }

    @Override
    public void sayHello(){
        System.out.println("Meow! I'm cat. My name is " + super.getName());
    }

    public void meow() {
        System.out.println("Meow!");
    }

    public void catchMouse(Mouse mouse){
        System.out.println(getName() + " is catching the mouse " + mouse.getName());
    }

    public void grow(){
        setAge(getAge() + 1);
        System.out.println(getName() + " has grown by 1 year. New age is " + getAge());
    }


}


