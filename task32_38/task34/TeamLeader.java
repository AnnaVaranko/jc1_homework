package task32_38.task34;

public class TeamLeader extends Director{
    private String post = "Team leader";

    @Override
    public String getPost() {
        return post;
    }

    public TeamLeader(double start, double end, double revenue) {
        super(start, end, revenue);
    }

    @Override
    public void remuneration() {
        System.out.println("Hourly wage plus percentage of products made");
    }

    @Override
    public void getSalary() {
        int fixSalary = 1000;
        double percent = 1.5;
        System.out.println( (fixSalary + (percent * revenue)/100));
    }

}
