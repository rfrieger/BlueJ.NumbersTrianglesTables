


public class NumberUtilities {

    public static String getRange(int stop) {
        String numString = "";
        for(int i = 0; i < stop; i++ ) {
           numString += String.valueOf(i);
        }
        return numString;
    }

    public static String getRange(int start, int stop) {
        String numString = "";
        for(int i = start; i < stop; i++ ) {
           numString += String.valueOf(i);
        }
        return numString;
    }


    public static String getRange(int start, int stop, int step) {
        String numString = "";
        for(int i = start; i < stop; i += step ) {
           numString += String.valueOf(i);
        }
       
        
        return numString;
    }

    public static String getEvenNumbers(int start, int stop) {
        String numString = "";
        for(int i = start; i < stop; i++ ) {
           if(i % 2 == 0) {
            numString += String.valueOf(i);
        }
        }
        return numString;
    }


    public static String getOddNumbers(int start, int stop) {
        String numString = "";
        for(int i = start; i < stop; i++ ) {
           if(i % 2 == 1) {
            numString += String.valueOf(i);
        }
        }
        return numString;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String numString = "";
        for(int i = start; i <= stop; i++ ) {
           numString += String.valueOf((int)Math.pow(i, exponent));
           
        }
        return numString;
    }
}
