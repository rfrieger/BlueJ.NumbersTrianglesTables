 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String result = "";
        String rowString = "";
        for(int i = 1; i < 6 ; i++  ) {
            for(int j = 1; j < 6 ; j++){
                int resultHolder = i * j ;
                 if (resultHolder < 10) {
                     rowString += "  " + resultHolder + " |";
                    } else if (resultHolder <100) {
                     rowString += " " + resultHolder + " |";
                    } else {
                     rowString += resultHolder + " |";   
                    }
            }   
            result += rowString + "\n";
            rowString = "";
            
        } 
        System.out.println(result);
        return result;
    }

    public static String getLargeMultiplicationTable() {
        String result = "";
        String rowString = "";
        for(int i = 1; i < 11 ; i++  ) {
            for(int j = 1; j < 11 ; j++){
                int resultHolder = i * j ;
                 if (resultHolder < 10) {
                     rowString += "  " + resultHolder + " |";
                    } else if (resultHolder <100) {
                     rowString += " " + resultHolder + " |";
                    } else {
                     rowString += resultHolder + " |";   
                    }
            }   
            result += rowString + "\n";
            rowString = "";
            
        } 
        System.out.println(result);
        return result;
    }

    public static String getMultiplicationTable(int tableSize) {
        String result = "";
        String rowString = "";
        for(int i = 1; i <= tableSize ; i++  ) {
            for(int j = 1; j <= tableSize ; j++){
                 int resultHolder = i * j;
                 if (resultHolder < 10) {
                     rowString += "  " + resultHolder + " |";
                    } else if (resultHolder <100) {
                     rowString += " " + resultHolder + " |";
                    } else {
                     rowString += resultHolder + " |";   
                    }
               
            }   
            result += rowString + "\n";
            rowString = "";
            
        } 
        System.out.println(result);
        return result;
    }
}
