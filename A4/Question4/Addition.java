public class Addition extends MathOperation {
    public Addition(int leftOperand, int rightOperand) {
        super(leftOperand, rightOperand);
    }

    public int GetResult() {
        return leftOperand + rightOperand;
    }
}



