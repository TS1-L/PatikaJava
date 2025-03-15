import java.util.Arrays;

public class LetterB {

    public static void main(String[] args) {

        String[][] letter = new String[7][4];

        for (int i = 0; i < letter.length; i++) {
            
            for (int j = 0; j < letter[0].length; j++) {

                if (j == 0 || (j == 3 && i % 3 != 0) || (j != 3 && i % 3 == 0)) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "   ";

                }
            }
        }

        for (String[] strings : letter) {
          
            for (String string2 : strings) {
              
                System.out.print(string2);

            }
            
          System.out.println();

        }

    }
}
