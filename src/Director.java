public class Director extends Human implements JobTitle {
    public Director() {
        jobTitle = "Director";
    }

    @Override
    public void printJobTitle() {

        System.out.println(jobTitle);
    }
}
