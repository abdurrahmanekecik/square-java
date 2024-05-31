package square;

import javax.swing.*;

public class form extends JFrame{
    private JPanel panel;
    private JTextField tf;
    private JButton button1;
    private JTextArea textArea1;

    form() {
        add(panel);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        button1.addActionListener(e -> {
            String text = tf.getText();
            textArea1.setText("");
            int length = text.length();

            if (length > 1) {
                // İlk satır
                textArea1.append(text + "\n");

                // Ara satırlar
                for (int i = 1; i < length - 1; i++) {
                    textArea1.append(text.charAt(i) + "");
                    for (int j = 1; j < length - 1; j++) {
                        textArea1.append("  ");
                    }
                    textArea1.append(text.charAt(length - 1 - i) + "\n");
                }

                // Son satır
                for (int i = length - 1; i >= 0; i--) {
                    textArea1.append(text.charAt(i) + "");
                }
            }

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
