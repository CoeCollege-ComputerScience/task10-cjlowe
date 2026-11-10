import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberListener implements ActionListener {

    private Calculator watcher;

    public NumberListener(Calculator calc){
        watcher = calc;
    }

    public void actionPerformed(ActionEvent e){
        JButton clicked = (JButton)e.getSource();
        watcher.react(clicked.getText());
    }

    public void setCalculator(Calculator selected){
        watcher = selected;
    }
}
