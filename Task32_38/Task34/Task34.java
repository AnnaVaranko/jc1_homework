package Task32_38.Task34;

public class Task34 {
    public static void main(String[] args) {
        Director director = new Director(8.00, 16.00, 12000);
        director.getWorkingHours();
        director.informationAboutSalary();

        Director teamLeader = new TeamLeader(7.00,15.00, director.revenue);
        teamLeader.getWorkingHours();
        teamLeader.informationAboutSalary();

        Director teamMember = new TeamMember(7.00, 15.00, director.revenue);
        teamMember.getWorkingHours();
        teamMember.informationAboutSalary();
    }
}
