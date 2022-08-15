package thuchanh1;

public class dividebyremainder {
    public static String fizzbuzz (int number){
        if(number%3==0&&number%5==0)
            return "ok";
        if(number%3==0)
            return "chia het";
        if(number%5==0)
            return "chiahet";
        return number+"";
    }
}
