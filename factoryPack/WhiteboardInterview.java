package factoryPack;

import stratPack.Implementtation.Notify;
import stratPack.Implementtation.ScheduleTwo;
import stratPack.Implementtation.SkipLevelReview;
import stratPack.Implementtation.WhiteboardWork;

public class WhiteboardInterview implements Interview {
    public void displaySteps() {
        System.out.println("_____ PROCESS for candidate: LDM _________");
        new ScheduleTwo().schedule();
        new WhiteboardWork().interview();
        new SkipLevelReview().coordinateTeam();
        new Notify().notifyCandidate();
        System.out.println("_________________________________");
    }
}
