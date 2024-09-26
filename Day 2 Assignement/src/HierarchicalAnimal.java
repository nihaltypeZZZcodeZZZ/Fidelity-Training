public class HierarchicalAnimal {
    public void look(){
        System.out.println("Loook over there!!");
    }
}
class Dogg extends HierarchicalAnimal {
    public void bark(){
        System.out.println("A Dog is barking");
    }
}
class Cat extends HierarchicalAnimal {
    public void meow(){
        System.out.println("A Cat is meowing");
    }
}
class HierarchicalMain{
    public static void main(String[] args) {
        Dogg dog = new Dogg();
        dog.look();
        dog.bark();
        Cat cat = new Cat();
        cat.look();
        cat.meow();
    }

}
