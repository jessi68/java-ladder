package ladder.domain;

import java.util.function.Function;

public enum Direction {

    LEFT {
        public int moving(int height) {
            return height - 1;
        }
    },
    RIGHT {
        public int moving(int height) {
            return height -  + 1;
        }
    };

    private Function<Integer, Integer> Moving;

    Direction() {
    }


}
