package io.zipcoder.microlabs.mastering_loops;
//Not sure why my final commit didnt get through
public class TableUtilities {
    public static String getSmallMultiplicationTable() {

        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String matrix = "";
        for (int i = 1; i <= tableSize; i++){
            for(int j = 1; j <= tableSize; j++){
                if(i * j > 99){
                    matrix += "" + i * j + " |";
                }else if (i * j > 9) {
                    matrix += " " + i * j + " |";
                }else{
                    matrix += "  " + i * j + " |";
                }
            }
            matrix += "\n";
        }
        return matrix;
    }
}
