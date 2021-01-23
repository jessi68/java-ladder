package ladder.domain;

import java.util.HashMap;
import java.util.List;

public class Ladder {

    private HashMap<Integer, Step> stepAt = new HashMap<>();

    public Ladder(HashMap<Integer, Step> stepAt) {
        this.stepAt = stepAt;
    }

    public Step getWithHeight(int height) {
        return stepAt.get(height);
    }
}
