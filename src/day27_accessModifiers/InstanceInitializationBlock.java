package day27_accessModifiers;

public class InstanceInitializationBlock {

    public String name;
    public int age;
    { //instance initialization block
        name= "james"; //default name is "james" executed in every single object
        age = 20;
    }

    public InstanceInitializationBlock(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "InstanceInitializationBlock{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        InstanceInitializationBlock obj1 = new InstanceInitializationBlock("James", 25);
        InstanceInitializationBlock obj2 = new InstanceInitializationBlock("Aeron", 36);

        System.out.println(obj1);
        System.out.println(obj2);


    }

}
