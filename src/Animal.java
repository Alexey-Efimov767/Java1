public abstract class Animal {

    public final static int QUANTITYofEARS = 2;

    private int weight;
    private String name;

    public int getWeight() {
        return weight;
    }

    private void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    void voice(){
        System.out.println("The voice of animal");
    }

    public Animal(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }
}
