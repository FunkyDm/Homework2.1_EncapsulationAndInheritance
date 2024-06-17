import java.util.Objects;

public class Hogwarts {

    private int magicPower;

    private int transgressionDistance;

    private String name;

    public Hogwarts(int transgressionDistance, int magicPower, String name) {
        this.transgressionDistance = transgressionDistance;
        this.magicPower = magicPower;
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void descriptionStudent() {
        System.out.println("\nStudent " + this.getName() + " have these stats: " +
                "\n1)Transgression distance: " + this.getTransgressionDistance() +
                "\n2)Magic power: " + this.getMagicPower());
    }

    public void twoStudentsComparison(Hogwarts student) {
        if(this.getMagicPower() > student.getMagicPower() || this.getTransgressionDistance() > student.getTransgressionDistance()){
            if(this.getMagicPower() > this.getTransgressionDistance()){
                System.out.println(this.getName() + " обладает большей магической мощностью, чем " + student.getName() + ".\n");
            }else{
                System.out.println(this.getName() + " обладает большим расстоянием трансгрессии, чем " + student.getName() + ".\n");
            }
        } else if (student.getMagicPower() > student.getTransgressionDistance()) {
            System.out.println(student.getName() + " обладает большей магической мощностью, чем " + this.getName() + ".\n");
        }else{
            System.out.println(student.getName() + " обладает большим расстоянием трансгрессии, чем " + this.getName() + ".\n");
        }
    }

}
