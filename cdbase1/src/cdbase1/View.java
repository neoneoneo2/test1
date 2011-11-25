package cdbase1;




import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.*;

public class View extends ViewPart {
	public static final String ID = "cdBase.view";

	public void createPartControl(Composite parent) 
	{
		parent.setLayout(new RowLayout());		
		Button button = new Button(parent, SWT.PUSH);
		Button button1 = new Button(parent, SWT.PUSH);
		Button button2 = new Button(parent, SWT.PUSH);		
		button.setText("Push me");
		button1.setText("Push me1");
		button2.setText("Push me2");
		
		//Нажатие кнопки
		button.addSelectionListener(
				new SelectionAdapter() {
		            @Override
		            public void widgetSelected(SelectionEvent e) 
		            {		               
		            	e.display.getActiveShell().setVisible(false);
		            	//parent.setVisible(false);
		            	//System.out.println("pressed");
		            }
		        });
		//button.setLayoutData(new RowData(50, 40));
		/*
		Image img=new Image(cdbase.View.class.getResourceAsStream("..\\icons\\cdbase_logo.png"));
		Label lbl=new Label(parent.getDisplay(),0);
		lbl.setImage(img);
		*/
	}

	
	public void setFocus() 
	{
		//viewer.getControl().setFocus();
	}
}