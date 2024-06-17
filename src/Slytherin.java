public class Slytherin extends Hogwarts{

    int cunning;

    int determination;

    int ambition;

    int resourcefulness;

    int thirstForPower;

    public Slytherin(int transgressionDistance, int magicPower, String name, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(transgressionDistance, magicPower, name);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    @Override
    public void descriptionStudent (){
        System.out.println("\nStudent " + this.getName() + " have these stats: " +
                "\n1)Transgression distance: " + this.getTransgressionDistance() +
                "\n2)Magic power: " + this.getMagicPower() +
                "\n3)Ambition: " + this.getAmbition() +
                "\n4)Cunning: " + this.getCunning() +
                "\n5)Determination: " + this.getDetermination() +
                "\n6)Resourcefulness: " + this.getResourcefulness() +
                "\n7)Thirst for power: " + this.getThirstForPower());
    }

    public void twoStudentsFacultyComparison(Slytherin student) {
        int sum1 = this.getCunning() + this.getDetermination() + this.getAmbition() + this.getResourcefulness() + this.getThirstForPower();
        int sum2 = student.getCunning() + student.getDetermination() + student.getAmbition() + student.getResourcefulness() + student.getThirstForPower();
        if (sum1 > sum2) {
            System.out.println(this.getName() + " лучший Слизеринец, чем " + student.getName() + ".\n");
        } else if (sum1 == sum2 || this.equals(student)) {
            System.out.println("Оба СЛизеринец равны между собой.\n");
        } else {
            System.out.println(student.getName() + " лучший Слизеринец, чем " + this.getName() + ".\n");
        }
    }

}
