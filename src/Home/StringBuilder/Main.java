package Home.StringBuilder;

public class Main {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("Hello").append(" how are you? ");
        sb.replace(sb.length()-1,sb.length(),"123");
        System.out.println(sb);


    }
}
