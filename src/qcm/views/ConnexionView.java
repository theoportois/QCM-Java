package qcm.views;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import qcm.controllers.ConnexionController;

public class ConnexionView {

	protected Shell shell;
	private Text textMail;
	public Text getTextMail() {
		return textMail;
	}

	public Text getTextPassword() {
		return textPassword;
	}

	private Text textPassword;
	private Button btnConnexion;
	
	public Button getBtnConnexion() {
		return btnConnexion;
	}

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ConnexionController controller=new ConnexionController(new ConnexionView());
			controller.init();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	
	public void init(){
		this.createContents();
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		shell.setLayout(null);
		
		btnConnexion = new Button(shell, SWT.NONE);
		
		btnConnexion.setBounds(175, 121, 75, 25);
		btnConnexion.setText("Connexion");
		
		textMail = new Text(shell, SWT.BORDER);
		textMail.setBounds(106, 54, 215, 21);
		
		Label lblMail = new Label(shell, SWT.NONE);
		lblMail.setAlignment(SWT.RIGHT);
		lblMail.setBounds(45, 60, 55, 15);
		lblMail.setText("Mail :");
		
		Label lblPassword = new Label(shell, SWT.NONE);
		lblPassword.setText("Password :");
		lblPassword.setAlignment(SWT.RIGHT);
		lblPassword.setBounds(25, 87, 75, 15);
		
		textPassword = new Text(shell, SWT.BORDER);
		textPassword.setBounds(106, 81, 215, 21);

	}
}
