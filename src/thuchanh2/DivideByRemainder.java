package thuchanh2;
public class DivideByRemainder {
    public static String fizzBuzz(int number){
        boolean isFizz=number%3==0;
        boolean isBuzz=number%5==0;
        if(isFizz&&isBuzz)
            return "fizzBuzz";
        if (isFizz)
            return "fizz";
        if(isBuzz)
            return "buzz";
        return number+"";
    }
}
