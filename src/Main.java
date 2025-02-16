//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog(12, "Puppy");
        dog1.voice();
        int x =dog1.eatenFood(1,2);
        System.out.println(x);

        Dog dog2 = new Dog(12, "Pup");
        dog2.voice();

        Dog god3 = new Dog(5, "Bobby");
    }
}