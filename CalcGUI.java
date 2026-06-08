import javax.swing.*;

public class CalcGUI {
    public static void avvia(){
        JFrame finestra = new JFrame("Calcolatirce");
        finestra.setSize(330,450);
        finestra.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        finestra.setLayout(null);

        //-------------------------------//

        JTextField output = new JTextField();
        output.setBounds(20,20,270,60);
        output.setEditable(false);
        finestra.add(output);

        //------------------------ 90 160 230 300//

        JButton uno = new JButton("1");
        uno.setBounds(20, 230, 60, 60);
        finestra.add(uno);

        JButton due = new JButton("2");
        due.setBounds(90, 230, 60, 60);
        finestra.add(due);

        JButton tre = new JButton("3");
        tre.setBounds(160, 230, 60, 60);
        finestra.add(tre);

        JButton quattro = new JButton("4");
        quattro.setBounds(20, 160, 60, 60);
        finestra.add(quattro);

        JButton cinque = new JButton("5");
        cinque.setBounds(90, 160, 60, 60);
        finestra.add(cinque);

        JButton sei = new JButton("6");
        sei.setBounds(160, 160, 60, 60);
        finestra.add(sei);

        JButton sette = new JButton("7");
        sette.setBounds(20, 90, 60, 60);
        finestra.add(sette);

        JButton otto = new JButton("8");
        otto.setBounds(90, 90, 60, 60);
        finestra.add(otto);

        JButton nove = new JButton("9");
        nove.setBounds(160, 90, 60, 60);
        finestra.add(nove);

        JButton zero = new JButton("0");
        zero.setBounds(20, 300, 60, 60);
        finestra.add(zero);

        JButton cancella = new JButton("C");
        cancella.setBounds(90, 300, 60, 60);
        finestra.add(cancella);

        JButton uguale = new JButton("=");
        uguale.setBounds(160, 300, 60, 60);
        finestra.add(uguale);

        JButton diviso = new JButton("/");
        diviso.setBounds(230, 90, 60, 60);
        finestra.add(diviso);

        JButton moltiplicazione = new JButton("*");
        moltiplicazione.setBounds(230, 160, 60, 60);
        finestra.add(moltiplicazione);

        JButton sottrazione = new JButton("-");
        sottrazione.setBounds(230, 230, 60, 60);
        finestra.add(sottrazione);

        JButton addizione = new JButton("+");
        addizione.setBounds(230, 300, 60, 60);
        finestra.add(addizione);

        //-------------------------------//

        String[] primoNumero = {""};
        String[] operatore = {""};

        uno.addActionListener(e -> {
            output.setText(output.getText() + "1");
        });

        due.addActionListener(e -> {
            output.setText(output.getText() + "2");
        });

        tre.addActionListener(e -> {
            output.setText(output.getText() + "3");
        });
        
        quattro.addActionListener(e -> {
            output.setText(output.getText() + "4");
        });

        cinque.addActionListener(e -> {
            output.setText(output.getText() + "5");
        });

        sei.addActionListener(e -> {
            output.setText(output.getText() + "6");
        });

        sette.addActionListener(e -> {
            output.setText(output.getText() + "7");
        });

        otto.addActionListener(e -> {
            output.setText(output.getText() + "8");
        });

        nove.addActionListener(e -> {
            output.setText(output.getText() + "9");
        });

        zero.addActionListener(e -> {
            output.setText(output.getText() + "0");
        });

        addizione.addActionListener(e -> {
            primoNumero[0] = output.getText();
            operatore[0] = "+";
            output.setText("");
        });

        sottrazione.addActionListener(e -> {
            primoNumero[0] = output.getText();
            operatore[0] = "-";
            output.setText("");
        });

        moltiplicazione.addActionListener(e -> {
            primoNumero[0] = output.getText();
            operatore[0] = "*";
            output.setText("");
        });

        diviso.addActionListener(e -> {
            primoNumero[0] = output.getText();
            operatore[0] = "/";
            output.setText("");
        });

        uguale.addActionListener(e -> {
            double x = Double.parseDouble(primoNumero[0]);
            double y = Double.parseDouble(output.getText());

            switch(operatore[0]){
                case "+" -> output.setText(String.valueOf(x + y));
                case "-" -> output.setText(String.valueOf(x - y));
                case "*" -> output.setText(String.valueOf(x * y));
                case "/" -> {
                    if(y == 0){
                        output.setText("Impossibile dividere per 0");
                    } else {
                        output.setText(String.valueOf(x / y));
                    }
                }
            }
        });

        cancella.addActionListener(e -> {
            output.setText("");
            primoNumero[0] = "";
            operatore[0] = "";
        });

        finestra.setVisible(true);
    }
}