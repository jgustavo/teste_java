import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class IMC {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		FlowLayout layout = new FlowLayout();
		frame.setLayout(layout);
		frame.setSize(200, 200);
		JLabel jLabel = new JLabel("Digite a altura");
		JTextField textField = new JTextField(10);
		frame.add(jLabel);
		frame.add(textField);
		ActionListener action = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		};
		
		JButton button = new JButton("Calcular");
		button.addActionListener(action);
		frame.add(button);
		frame.setVisible(true);
		
		
	}

}
