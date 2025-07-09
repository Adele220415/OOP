abstract class Animal {
protected String name;
public Animal(String name) {
this.name = name;
}
abstract void makeSound();
public void display() {
System.out.println("Animal: " + name);
}
}
class Dog extends Animal {
public Dog(String name) {
super(name);
}
@Override
void makeSound() {
System.out.println(name + " says: Woof!");
}
public void fetch() {
System.out.println(name + " is fetching the ball.");
}
}
class Cat extends Animal {
public Cat(String name) {
super(name);
}
@Override
void makeSound() {
System.out.println(name + " says: Meow!");
}public void purr() {
System.out.println(name + " is purring.");
}
}
public class Main {
public static void main(String[] args) {
Animal dog = new Dog("Rex");
Animal cat = new Cat("Luna");
dog.display();
dog.makeSound();
((Dog) dog).fetch();
cat.display();
cat.makeSound();
((Cat) cat).purr();
}
}