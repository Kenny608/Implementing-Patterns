package stratPack.Implementtation;

import stratPack.Behavior.NotifyingBehavior;

public class NoResponse implements NotifyingBehavior{
    public void notifyCandidate(){
        System.out.println("No followup needed");
    }

}
