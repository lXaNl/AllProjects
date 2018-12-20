package Home.CollectionsHW;

import java.util.*;

import static Home.CollectionsHW.User.scAdd;

public class Main {
    //1. Создать метод добавляющий введенные с клавиатуры строки в список.
    //2. Создать класс User с полями id, name, login, password.
    //	2.1. Создать мэпу. В качестве ключей использовать id юзеров, в качестве значений самих юзеров.
    //	2.2. Добавить пару юзеров в мэпу, пароли хранить в хэшированном виде.
    //	2.3. При запуске приложения должно предлагаться Войти либо Зарегистрироваться.
    //
    //	2.4. В случай если выбор Войти, то предлагать ввести логин и пароль.
    //	2.5. Проверять существует ли уже такой юзер в мэпе по логину и паролю(хэшу).
    //	2.6. Если существует то выводить все данные о юзере и завершать программу.
    //
    //	2.7.  В случае если выбор Зарегистрироваться, то предлагать ввести имя, логин, пароль.
    //	2.8.  Проверять есть ли уже юзер с таким логином.
    //		2.8.1.  В случае если уже есть, выводить сообщение об этом и предлагать попробовать ещё раз или выйти.
    //		2.8.2. Если выбор Попробовать ещё раз, то снова начинать регистрацию.
    //	2.9. Если юзера с таким логином нет, сохранять его в мэпу, выводить на экран и завершать программу.
    //
    //	1. Создать класса Product с id, name
    //	2. Создать мэпку с продуктами, в качестве ключа - id продукта
    //	3. Когда юзер зашёл либо зарегистрировался показывать ему меню:
    //		- Продукты
    //		- Личная информация
    //		- Корзина
    //		- Выйти
    //	4. В случае если юзер выбирает продукты, выводить список продуктов
    //	5. После чего юзер может ввести через запятую id продуктов и они должны
    //          добавиться в корзину(Новая мэпа с продуктами).
    //	6. Проверять все ли введенный юзером id продуктов существуют, если нет,
    //          выводить сообщение об этом и предлагать повторить
    //	7. Если всё ок возвращать юзера в меню
    //	8. Если юзер выбирает корзину, и она не пуста выводить список продуктов и предлагать оплатить.
    //      Разделять приложение на методы с разной логикой - т е один метод для авторизации,
    // другой для регистрации, третий для сохранения юзера, четверый для проверки и тд и тп

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, User> userMap = new HashMap<>();
        Map<Integer, Product> productMap = new HashMap<>();

        Product ball = new Product("Ball");
        productMap.put(ball.getId(), ball);

        Product knife = new Product("Knife");
        productMap.put(knife.getId(), knife);

        Product cup = new Product("Cup");
        productMap.put(cup.getId(), cup);

        User xan = new User("Xan", "123X".hashCode());
        userMap.put(xan.getId(), xan);

        User ali = new User("Ali", "123A".hashCode());
        userMap.put(ali.getId(), ali);

        User nur = new User("Nur", "123N".hashCode());
        userMap.put(nur.getId(), nur);

        boolean isTrue = true;
        boolean basketMapBool=false;
        int menuX;
        int productsX;
        int paymentX;
        Map<Integer,Product> basketMap = new HashMap<>();
        System.out.println("1. Sign in \n2. Registration \n3. Close");
        int switchX = sc.nextInt();
        do {
            sw:
            switch (switchX) {
                case 1: //signing
                    System.out.println("1. Enter Login ");
                    String login = sc.next();
                    System.out.println("2. Enter Password");
                    String pas = sc.next();
                    boolean signing = false;
        userCheck : for (User u : userMap.values()) {
                        if (u.getLogin().equals(login) && u.getPass().equals(pas.hashCode())) {
                            signing = true;
                            System.out.println("Entered successfully : " + u.getLogin());
                            System.out.println(u);
                            break userCheck;
                        }
                    }

                    if (!signing) {
                        System.out.println("Incorrect log or pass");
                        System.out.println("1. Sign in \n2. Registration \n3. Close ");
                        switchX = sc.nextInt();
                        break;
                    }
                    System.out.println("\n4. Products \n5. Personal info \n6. Basket ");
                    switchX = sc.nextInt();
                    break;

                case 2: //registration
                    System.out.println("Enter Login ");
                    String str1 = sc.next();
                    for (User u : userMap.values()) {
                        if (u.getLogin().equals(str1)) {
                            System.out.println("Login already exists");
                            System.out.println("Enter 1. Sign in \n2. Registration again ");
                            switchX = sc.nextInt();
                            break sw;
                        }
                    }
                    System.out.println("Enter Password ");
                    String pass1 = sc.next();
                    User newUser = new User(str1, pass1.hashCode());
                    userMap.put(newUser.getId(), newUser);
                    System.out.println(userMap);
                    System.out.println("1. Sign in \n3. Close");
                    switchX = sc.nextInt();
                    break;

                case 3://closing
                    System.out.println("Good Bye");
                    isTrue = false;
                    break;

                case 4:
                    boolean add = false;
                    for (Product p :productMap.values()) {
                        System.out.println("ID : "+p.getId()+" Name : "+p.getName());
                    }
                    String basketStr = sc.next();
                    String[] arr = basketStr.split(",");

                    List<Integer> list = new LinkedList<>();
                    for (int i = 0; i < arr.length; i++) {
                        list.add(Integer.parseInt(arr[i]));
                    }

                    basketMapBool=true;
            isset : for (int i = 0; i < arr.length; i++) {
                        if (productMap.values().contains(productMap.get(list.get(i)))){
                            basketMap.put(list.get(i),productMap.getOrDefault(list.get(i),null));
                        }else {
                            System.out.println("This ID not exist ");
                            basketMapBool=false;
                            break isset;
                        }
                    }
                    System.out.print("[ ");
                    basketMap.forEach((k,e)-> System.out.print(e.getName()+", "));
                    System.out.println("] ");
                    System.out.println("\n4. Products \n5. Personal info \n6. Basket ");
                    switchX = sc.nextInt();
                    break;

                case 5 :
                    System.out.println("Info");
                    System.out.println("\n4. Products \n5. Personal info \n6. Basket ");
                    switchX = sc.nextInt();
                    break ;
                case 6 :

                    if (basketMapBool) {
                        System.out.print("[ ");
                        basketMap.forEach((k,e)-> System.out.print(e.getName()+", "));
                        System.out.println("] ");
                        System.out.println("Do you want to pay ? \n1. Yes / 2. No ");
                        paymentX = sc.nextInt();
                        System.out.println("Thanks for visit");
                        basketMapBool = false;
                        basketMap.clear();
                        System.out.println("\n4. Products \n5. Personal info \n6. Basket ");
                        switchX = sc.nextInt();
                    } else {
                        System.out.println("Your basket is empty");
                        System.out.println("\n4. Products \n5. Personal info \n6. Basket ");
                        switchX = sc.nextInt();
                    }
                    break;

            }
        } while (isTrue);


    }
}
