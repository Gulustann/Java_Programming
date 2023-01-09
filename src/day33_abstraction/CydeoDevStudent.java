package day33_abstraction;

import day32_finalKeyword.personTask.Person;

import java.time.LocalDate;

public class CydeoDevStudent extends Person {
    private final String id;
    private String batchName;
    private int batchNumber;
    private static final String programmingLanguage;

    static {
        programmingLanguage = "Java";
    }

    public CydeoDevStudent(String name, char gender, LocalDate DOB, String id, String batchName, int batchNumber) {
        super(name, gender, DOB);//Cannot give age condition before super. super keyword should be first in the constructor
        if (getAge() < 18) {//if age set to less than 18
            System.err.println("Invalid age: " + getAge() + ". Age cannot be less than 18 years old");
            System.exit(1);
        }
        this.id = id;
        setBatchName(batchName);
        setBatchNumber(batchNumber);
    }

    public String getId() {
        return id;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        if (batchName.equalsIgnoreCase("Zero to Hero") || batchName.equalsIgnoreCase("Alumni Dev")) {
            this.batchName = batchName;
        } else {//if the batch name is invalid
            System.err.println("invalid batch name: " + batchName + "\nNo such a batch in Cydeo");
            System.exit(1);
        }

    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if (batchNumber <= 0) {
            System.err.println("Invalid batch number: " + batchNumber + "\nBatch number cannot be negative or zero.");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating "+ programmingLanguage);//static variable is accepted in instance method
    }

    @Override
    public void drink() {
        System.out.println(getName()+" is drinking "+ programmingLanguage);
    }

    @Override
    public void sleep() {
        System.out.println(getName()+ " does not need to sleep");
    }

    @Override
    public String toString() {
        return "CydeoDevStudent{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", DOB=" + getDOB() +
                ", id='" + id + '\'' +
                ", batchName='" + batchName + '\'' +
                ", batchNumber=" + batchNumber +
                '}';
    }

    /* public void breath(){ //final method - cannot be overridden

    }*/
}
/*
Warmup tasks:
	1. Create a sub class of Person (from day32 package) named CydeoDevStudent (final)
			Extra Variables:
				id (final), batchName, batchNumber, programmingLanguage(static & final)

			Extra conditions:
					1. Age has to be at least 18 years old
					2. batchName can ONLY be set to "Zero to Hero" or "Alumni Dev"
					3. batchNumber can not be set to zero or negative

			Override the eat() & drink() methods and include the programmingLanguage variable in methods body

			Override the toString Method and include the id, batchName, batchNumber variables



 */