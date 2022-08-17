public class Accountant extends Human implements JobTitle {

    public Accountant() {
        jobTitle = "Accountant";
    }

    @Override
    public void printJobTitle() {
        System.out.println(jobTitle);
    }
}
