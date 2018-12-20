package Class.enums;

import java.util.Arrays;

public class EnumsMain {

    public static void main(String[] args) {
//        Size s = Size.SMALL;
//
//        System.out.println(s.getAbbreviation());
//
//        Size [] values = Size.values();
//
//        System.out.println(Arrays.toString(values));
//        System.out.println(Arrays.toString(Size.values()));
//        System.out.println(Size.MEDIUM.ordinal());

        Size size = Enum.valueOf(Size.class, "SMALL");
        System.out.println(size);
    }

}
