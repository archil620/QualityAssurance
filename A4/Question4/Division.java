public class Division extends MathOperation {
    public Division(int leftOperand, int rightOperand) {
        super(leftOperand, rightOperand);
    }

    public int GetResult() {
        return leftOperand / rightOperand;
    }
}



