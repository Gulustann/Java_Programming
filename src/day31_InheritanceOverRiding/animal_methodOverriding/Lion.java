package day31_InheritanceOverRiding.animal_methodOverriding;

public class Lion extends Animal {
    private boolean isAfrican;

    public Lion(String name, String breed, char gender, int age, String size, String color, boolean isAfrican) {
        super(name, breed, gender, age, size, color);
        setAfrican(isAfrican);
    }

    public boolean isAfrican() {
        return isAfrican;
    }

    public void setAfrican(boolean african) {
        isAfrican = african;
    }

    public void eat() {
        System.out.println("Lion " + getName() + " eats meat");
    }

    public void roar() {
        System.out.println("Lion " + getName() + " is roaring");
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", African Lion='" + isAfrican + '\'' +
                '}';
    /*public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                ", African Lion='" + isAfrican + '\'' +
                '}';
    }*/
    }
}
