package by.bsu.appIbrohim;

public class Runner {

    private static final int ARRAY [][] = 
    	{
          {0, 1, 2, 4},
          {1, 3, 5, 7, 9}, //25
          {11, 13, 15, 17, 19}, //75
          {22, 44, 11, 55, 77},
          {11, 5, 9, 27, -55} //107
        };
    public static void main(String[] args) {
        int sumLine = 0;
        int sumMax = 0;

        for (int i = 0; i < ARRAY.length; i++) {
            for (int j = 0; j < ARRAY[i].length; j++) {
                if(Math.abs(ARRAY[i][j])%2 == 1){
                    sumLine += Math.abs(ARRAY[i][j]);
                } else {
                    sumLine = 0;
                    break;
                }
            }
            if(sumLine > sumMax){
                sumMax = sumLine;
            }
            sumLine = 0;
        }
        System.out.printf("Максимальная сумма:  %d", sumMax);
        return;
    }
}

