package baxa.uz.task3;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        Scanner scanInt = new Scanner(System.in);
        Scanner scanLine = new Scanner(System.in);

        int operation = scanInt.nextInt();

        for (int i = 0; i < operation; i++) {

            String[] words = Service.array(scanLine.nextLine());
            String command = words[0];

            switch (command){
                case "register"->Service.registerUser(words);
                case "login"->Service.login(words);
                case "logout"->Service.logout(words);
            }
        }


    }
}
