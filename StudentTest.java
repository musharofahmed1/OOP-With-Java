public class StudentTest {
    public static void main(String[] args){

        Student account1 = new Student("Musa", 87.2);
        Student account2 = new Student("Mahmud", 97.2);

        System.out.printf("%s's Letter is:  %s%n",
        account1.getName(), account1.letterGrade());

        System.out.printf("%s's Letter is:  %s%n",
        account2.getName(), account2.letterGrade());
        
    }
}
