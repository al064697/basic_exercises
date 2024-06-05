import javax.swing.*;
import java.awt.event.*;

public class VentanaConComboBox extends JFrame {
    public VentanaConComboBox() {
        setTitle("Ventana con ComboBox"); 
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        String[] opciones = {"Opción 1", "Opción 2", "Opción 3"};
        JComboBox<String> comboBox = new JComboBox<>(opciones);
        JLabel etiquetaSeleccion = new JLabel("Selecciona una opción");

        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seleccion = (String) comboBox.getSelectedItem();
                etiquetaSeleccion.setText("Seleccionaste: " + seleccion);
            }
        });

        add(comboBox);
        add(etiquetaSeleccion);

        setVisible(true);
    }

    public static void main(String[] args) {
        new VentanaConComboBox();
    }
    
}
