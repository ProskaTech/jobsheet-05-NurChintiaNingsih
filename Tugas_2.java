/*
 * 
 * @Created By 21343011 - Nur Chintia Ningsih
 */
package JS5;
import javax.swing.JOptionPane;
public class Tugas_2 {

	public static void main(String[] args) {
String word1 = "", word2 = "";
        
        word1 = JOptionPane.showInputDialog("Enter word1 : ");
        word2 = JOptionPane.showInputDialog("Enter word2 : ");
        
        String msg = word1+word2+ "Hello";
        
        JOptionPane.showMessageDialog(null, msg);
        
        System.out.println(word1+word2);

	}

}
