public class Multiplication extends MathOperation {
    public Multiplication(int leftOperand, int rightOperand) {
        super(leftOperand, rightOperand);
    }

    public int GetResult() {
        return leftOperand * rightOperand;
    }
}


