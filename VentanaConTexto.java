import javax.swing.*;
import java.awt.event.*;

public class VentanaConTexto extends JFrame {
    public VentanaConTexto() {
        setTitle("Ventana con Campo de Texto");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JTextField campoTexto = new JTextField(20);
        JLabel etiqueta = new JLabel("Escribe algo y presiona ENTER");
        
        campoTexto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = campoTexto.getText();
                etiqueta.setText(texto);
            }
        });
        add(campoTexto);
        add(etiqueta);
        
        setVisible(true);
    }

    public static void main(String[] args) {
        new VentanaConTexto(); 
    }
}
