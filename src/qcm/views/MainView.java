package qcm.views;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Table;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

import qcm.controllers.MainController;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.custom.CBanner;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.List;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.jface.text.TextViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.layout.TreeColumnLayout;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class MainView {

	protected Shell shlQcmjava;
	private Table table_1;
	private Table table;
	private Button btnTest;
	
	
	
	/**
	 * Launch the application.
	 * @param args
	 */
//	public static void main(String[] args) {
//		try {
//			MainController controller=new MainController(new MainView());
//			controller.init();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}



	public Button getBtnTest() {
		return btnTest;
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		shlQcmjava.open();
		shlQcmjava.layout();
		while (!shlQcmjava.isDisposed()) {
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
	 * @wbp.parser.entryPoint
	 */
	protected void createContents() {
		shlQcmjava = new Shell();
		shlQcmjava.setText("QCM-Java\r\n");
		shlQcmjava.setMinimumSize(new Point(50, 50));
		shlQcmjava.setSize(691, 607);
		shlQcmjava.setLayout(null);
		
		TabFolder tabFolder = new TabFolder(shlQcmjava, SWT.NONE);
		tabFolder.setBounds(0, 0, 447, 446);
		
		TabItem tbtmNewItem = new TabItem(tabFolder, SWT.NONE);
		tbtmNewItem.setText("New Item");
		
		Composite composite_1 = new Composite(tabFolder, SWT.NONE);
		tbtmNewItem.setControl(composite_1);
		
		TableViewer tableViewer = new TableViewer(composite_1, SWT.BORDER | SWT.FULL_SELECTION);
		table = tableViewer.getTable();
		table.setBounds(29, 54, 339, 222);
		table.setBackgroundMode(0);
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		
		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnNom = tableViewerColumn.getColumn();
		tblclmnNom.setWidth(100);
		tblclmnNom.setText("Nom");
		
		TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnDomaine = tableViewerColumn_1.getColumn();
		tblclmnDomaine.setWidth(100);
		tblclmnDomaine.setText("Domaine");
		
		btnTest = new Button(composite_1, SWT.NONE);
		btnTest.setBounds(120, 324, 75, 25);
		btnTest.setText("Test");
		
		
		TabItem tabItem = new TabItem(tabFolder, SWT.NONE);
		tabItem.setText("New Item");
		
		Composite composite = new Composite(tabFolder, SWT.NONE);
		tabItem.setControl(composite);
		composite.setLayout(null);
		
		Button btnNewButton = new Button(composite, SWT.NONE);
		btnNewButton.setBounds(134, 119, 75, 25);
		btnNewButton.setText("New Button");
		
		TableViewer tableViewer_1 = new TableViewer(composite, SWT.BORDER | SWT.FULL_SELECTION);
		table_1 = tableViewer_1.getTable();
		table_1.setBounds(124, 202, 85, 85);
		
		
	}
}
