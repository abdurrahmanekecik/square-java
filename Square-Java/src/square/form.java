package square;

import javax.swing.*;
import java.util.Collection;

public class form extends JFrame{
    private JPanel panel;
    private JTextField tf;
    private JButton button1;
    private JEditorPane editorPane1;

    form() {
        add(panel);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        button1.addActionListener(e -> {
            String text = tf.getText();
            editorPane1.setText(text);
        });


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new form();
            }
        });
    }
}
