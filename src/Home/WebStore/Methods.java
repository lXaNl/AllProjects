package Home.WebStore;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static Home.WebStore.Main.*;

public class Methods {
    Scanner sc = new Scanner(System.in);

    public boolean userCheck(String login,String pass,Map<Integer,User> usersMap){
        userCheck : for (User u : usersMap.values()) {
            if (u.getLogin().equals(login) && u.getPass().equals(pass.hashCode())) {
                System.out.println("Entered successfully : " + u.getLogin()+" ID = "+u.getId());
                return true;
            }
        }
        return false;
    }

    public boolean loginCheck(String regLogin,Map<Integer,User> usersMap){
        for (User u : usersMap.values()) {
            if (u.getLogin().equals(regLogin)) {
                System.out.println("Login already exists");
                System.out.println("1. Sign in \t2. Registration again ");
                setSwitchX(sc.nextInt());
                return false;
            }
        }
        return true;
    }

    public void registration(String regLogin,boolean loginCheck ,Map<Integer,User> usersMap){
        if (loginCheck ){
            System.out.println("Enter Password ");
            String pass1 = sc.next();
            System.out.println("Enter Birth Date YYYY-MM-DD ");
            String birthdayStr = sc.next();
            LocalDate now = LocalDate.now();
            LocalDate birthdayDate = LocalDate.parse(birthdayStr);
            if ((now.getYear()-birthdayDate.getYear())>=18) {
                User newUser = new User(regLogin, pass1.hashCode(), birthdayStr);
                usersMap.put(newUser.getId(), newUser);
            } else System.out.println("Only 18+ ");
            System.out.println("1. Sign in \t3. Close");
            setSwitchX(sc.nextInt());

        }
    }

    public String requestLogin() {
        System.out.println("1. Enter Login ");
        String loginstr = sc.next();
        return loginstr;
    }

    public String requestPass(){
        System.out.println("2. Enter Password");
        String pas = sc.next();
        return pas;
    }

    public void printAllProducts(Map<Integer,Product> productMap){
        for (Product p : productMap.values()) {
            System.out.println("ID : " + p.getId() + " Name : " + p.getName());
        }
    }

    public List<Integer> orderListID() {
        String basketStr = sc.next();
        String[] arr = basketStr.split(",");

        List<Integer> list = new LinkedList<>();
        for (String anArr : arr) {
            list.add(Integer.parseInt(anArr));
        }
        return list;
    }

    public boolean checkAndAddToBasket(Map<Integer,Product> basketMap ,Map<Integer,Product> productsMap , List<Integer> orderListID){
        for (int i = 0; i < orderListID.size(); i++) {
            if (productsMap.values().contains(productsMap.get(orderListID.get(i)))) {
                basketMap.put(orderListID.get(i), productsMap.getOrDefault(orderListID.get(i), null));
            } else {
                System.out.println("This ID not exist ");
                return false;
            }
        }
        return true;
    }



}
