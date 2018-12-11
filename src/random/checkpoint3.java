package random;

import javax.swing.JOptionPane;

public class checkpoint3 {
public static void main(String[] args) {
String food1 = JOptionPane.showInputDialog("how many cups of flour do you have");
int food = Integer.parseInt(food1);
if (food<2 ) {
	JOptionPane.showMessageDialog(null,  "go to the store and buy more cups of flour");
}
	
	
	
	
	String food2 = JOptionPane.showInputDialog("how many cookies are you giving out");
	int ffood = Integer.parseInt(food2);
	if (ffood>30) {
		JOptionPane.showInputDialog("you are lucky to have many friends");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
}
