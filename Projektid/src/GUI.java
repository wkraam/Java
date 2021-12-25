import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GUI {
    private JTextField DelayField;
    private JButton shutdownButton;
    private JButton exitButton;
    private JButton restartButton;
    private JPanel Panel;
    private JButton abortButton;
    private int delay;
    public GUI() {
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(1);
            }
        });
        shutdownButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (DelayField.getText() != "") {
                    delay = Integer.parseInt(DelayField.getText())*60;
                } else delay = 0;
                try {
                    Process process = Runtime.getRuntime().exec("shutdown /s /t "+delay+" /f");
                    printResults(process);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
        restartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (DelayField.getText() != "") {
                    delay = Integer.parseInt(DelayField.getText())*60;
                } else delay = 0;
                try {
                    Process process = Runtime.getRuntime().exec("shutdown /r /t "+delay+" /f");
                    printResults(process);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
        abortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Process process = Runtime.getRuntime().exec("shutdown /a");
                    printResults(process);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });

        DelayField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                DelayField.selectAll();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Shutdown/restart utility");
        frame.setContentPane(new GUI().Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public static void printResults(Process process) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line = "";
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }

}
