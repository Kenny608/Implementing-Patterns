import factoryPack.InfoInterview;
import factoryPack.Interview;
import factoryPack.TeamInterview;
import factoryPack.WhiteboardInterview;

public class InterviewManager {
    public Interview arrange(String candidateName, InterviewType interviewType) {
        Interview interview = null;
    
        switch (interviewType) {
            case INFO:
                interview = new InfoInterview();
                break;
            case WHITEBOARD:
                interview = new WhiteboardInterview();
                break;
            case TEAM:
                interview = new TeamInterview();
                break;
        }
        interview.displaySteps(); 
        return interview;
    }
}
