public class Dog extends Animal {
    public Dog(int weight, String name) {
        super(weight, name);
    }

    @Override
    void voice() {
        System.out.println("Barking");
    }

    int eatenFood(int a, int b){
        int x = a+b;
        System.out.println("Dog ate " + x + " kg");
        return x;
    }
    double eatenFood(double a, double b){
        System.out.println("Dog ate "+a+b+ " kg");
        return a+b;
    }
}
