package ladder.domain;

import java.util.HashMap;
import java.util.List;

public class Ladders {
    private List<Ladder> ladders;

    public void Ladders(List<Ladder> ladders) {

        this.ladders = ladders;
    }

    public Ladder get(int index) {
        return this.ladders.get(index);
    }

}
