import javax.swing.*;

public class VentanaBasica extends JFrame {
    public VentanaBasica() {
        setTitle("Ventana Basica");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); //Centrar la ventana
        setVisible(true);
    }

    public static void main(String[] args) {
        new VentanaBasica();
    }
}