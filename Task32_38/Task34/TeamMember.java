package Task32_38.Task34;

public class TeamMember extends TeamLeader{

    private String post = "Team member";

    @Override
    public String getPost() {
        return post;
    }


    public TeamMember(double start, double end, double revenue) {
        super(start, end, revenue);
    }

    @Override
    public void remuneration() {
        System.out.println("Percentage of products made");
    }

    @Override
    public void getSalary() {
        double percent = 8.5;
        System.out.println((percent * revenue)/100);
    }
}
