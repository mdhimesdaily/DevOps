public class Factorial {
    public Integer factorialcalc(int number) {
        if (number == 0)
            return 1;
        if (number > 0) {

            return number * factorialcalc(number - 1);
        }
        else if(number < 0){
            return 0;
        }
        return null;
    }
}
