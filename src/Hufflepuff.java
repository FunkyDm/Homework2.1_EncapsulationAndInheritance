public class Hufflepuff extends Hogwarts{

    private int diligence;

    private int loyalty;

    private int honor;

    public Hufflepuff(int transgressionDistance, int magicPower, String name, int diligence, int loyalty, int honor) {
        super(transgressionDistance, magicPower, name);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honor = honor;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonor() {
        return honor;
    }

    @Override
    public void descriptionStudent (){
        System.out.println("\nStudent " + this.getName() + " have these stats: " +
                "\n1)Transgression distance: " + this.getTransgressionDistance() +
                "\n2)Magic power: " + this.getMagicPower() +
                "\n3)Diligence: " + this.getDiligence() +
                "\n4)Loyalty: " + this.getLoyalty() +
                "\n5)Honor: " + this.getHonor());
    }

    public void twoStudentsFacultyComparison(Hufflepuff student){
        int sum1 = this.getDiligence() + this.getLoyalty() + this.getHonor() ;
        int sum2 = student.getDiligence() + student.getLoyalty() + student.getHonor();
        if(sum1 > sum2) {
            System.out.println(this.getName() + " лучший Пуффендуец, чем " + student.getName() + ".\n");
        }else if (sum1 == sum2 || this.equals(student)){
            System.out.println("Оба Пуффендуйца равны между собой.\n");
        }else {
            System.out.println(student.getName() + " лучший Пуффиндуец, чем " + this.getName() + ".\n");
        }
    }

}
