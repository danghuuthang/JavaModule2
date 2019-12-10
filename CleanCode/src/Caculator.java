public class Caculator
{
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';
    public static int calculate(int firstOperand , int secondOperand , char operator )
    {
        switch (operator )
        {
            case ADDITION:
                return firstOperand  + secondOperand ;
            case SUBTRACTION:
                return firstOperand  - secondOperand ;
            case MULTIPLICATION:
                return firstOperand  * secondOperand ;
            case DIVISION:
                if (secondOperand  != 0)
                    return firstOperand  / secondOperand ;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }

    public static void main(String[] args) {
        System.out.println(calculate(2,3,ADDITION));
        System.out.println(calculate(2,3,SUBTRACTION));
        System.out.println(calculate(2,3,MULTIPLICATION));
        System.out.println(calculate(3,3,DIVISION));


    }
}
