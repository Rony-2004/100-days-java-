import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example extends JFrame {

    public Example() {
        setTitle("Swing Example - Day 1");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Create a label
        JLabel label = new JLabel("Click the button below");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        
        // Create a button
        JButton button = new JButton("Click Me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked!");
            }
        });
        
        // Add components to frame
        setLayout(new java.awt.BorderLayout());
        add(label, java.awt.BorderLayout.CENTER);
        add(button, java.awt.BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Example ex = new Example();
                ex.setVisible(true);
            }
        });
    }
}
