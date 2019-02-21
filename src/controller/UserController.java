package controller;

import model.User;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public class UserController {
    private List<User> registered_users = new ArrayList<>();
    private Set<String> registered_logins = new HashSet<>();

    public boolean addUser(String login, String password){
        if(registered_logins.contains(login)){
            System.out.println("Login " +login+ " istnieje w bazie");
            return false;
        }
        User u = new User(login, password);
        registered_users.add(u);
        registered_logins.add(login);
        System.out.println("Zarejestrowano użytkownika");
        return true;
    }
    public boolean deleteUser(String login_delete){
        for (int i = 0; i < registered_users.size(); i++){
            if(registered_users.get(i).getLogin().equals(login_delete)){
                registered_users.remove(registered_users.get(i));
                registered_logins.remove(login_delete);
                System.out.println("Usunięto użytkownika: " + login_delete);
                return true;
            }
        }
        System.out.println("Nie ma takiego użytkownika: " + login_delete);
        return false;
    }
    public boolean passwordCheck(String newPassword){
        // długość hasła co najmniej 6 zanków a maksymalnie 32 znaki
        String template = ".{6,32}";
        // musi być cyfra przynajmniej jedna
        String template1 = ".*\\d+.*";
        // musi być przynajmniej jedna wielka litera
        String template2 = ".*[A-Z]+.*";
        return Pattern.matches(template, newPassword) && Pattern.matches(template1,newPassword) && Pattern.matches(template2,newPassword);
    }

    public boolean changePassword(String login, String oldPassword, String newPassword1, String newPassword2){
        for (int i = 0; i < registered_users.size(); i++) {
            // szukamy usera po loginie
            if(registered_users.get(i).getLogin().equals(login) && registered_users.get(i).getPassword().equals(oldPassword)) {
                // sprawdzamy podobieństwo haseł
                if (newPassword1.equals(newPassword2) && !newPassword1.equals(oldPassword)) {
                    // sprawdzamy poprawność nowego hasła
                    if(passwordCheck(newPassword1)) {
                        registered_users.get(i).setPassword(newPassword1);
                        System.out.println("Hasło zostało zmienione");
                        return true;
                    }
                    System.out.println("Nowe hasła są błędne!");
                    return false;
                }
                System.out.println("Podane hasła sa różne lub takie same jak stare hasło");
                return false;
            }
        }
        System.out.println("Nie ma takiego użytkownika: " + login + "lub stare hasło jest błędne");
        return false;
    }

    public void showUsers(){
        registered_users.forEach(user -> System.out.println(user));
    }
}
