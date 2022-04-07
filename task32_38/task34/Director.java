package task32_38.task34;

public class Director {
    private final double startOfWork;
    private final double endOfWork;
    public final double revenue;
    private String post = "Director";

    public String getPost() {
        return post;
    }

    public Director(double start, double end, double revenue){
        startOfWork = start;
        endOfWork = end;
        this.revenue = revenue;
    }

    public void getWorkingHours(){
        System.out.println(getPost());
        System.out.println("Start of work: " + startOfWork);
        System.out.println("End of work: " + endOfWork);
    }

    public void informationAboutSalary(){
        remuneration();
        salary();
        System.out.println();
    }

    public void remuneration(){
        System.out.println("Hourly wage");
    }

    private void salary(){
        System.out.print("Salary is ");
        getSalary();
    }

    public void getSalary() {
        int fixSalary = 2000;
        System.out.println(fixSalary);
    }
}
