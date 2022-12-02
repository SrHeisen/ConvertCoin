import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,"Hi, Welcome CovertCoin!");

        String name = JOptionPane.showInputDialog("Registra tu nombre en ConverCoin!");

        JOptionPane.showMessageDialog(null, "Welcome, " + name);

        
    }
}