package factoryPack;

public class TeamInterviewFactory implements InterviewFactory {
    public Interview createInterview() {
        return new TeamInterview();
    }
}