package ladder.domain;


import java.util.HashMap;
import java.util.List;

public class Ladder {

    private HashMap<Step, Direction> directionOfSteps = new HashMap<>();
    private int order;

    public Ladder(int order) {
        this.order = order;
    }

    public int moveThrough(Step step) {
        Direction direction = directionOfSteps.get(step);
    }

    public void putStep(Step step, Direction direction) {
        this.directionOfSteps.put(step, direction);
    }

    public HashMap<Step, Direction> getStepAt() {
        return directionOfSteps;
    }

}
