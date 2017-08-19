import javax.swing.JOptionPane;

public class LastSummer {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Hello,what's your name");
		JOptionPane.showMessageDialog(null, "I know that you ate food last summer, " + name + ". Hahaha!");
	}
}
