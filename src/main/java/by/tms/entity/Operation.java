package by.tms.entity;

public class Operation {
    private final double num1;
    private final double num2;
    private final double result;
    private final String operand;
    private final User user;

    @Override
    public String toString() {
        return "Operation{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", result=" + result +
                ", operand='" + operand + '\'' +
                ", user=" + user +
                '}';
    }

    public Operation(double num1, double num2, String operand, double result, User user) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
        this.operand = operand;
        this.user = user;
    }

    public double getNum2() {
        return num2;
    }

    public double getResult() {
        return result;
    }

    public String getOperand() {
        return operand;
    }

    public double getNum1() {
        return num1;
    }

}
