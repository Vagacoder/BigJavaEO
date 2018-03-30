package BigJavaCh13;

public interface PartialSolutions {
    public static final int ACCEPT = 1;
    public static final int ABANDON = 2;
    public static final int CONTINUE = 3;

    public int examine();

    public PartialSolutions[] extend();

    public void solve(PartialSolutions sol);
}
