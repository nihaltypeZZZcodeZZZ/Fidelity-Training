public class MultilevelAnimal {
    public void eat(){
        System.out.println("Animal is eating");
    }
}
class Mammal extends MultilevelAnimal{
    public void sleep(){
        System.out.println("Mammal is sleeping");
    }
}
class Dog extends Mammal{
    public void bark() {
        System.out.println("Dog is barking");
    }
}
class AnimalMain{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.bark();
    }
}
