package ladder.domain;

public class Step {
    private int height;
    private Ladder left;
    private Ladder right;

    public Step(int height, Ladder left, Ladder right) {
        this.height = height;
        this.left = left;
        this.right = right;
    }

    public Ladder passThrough(Ladder cur) {
        if(left.equals(cur)) {
            return right;
        }
        return left;
    }
}
