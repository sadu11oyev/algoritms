package baxa.uz.task3;

import java.util.ArrayList;
import java.util.List;

public class Service {
    public static List<User> userList = new ArrayList<>();
    public static String EXIST_USER = "fail: user already exists";
    public static String ADD_USER = "success: new user added";
    public static String NO_USER = "fail: no such user";
    public static String INCORRECT_PASSWORD = "fail: incorrect password";
    public static String ALREADY_LOGIN = "fail: already logged in";
    public static String SUCCESS_LOGIN = "success: user logged in";
    public static String ALREADY_LOGOUT = "fail: already logged out";
    public static String SUCCESS_LOGOUT = "success: user logged out";


    public static void registerUser(String[] words) {
        String username = words[1];
        int index = index(username,userList);
        if (index!=-1){
            System.out.println(EXIST_USER);
        }else {
            User user = new User(username,words[2],false);
            userList.add(user);
            System.out.println(ADD_USER);
        }
    }
    public static void login(String[] words) {
        String username = words[1];
        int index = index(username,userList);
        if (index==-1){
            System.out.println(NO_USER);
        }else {
            if (userList.get(index).getPassword().equals(words[2])){
                if (!userList.get(index).getIsLogin()){
                    userList.get(index).setIsLogin(true);
                    System.out.println(SUCCESS_LOGIN);
                }else {
                    System.out.println(ALREADY_LOGIN);
                }
            }else {
                System.out.println(INCORRECT_PASSWORD);
            }
        }
    }
    public static void logout(String[] words) {
        String username = words[1];
        int index = index(username,userList);
        if (index==-1){
            System.out.println(NO_USER);
        }else {
            if (userList.get(index).getIsLogin()){
                userList.get(index).setIsLogin(false);
                System.out.println(SUCCESS_LOGOUT);
            }else {
                System.out.println(ALREADY_LOGOUT);
            }
        }
    }
    private static int index(String username, List<User> userList) {
        int index =-1;
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getUsername().equals(username)){
                return i;
            }
        }
        return index;
    }

    public static String[] array(String line) {
        return line.split(" ");
    }

}
