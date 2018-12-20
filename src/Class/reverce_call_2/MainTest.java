package Class.reverce_call_2;

public class MainTest {

    public static void main(String[] args) {
        Button button =
                new Button(new ButtonClickHandler());

        button.click();

        Button okButton =
                new Button(new ButtonOkHandler());

        okButton.click();

        Button backButton = new Button(new EventHandler() {
            @Override
            public void execute() {
                System.out.println("Back");
            }
        });
    }

}
