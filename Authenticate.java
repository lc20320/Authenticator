import javax.swing.JOptionPane;

/**
*
* Luis Cervantes
* This program authenticates username and password
*
*/

public class Authenticate {

	public static void main(String [] args) {
		String username = "User";
		String pass = "Pass123";

		String userinput = JOptionPane.showInputDialog("Enter Username: ");
		String passinput = JOptionPane.showInputDialog("Enter Password: ");

		if (userinput.equals(username) && passinput.equals(pass)) {
			JOptionPane.showMessageDialog(null, "Welcome Username!");

		} else {
			JOptionPane.showMessageDialog(null, "Invalid Username or Password");
		}
	}
}


