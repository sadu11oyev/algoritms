package baxa.uz.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(getResult());
    }
    private static String getResult() {
        Scanner scanner = new Scanner(System.in);
        int examination=scanner.nextInt();
        int rating,allRating=0;
        String result="";

        for (int i = 0; i < examination; i++) {
            rating= scanner.nextInt();
            if (rating==3){
                return "None";
            }
            allRating+=rating;
        }

        double overAll = (double)allRating/examination;

        if(overAll==5.0){
            result = "Named";
        } else if (overAll>=4.5 && overAll<5.0) {
            result = "High";
        }
        else if (overAll>3 && overAll<4.5){
            result = "Common";
        }
        return result;
    }
}
