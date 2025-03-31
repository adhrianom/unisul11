
package ws.unisul11;
import javax.swing.JOptionPane;
public class Unisul11 {

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        if (num % 2 == 0) {
            JOptionPane.showMessageDialog(null, num + " é múltiplo de 2");
        }
        else {
            JOptionPane.showMessageDialog(null, num + " não é múltiplo de 2");
        }
    }
}
