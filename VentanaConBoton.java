import javax.swing.*;
import java.awt.event.*;

public class VentanaConBoton extends JFrame{
    public VentanaConBoton() {
        setTitle("Ventana con Botón");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton boton = new JButton("Haz clic aquí");
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "¡Botón presionado!", "Mensaje", JOptionPane.WARNING_MESSAGE);
            }
        });
        add(boton);
        setVisible(true);
    }

    public static void main(String[] args) {
        new VentanaConBoton();
    }
}
