public class Ravenclaw extends Hogwarts{

    private int intelligence;

    private int wisdom;

    private int wit;

    private int creativity;

    public Ravenclaw(int transgressionDistance, int magicPower, String name, int intelligence, int wisdom, int wit, int creativity) {
        super(transgressionDistance, magicPower, name);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public void descriptionStudent() {
        System.out.println("\nStudent " + this.getName() + " have these stats: " +
                "\n1)Transgression distance: " + this.getTransgressionDistance() +
                "\n2)Magic power: " + this.getMagicPower() +
                "\n3)Intelligence: " + this.getIntelligence() +
                "\n4)Wisdom: " + this.getWisdom() +
                "\n5)Wit: " + this.getWit() +
                "\n6)Creativity: " + this.getCreativity());
    }

    public void twoStudentsFacultyComparison(Ravenclaw student){
        int sum1 = this.getIntelligence() + this.getWit() + this.getWisdom() + this.getCreativity();
        int sum2 = student.getIntelligence() + student.getWit() + student.getWisdom() + student.getCreativity();
        if(sum1 > sum2) {
            System.out.println(this.getName() + " лучший Когтевранец, чем " + student.getName() + ".\n");
        }else if (sum1 == sum2 || this.equals(student)){
            System.out.println("Оба Когтевранец равны между собой.\n");
        }else {
            System.out.println(student.getName() + " лучший Когтевранец, чем " + this.getName() + ".\n");
        }
    }

}
