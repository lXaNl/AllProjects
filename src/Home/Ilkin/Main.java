package Home.Ilkin;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean is = true;

        Map<Integer, User> userMap = new HashMap<>();

        String password = "i123";
        User user = new User("Ilkin", "ialiyevv878", password.hashCode());
        userMap.put(user.getId(), user);

        do {
            System.out.println("Добро пожаловать");
            System.out.println("1.Войти     2.Зарегистрироваться     3.Завершить программу");

            int a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Введите логин:");
                    String login = sc.next();
                    System.out.println("Введите пароль:");
                    String pass = sc.next();
                    boolean loggedIn = false;
                    for (User u : userMap.values()) {
                        if (u.getLogin().equals(login) &&
                                u.getPassword().equals(pass.hashCode())) {
                            System.out.println("Вы вошли в аккаунт:\t" + login);
                            loggedIn = true;
                            break;
                        }
                    }

                    if (!loggedIn) {
                        System.out.println("Неправильный логин или пароль:");
                    }


                    break;
                case 2:
                    System.out.println("Введите имя:");
                    String name = sc.next();
                    System.out.println("Введите логин:");
                    String log = sc.next();
                    System.out.println("Введите пароль:");
                    String pas = sc.next();
                    User newUser = new User(name, log, pas.hashCode());
                    if (userMap.containsValue(newUser)) {
                        System.out.println("Аккаунт с таким логином существует,попробуйте снова");
                    } else {
                        userMap.put(newUser.getId(), newUser);
                        System.out.println(userMap.toString());
                        System.out.println("Регистрация прошла успешно.");
                    }


                    break;
                case 3:
                    System.out.println("Хотите закрыть программу?");
                    System.out.println("1.Да    2.Нет");
                    int b = sc.nextInt();
                    if (b == 1) {
                        is = false;
                        break;
                    }

            }
        } while (is);
    }
}
