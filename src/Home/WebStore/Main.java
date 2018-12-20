package Home.WebStore;

import java.util.*;

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

    private static final Map<Integer, User> usersMap = new HashMap<>();
    private static final Map<Integer, Product> productsMap = new HashMap<>();
    private static final User user = new User("Xan", "123X".hashCode(),"1997-08-11");
    private static final Product product = new Product("ball");
    private static int switchX;
    private static int paymentX;

    public static void setPaymentX(int paymentX) {
        Main.paymentX = paymentX;
    }

    public static void setSwitchX(int switchX) {
        Main.switchX = switchX;
    }

    static {
        usersMap.put(user.getId(), user);
        productsMap.put(product.getId(),product);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Methods methods = new Methods();
        Map<Integer, Product> basketMap = new HashMap<>();

        Product ball = new Product("Ball");
        productsMap.put(ball.getId(), ball);

        Product knife = new Product("Knife");
        productsMap.put(knife.getId(), knife);

        Product cup = new Product("Cup");
        productsMap.put(cup.getId(), cup);


        User ali = new User("Ali", "123A".hashCode(),"1999-01-01");
        usersMap.put(ali.getId(), ali);

        User nur = new User("Nur", "123N".hashCode(),"1992-01-01");
        usersMap.put(nur.getId(), nur);

        boolean isTrue = true;
        boolean basketMapBool = false;



        System.out.println("1. Sign in \t2. Registration \t3. Close");
        setSwitchX(sc.nextInt());
        do {

            sw:switch (switchX) {
                case 1: //signing
                    String login = methods.requestLogin();
                    String pass = methods.requestPass();
                    boolean isSigned = methods.userCheck(login, pass, usersMap);
                    if (!isSigned) {
                        System.out.println("Incorrect log or pass");
                        System.out.println("1. Sign in \t2. Registration \t3. Close ");
                        setSwitchX(sc.nextInt());
                        break;
                    }
                    System.out.println("\t4. Products \t5. Personal info \t6. Basket ");
                    setSwitchX(sc.nextInt());
                    break;

                case 2: //registration
                    String regLogin = methods.requestLogin();
                    boolean loginCheck = methods.loginCheck(regLogin,usersMap);
                    methods.registration(regLogin,loginCheck,usersMap);
                    break ;

                case 3://closing
                    System.out.println("Good Bye");
                    isTrue = false;
                    break;

                case 4:
                    boolean add = false;
                    methods.printAllProducts(productsMap);

                    List<Integer> orderListID = methods.orderListID();
                    basketMapBool = methods.checkAndAddToBasket(basketMap,productsMap,orderListID);

                    System.out.print("[ ");
                    basketMap.forEach((k, e) -> System.out.print(e.getName() + ", "));
                    System.out.println("] ");
                    System.out.println("\t4. Products \t5. Personal info \t6. Basket ");
                    setSwitchX(sc.nextInt());
                    break;

                case 5:
                    System.out.println("Info");
                    System.out.println("\t4. Products \t5. Personal info \t6. Basket ");
                    setSwitchX(sc.nextInt());
                    break;
                case 6:

                    if (basketMapBool) {
                        System.out.print("[ ");
                        basketMap.forEach((k, e) -> System.out.print(e.getName() + ", "));
                        System.out.println("] ");
                        System.out.println("Do you want to pay ? \t1. Yes / 2. No ");
                        setPaymentX(sc.nextInt());
                        System.out.println("Thanks for visit");
                        basketMapBool = false;
                        basketMap.clear();
                        System.out.println("3. Exit \t4. Products \t5. Personal info \t6. Basket ");
                        setSwitchX(sc.nextInt());
                    } else {
                        System.out.println("Your basket is empty");
                        System.out.println("3. Exit \t4. Products \t5. Personal info \t6. Basket ");
                        setSwitchX(sc.nextInt());
                    }
                    break;

            }
        } while (isTrue);


    }
}
