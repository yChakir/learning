package principles.programmingToAnInterface;

interface MakeSound {
    void makeSound();
}

class Cat implements MakeSound {

    @Override
    public void makeSound() {
        System.out.println("Cat sound !!");
    }
}

class Dog implements MakeSound {

    @Override
    public void makeSound() {
        System.out.println("Dog sound !!");
    }
}

class Animal {

    MakeSound makeSound;

    public void setMakeSound(MakeSound makeSound) {
        this.makeSound = makeSound;
    }

    void testSound() {
        this.makeSound.makeSound();
    }
}
public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();

        Animal animal = new Animal();

        animal.setMakeSound(cat);
        animal.testSound();

        animal.setMakeSound(dog);
        animal.testSound();
    }
}
