package Class.reverce_call;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimePrinter implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Beep");
        Toolkit.getDefaultToolkit().beep();
    }
}
