package day38_exceptionHandling;

public class TestPersonObject {
    public static void main(String[] args) {
        Person person1 = new Person("Daniel", 32, 'M');

        System.out.println(person1);
        try{
            person1.setAge(-35);
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println(person1);//Person{name='Daniel', age=32, gender=M}
        //try&catch block did not set the age -25, prints original age, 32

        Person person2 = new Person("Daniel", 32, 'M');






    }
}
