package ladder.domain;

import java.util.HashMap;
import java.util.List;

public class Ladder {

    private HashMap<Integer, Step> stepsAt = new HashMap<>();

    public Ladder(HashMap<Integer, Step> stepAt) {
        this.stepsAt = stepAt;
    }

    public Step getWithHeight(int height) {
        return stepsAt.get(height);
    }

    public HashMap<Integer, Step> getStepAt() {
        return stepsAt;
    }

}
