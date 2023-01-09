package day30_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class President extends Person {
    private LocalDate electionDate;

    public President(String name, char gender, LocalDate DOB, LocalDate electionDate) {
        super(name, gender, DOB);
        this.electionDate = electionDate;
    }

    public LocalDate getElectionDate() {
        return electionDate;
    }

    public void setElectionDate(LocalDate electionDate) {
        this.electionDate = electionDate;
    }
    public void lie(){
        System.out.println(getName() + " is lying");
    }
}
