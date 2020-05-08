import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * this class implements a calculator with graphical interface
 */
public class Calculator {
    //our calculator has a frame and we add a panel and the buttons and textfield to it
    private JFrame frame ;
    private JTextArea textField ;
    //the panel we add buttons to
    private JPanel p;
    private JButton add;
    private JButton subtract;
    private JButton multiply;
    private JButton divide;
    private JButton equals;
    //this clear up the whole textfield
    private JButton clear;
    //this button delets the last integer on textfield
    private JButton delet;
    //we have an array of integer buttons
    private JButton[] digits=digits=new JButton[10];
    //this integer show which operator (add,subtract,..)we use now .if 1 its add,2 its subtract,3 its multiply 4 division
    private int operator;
    //a is the first number we are operating b is the second and result is the result of operation
    private double a, b, result;

    /**
     * this constructs our calculator
     */
    public Calculator() {
        frame = new JFrame();
        //setting the location of the frame and the size and the layout null because we set the components manually
        frame.setTitle("Aut calculator");
        frame.setSize(400, 500);
        frame.setLocation(100, 150);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textField= new JTextArea();
        p=new JPanel();
        textField.addKeyListener(new keyListener());
        addTextScreen();
        addButtons();
        addMenue();
        frame.setVisible(true);

    }

    /**
     * this is an inner class that implements ActionListener interface for using buttons
     */
    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < 10; i++) {
                //this checks  the ActionEvent is the same to which button so it does the right task
                if (e.getSource() == digits[i]) {
                    String s = textField.getText();
                    s += (i);
                    textField.setText(s);
                }
            }

            if (e.getSource() == add) {
                a = Double.parseDouble(textField.getText());
                textField.setText("");
                operator = 1;
            }
            if (e.getSource() == subtract) {
                a = Double.parseDouble(textField.getText());
                textField.setText("");
                operator = 2;
            }
            if (e.getSource() == multiply) {
                a = Double.parseDouble(textField.getText());
                textField.setText("");
                operator = 3;
            }
            if (e.getSource() == divide) {
                a = Double.parseDouble(textField.getText());
                textField.setText("");
                operator = 4;
            }
            if (e.getSource() == equals) {
                b = Double.parseDouble(textField.getText());
                if (operator == 1)
                    result = a + b;
                else if (operator == 2)
                    result = a - b;
                else if (operator == 3)
                    result = a * b;
                else
                    result = a / b;
                textField.setText("" + result);
            }
            if (e.getSource() == delet) {
                String s = textField.getText();
                textField.setText("");
                String newString = s.substring(0, s.length() - 1);
                textField.setText(newString);
            }

            if (e.getSource() == clear) {
                textField.setText("");
            }
        }
    }
        private class keyListener implements KeyListener {

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_0) {
                    String s = textField.getText();
                    s += (0);
                    textField.setText(s);

                }
                if (e.getKeyCode() == KeyEvent.VK_1) {
                    String s = textField.getText();
                    s += (1);
                    textField.setText(s);

                }
                if (e.getKeyCode() == KeyEvent.VK_2) {
                    String s = textField.getText();
                    s += (2);
                    textField.setText(s);

                }
                if (e.getKeyCode() == KeyEvent.VK_3) {
                    String s = textField.getText();
                    s += (3);
                    textField.setText(s);

                }
                if (e.getKeyCode() == KeyEvent.VK_4) {
                    String s = textField.getText();
                    s += (4);
                    textField.setText(s);

                }
                if (e.getKeyCode() == KeyEvent.VK_5) {
                    String s = textField.getText();
                    s += (5);
                    textField.setText(s);

                }
                if (e.getKeyCode() == KeyEvent.VK_6) {
                    String s = textField.getText();
                    s += (6);
                    textField.setText(s);

                }
                if (e.getKeyCode() == KeyEvent.VK_7) {
                    String s = textField.getText();
                    s += (7);
                    textField.setText(s);

                }
                if (e.getKeyCode() == KeyEvent.VK_8) {
                    String s = textField.getText();
                    s += (8);
                    textField.setText(s);

                }
                if (e.getKeyCode() == KeyEvent.VK_9) {
                    String s = textField.getText();
                    s += (9);
                    textField.setText(s);

                }

                if (e.getKeyCode() == KeyEvent.VK_ADD) {
                    a = Double.parseDouble(textField.getText());
                    textField.setText("");
                    operator = 1;

                }
                if (e.getKeyCode() == KeyEvent.VK_SUBTRACT) {
                    a = Double.parseDouble(textField.getText());
                    textField.setText("");
                    operator = 2;

                }
                if (e.getKeyCode() == KeyEvent.VK_MULTIPLY) {
                    a = Double.parseDouble(textField.getText());
                    textField.setText("");
                    operator = 3;

                }
                if (e.getKeyCode() == KeyEvent.VK_DIVIDE) {
                    a = Double.parseDouble(textField.getText());
                    textField.setText("");
                    operator = 4;

                }
                //if we press escape the frame will be closed
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE){
                    System.exit(0);

                }

                if (e.getKeyCode() == KeyEvent.VK_EQUALS) {
                    b = Double.parseDouble(textField.getText());
                    if (operator == 1)
                        result = a + b;
                    else if (operator == 2)
                        result = a - b;
                    else if (operator == 3)
                        result = a * b;
                    else
                        result = a / b;
                    textField.setText("" + result);

                }

                frame.setFocusable(true);
            }


            @Override
            public void keyPressed(KeyEvent e) {

            }
        }

        //this method sets the textfield .the size and the location and tooltip for it
        public void addTextScreen() {
            textField.setSize(300, 70);
            textField.setLocation(20, 20);
            textField.setEditable(false);
            textField.setToolTipText("you can see the result here");
            frame.add(textField);

        }

    /**
     * this method add buttons to the JPanel
     */
    public void addButtons() {

            //here we set the size and the location of the panel
            p.setSize(300, 300);
            p.setLocation(20, 100);
            //we use Gridlayout to set the buttons in their place
            p.setLayout(new GridLayout(6, 4));
            keyListener listener=new keyListener();
            //this loop adds integers from 0 to 9 to the panel
            for (int i = 0; i < 10; i++) {

                JButton number = new JButton(String.valueOf(i));
                //here we add instances KeyListener and ActionListener to the integer buttons
                number.addActionListener(new ButtonListener());
                number.addKeyListener(listener);
                p.add(number);
                //adding buttons to the array
                digits[i] = number;
            }

            add = new JButton("+");
            add.setToolTipText("you can add integers ");
            add.addActionListener(new ButtonListener());
            add.addKeyListener(listener);
            p.add(add);


            subtract = new JButton("-");
            subtract.setToolTipText("you can minus integers");
            subtract.addActionListener(new ButtonListener());
            subtract.addKeyListener(listener);
            p.add(subtract);


            multiply = new JButton("*");
            multiply.setToolTipText("use this to multiplication ");
            multiply.addActionListener(new ButtonListener());
            multiply.addKeyListener(listener);
            p.add(multiply);


            divide = new JButton("/");
            divide.setToolTipText("use this to divide");
            divide.addActionListener(new ButtonListener());
            divide.addKeyListener(listener);
            p.add(divide);


            equals = new JButton("=");
            equals.setToolTipText("use this to get the result");
            equals.addActionListener(new ButtonListener());
            equals.addKeyListener(listener);
            p.add(equals);



            clear = new JButton("clear");
            p.add(clear);
            clear.setToolTipText("you can clear up");
            clear.addKeyListener(listener);
            clear.addActionListener(new ButtonListener());

            delet = new JButton("delet");
            p.add(delet);
            delet.setToolTipText("you can delet number");
            delet.addKeyListener(listener);
            delet.addActionListener(new ButtonListener());
            frame.add(p);
        }

    /**
     * this method adds a menubar to the top pf frame and adds JMenu to it and some items
     */
    public void addMenue() {
        //we make instance of JMenu then add it to the frame
            JMenuBar menuBar = new JMenuBar();
            frame.setJMenuBar(menuBar);

            //here we make a menu and add it to the JMenu
            JMenu jm = new JMenu("Menu");
            //we set a Mnemonic for it .it means if you press alt and M it shows the menu
            jm.setMnemonic('M');
            menuBar.add(jm);

            //we add the items to the menu.first one is exit .if we press the exit the frame is closed
            JMenuItem jmt = new JMenuItem("Exit");
            jmt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        jm.add(jmt);

            //we add  item copy and set Accelerator to it .in this code the Accelerator is pressing control and c at the same time
            JMenuItem copy = new JMenuItem("Copy");
            jm.add(copy);
            copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_MASK));
        }


    }

