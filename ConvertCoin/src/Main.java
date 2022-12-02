import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Hi, Welcome CovertCoin!");

        String name = JOptionPane.showInputDialog("Registra tu nombre en ConverCoin!");

        JOptionPane.showMessageDialog(null, "Welcome, " + name);
        JOptionPane.showMessageDialog(null, name + " ConvertCoin es una plataforma donde te vamos ayudar a obtener la convercion de lo que elijas!");

        String [] Convercion ={"Temperatura","Moneda","Distancia"};

        Object opcion = JOptionPane.showInputDialog(null,"Selecciona una Convercion" + name, "Elegir",JOptionPane.QUESTION_MESSAGE,null, Convercion, Convercion[0]);

        switch (Convercion){
            case Temperatura:
                do{

                }
        }
    }
}