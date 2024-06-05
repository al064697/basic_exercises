import javax.swing.*;
import java.awt.event.*;

public class CalculadoraBasica extends JFrame {
    public CalculadoraBasica() {
        setTitle("Calculadora básica");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JTextField campoNumero1 = new JTextField(10);
        JTextField campoNumero2 = new JTextField(10);
        JButton botonSumar = new JButton("Sumar");
        JLabel etiquetaResultado = new JLabel("Resultado: ");

        botonSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int numero1 = Integer.parseInt(campoNumero1.getText());
                    int numero2 = Integer.parseInt(campoNumero2.getText());
                    int suma = numero1 + numero2;
                    etiquetaResultado.setText("Resultado: " + suma);
                } catch (NumberFormatException ex) {
                    etiquetaResultado.setText("Por favor, ingrese números válidos");
                    System.err.println("Error: " + ex.getMessage());
                }
            }
        });

        add(new JLabel("Numero 1: "));
        add(campoNumero1);
        add(new JLabel("Numero 2: "));
        add(campoNumero2);
        add(botonSumar);
        add(etiquetaResultado);

        setVisible(true);
    }

    public static void main(String[] args) {
        new CalculadoraBasica();
    }
    
}
