public class Worker extends Human implements JobTitle {
    public Worker() {
        jobTitle = "Worker";
    }

    @Override
    public void printJobTitle() {
        System.out.println(jobTitle);
    }

}
