package thuchanh1;

import org.omg.CORBA.PUBLIC_MEMBER;

public class calculate {
    public static int calculate(int firstOperand,int secondOperand,char operator){
        switch (operator){
            case '+':
                return firstOperand+secondOperand;
            case '-':
                return firstOperand-secondOperand;
            case '*':
                return firstOperand*secondOperand;
            case '/':
                if(secondOperand!=0)
                    return firstOperand/secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
    //đổi +-*/ thành chữ cho có ý nghĩa;
    public static final char ADDITION='+';
    public static final char SUBTRACTION='-';
    public static final char MULTIPLICATION='*';
    public static final char DIVISION='/';
    public static int Calculate (int firstOperand,int second0perand,char operator){
        switch (operator){
            case ADDITION:
                return firstOperand+second0perand;
            case SUBTRACTION:
                return firstOperand-second0perand;
            case MULTIPLICATION:
                return firstOperand*second0perand;
            case DIVISION:
                if(second0perand!=0)
                    return firstOperand/second0perand;
                else
                    throw new RuntimeException("can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
