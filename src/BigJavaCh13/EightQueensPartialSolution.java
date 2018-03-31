package BigJavaCh13;

public class EightQueensPartialSolution implements PartialSolutions {

    private Queen[] queens;
    private static final int NQUEENS = 8;

    public static final int ACCEPT = 1;
    public static final int ABANDON = 2;
    public static final int CONTINUE = 3;

    public EightQueensPartialSolution(int size) {
	queens = new Queen[size];
    }

    @Override
    public int examine() {
	for (int i = 0; i < queens.length; i++) {
	    for (int j = i + 1; j < queens.length; j++) {
		if (queens[i].attacks(queens[j])) {
		    return ABANDON;
		}
	    }
	}
	if (queens.length == NQUEENS) {
	    return ACCEPT;
	} else {
	    return CONTINUE;
	}
    }

    @Override
    public PartialSolutions[] extend() {

	EightQueensPartialSolution[] result = new EightQueensPartialSolution[NQUEENS];
	for (int i = 0; i < result.length; i++) {
	    int size = queens.length;
	    result[i] = new EightQueensPartialSolution(size + 1);

	    for (int j = 0; j < size; j++) {
		result[i].queens[j] = queens[j];
	    }
	    result[i].queens[size] = new Queen(size, i);
	}
	return result;
    }

    @Override
    public void solve(PartialSolutions solutions) {
	// TODO Auto-generated method stub

    }

}
