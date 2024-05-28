package stratPack.Implementtation;

import stratPack.Behavior.NotifyingBehavior;

public class Notify implements NotifyingBehavior{
    public void notifyCandidate() {
        System.out.println("Inform the candidate of hiring decision");
    }
}
