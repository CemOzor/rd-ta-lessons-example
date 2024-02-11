package Homework8;



import java.util.ArrayList;
import java.util.List;

public class Department {
    private TeamLead teamLead;
    private List<Personnel> personnelList;
    private List<String> assignmentList;

    public Department(TeamLead teamLead) {
        this.teamLead = teamLead;
        this.personnelList = new ArrayList<>();
        this.assignmentList = new ArrayList<>();
    }

    // Diğer gerekli yöntemler buraya eklenebilir...
}
