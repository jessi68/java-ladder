package ladder.domain;

import java.util.HashMap;
import java.util.List;

public class Ladder {

    private HashMap<Integer, Step> stepsAt = new HashMap<>();
    private int order;

    public Ladder(int order) {
        this.order = order;
    }

    public Step getWithHeight(int height) {
        return stepsAt.get(height);
    }

    public void putStep(int height, Step step) {
        this.stepsAt.put(height, step);
    }

    public HashMap<Integer, Step> getStepAt() {
        return stepsAt;
    }

}
