package nextstep.fp;

import java.util.Random;

public class RandomMovable implements MoveStrategy{
    private static final int MIN_VALUE = 3;
    @Override
    public boolean isMovable() {
        Random random = new Random();
        return random.nextInt() >= MIN_VALUE;
    }
}
