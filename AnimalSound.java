
class Animal{

    void makeSound(){
        System.out.println("Animal Sound");
    }
}
class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("MEOW");
    }
}
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("WOOF");
    }
}
class Bird extends Animal{
    @Override
    void makeSound(){
        System.out.println("CHRIP");
    }
}
public class AnimalSound {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal bird = new Bird();

        Animal[] sounds = {cat,dog,bird};

        sounds[0].makeSound();
        sounds[1].makeSound();
        sounds[2].makeSound();
    }
}