package factoryPack;

import stratPack.Implementtation.NoResponse;
import stratPack.Implementtation.ScheduleTwo;
import stratPack.Implementtation.CoordinateTeam;
import stratPack.Implementtation.TeamReview;

public class TeamInterview implements Interview {
    public void displaySteps() {
        System.out.println("_____ PROCESS for candidate: PPK _________");
        new ScheduleTwo().schedule();
        new CoordinateTeam().interview();
        new TeamReview().coordinateTeam();
        new NoResponse().notifyCandidate();
        System.out.println("_________________________________");
    }
}