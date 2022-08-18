public class AbsoluteNumberCalculator {
    public static int findAbsolute( int number ) {
//        int result = Math.abs(number);
        int result;
        if ( number < 0) return -number;
        else if (number == 0) {
            return 0;
        } else return number;
    }
}
