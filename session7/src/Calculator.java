import javax.swing.*;
import java.awt.*;

public class Calculator {
    private JFrame frame;
    private JPanel calculator;
    private JPanel engineerCalculator;
    private JTabbedPane tabs;

    public Calculator() {
        frame = new JFrame();
        frame.setTitle("Aut calculator");
        frame.setSize(500, 500);
        frame.setLocation(100, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculator = new JPanel();
        engineerCalculator = new JPanel();
        tabs = new JTabbedPane();
        tabs.setBounds(50, 150, 300, 300);

        screen();
        setCalculator();
        setEngineerCalculator();
        tabs.add("calculator", calculator);
        tabs.add("engineering calculator", engineerCalculator);
        frame.add(tabs);

        frame.setVisible(true);



    }

    public void screen() {
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setFont(new Font("Arial", 14, 14));

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setLocation(20, 20);
        scrollPane.setSize(300, 100);

        frame.add(scrollPane);
    }

    public void setCalculator() {
        calculator = new JPanel();
        calculator.setLayout(new GridLayout(4, 4));

        for (int i = 0; i < 4; i++) {
            if(i == 3) {
                calculator.add(new Button(""));
                calculator.add(new Button("0"));
                calculator.add(new Button("%"));
                calculator.add(new Button("/"));
                break;
            }
            for (int j = 0; j < 3; j++)
                calculator.add(new Button(3 * i + j + 1 + ""));
            if(i == 0)
                calculator.add(new Button("+"));
            else if(i == 1)
                calculator.add(new Button("-"));
            else if(i == 2)
                calculator.add(new Button("*"));
        }

    }

    public void setEngineerCalculator() {
        engineerCalculator = new JPanel();
        engineerCalculator.setLayout(new GridLayout(5, 5));

        for (int i = 0; i < 4; i++) {
            if(i == 3) {
                engineerCalculator.add(new Button("shift"));
                engineerCalculator.add(new Button("0"));
                engineerCalculator.add(new Button("%"));
                engineerCalculator.add(new Button("/"));
                engineerCalculator.add(new Button("log"));
                engineerCalculator.add(new Button(""));
                engineerCalculator.add(new Button(""));
                engineerCalculator.add(new Button(""));
                engineerCalculator.add(new Button("e"));
                engineerCalculator.add(new Button("pi"));

                break;
            }
            for (int j = 0; j < 3; j++)
                engineerCalculator.add(new Button(3 * i + j + 1 + ""));
            if(i == 0) {
                engineerCalculator.add(new Button("+"));
                engineerCalculator.add(new Button("sin(cos)"));
            }
            else if(i == 1) {
                engineerCalculator.add(new Button("-"));
                engineerCalculator.add(new Button("tan(cot)"));
            }
            else if(i == 2) {
                engineerCalculator.add(new Button("*"));
                engineerCalculator.add(new Button("exp"));
            }
        }
    }

}