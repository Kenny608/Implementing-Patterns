package stratPack.Implementtation;

import stratPack.Behavior.SchedulingBehavior;

public class ScheduleTwo implements SchedulingBehavior{
    public void schedule() {
        System.out.println("Schedule initial interview");
        System.out.println("Schedule followup interview");
    }
}
