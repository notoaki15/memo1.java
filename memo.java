import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Edit implements ActionListener {

	private JFrame mainFrame;
	private Container contentPane;
	private JTextField textField;
	private JTextArea textArea;
	private JPanel buttonPane;
	private JScrollPane scrollPane;
	private JButton addButton;
	private JButton clearButton;
	
	public Edit(){
		mainFrame = new JFrame();
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(400,400);
		mainFrame.setLocationRelativeTo(null);
		contentPane = mainFrame.getContentPane();
		textField = new JTextField();
		textArea = new JTextArea();
		scrollPane  = new JScrollPane(textArea);
		addButton = new JButton("追加");
		clearButton = new JButton("消去");
		
		addButton.addActionListener(this);
		clearButton.addActionListener(this);
		
		buttonPane = new JPanel();
		buttonPane.add(addButton);
		buttonPane.add(clearButton);
		contentPane.add(textField, BorderLayout.NORTH);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		contentPane.add(buttonPane,BorderLayout.SOUTH);
		mainFrame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event){
		if(event.getSource() == addButton){
			textArea.append(textField.getText()+"\n");			
		}
		if(event.getSource() == clearButton){
			textArea.setText(null);
		}
	}
	public static void main(String[]args){
		new Edit();
	}
}
