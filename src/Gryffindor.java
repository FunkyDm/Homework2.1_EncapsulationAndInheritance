import javax.crypto.spec.PSource;
import java.util.Objects;

public class Gryffindor extends  Hogwarts{

    private int nobility;

    private int honor;

    private int bravery;

    public Gryffindor(int transgressionDistance, int magicPower, String name, int nobility, int honor, int bravery) {
        super(transgressionDistance, magicPower, name);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public void descriptionStudent (){
        System.out.println("\nStudent " + this.getName() + " have these stats: " +
                "\n1)Transgression distance: " + this.getTransgressionDistance() +
                "\n2)Magic power: " + this.getMagicPower() +
                "\n3)Nobility: " + this.getNobility() +
                "\n4)Honor: " + this.getHonor() +
                "\n5)Bravery: " + this.getBravery());
    }

//    public void twoStudentsFacultyComparison(Gryffindor student1, Gryffindor student2) {
//        int sum1 = student1.getBravery() + student1.getNobility() + student1.getHonor() ;
//        int sum2 = student2.getBravery() + student2.getNobility() + student2.getHonor();
//        if(sum1 > sum2) {
//            System.out.println(student1.getName() + " лучший Гриффиндорец, чем " + student2.getName() + ".\n");
//        }else if (sum1 == sum2){
//            System.out.println("Оба Гриффиндорца равны между собой.\n");
//        }else {
//            System.out.println(student2.getName() + " лучший Гриффиндорец, чем " + student1.getName() + ".\n");
//        }
//    }

    public void twoStudentsFacultyComparison(Gryffindor student){
        int sum1 = this.getBravery() + this.getNobility() + this.getHonor() ;
        int sum2 = student.getBravery() + student.getNobility() + student.getHonor();
        if(sum1 > sum2) {
            System.out.println(this.getName() + " лучший Гриффиндорец, чем " + student.getName() + ".\n");
        }else if (sum1 == sum2 || this.equals(student)){
            System.out.println("Оба Гриффиндорца равны между собой.\n");
        }else {
            System.out.println(student.getName() + " лучший Гриффиндорец, чем " + this.getName() + ".\n");
        }
    }

}
