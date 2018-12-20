package Class.fizz_buzz;

public class FizzBuzzImpl2 implements FizzBuzz {

    @Override
    public void fizzBuzz(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i]%3 == 0) {
                 if (array[i]%5 == 0) {
                     System.out.println("FizzBuzz");
                 } else {
                     System.out.println("Fizz");
                 }
            } else if (array[i]%5 == 0) {
                System.out.println("Buzz");
            }
        }
    }
}
