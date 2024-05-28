package factoryPack;

import stratPack.Implementtation.NoResponse;
import stratPack.Implementtation.NoReview;
import stratPack.Implementtation.ScheduleOne;
import stratPack.Implementtation.ShareJobInfo;

public class InfoInterview implements Interview {
    public void displaySteps() {
        System.out.println("_____ PROCESS for candidate: JHG _________");
        new ScheduleOne().schedule();
        new ShareJobInfo().interview();
        new NoReview().coordinateTeam();
        new NoResponse().notifyCandidate();
        System.out.println("_________________________________");
    }
}
