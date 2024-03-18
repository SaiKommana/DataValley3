class Animal {
    void legs(int legs){
        System.out.println("It has "+legs+" legs");
    }
    void makeSound() {
        System.out.println("Some generic sound");
    }
}
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bowww");
    }
    void legs(){
        System.out.println("It has 4 legs");
    }
    void makeSound(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Bowww");
        }
    }
}
class MethodOandO
{
    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound(); 
        a.legs(6);
        Dog myDog = new Dog();
        myDog.legs();
        myDog.makeSound(); 
        myDog.makeSound(3);
    }
}
