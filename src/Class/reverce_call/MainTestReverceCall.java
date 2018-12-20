package Class.reverce_call;

import javax.swing.*;
import java.awt.event.ActionListener;

public class MainTestReverceCall {

    public static void main(String[] args) {

        ActionListener listener = new TimePrinter();

        Timer timer = new Timer(5000, listener);

        timer.start();

        JOptionPane.showMessageDialog(null,
                "Quit?");
        System.exit(0);
    }
}
