import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener{
	JTextField cTemp,fTemp;
	
	public MyFrame() {
		setTitle("¼·¾¾->È­¾¾ º¯È¯");
		
		JPanel p1 = new JPanel();
		JLabel cLabel = new JLabel("¼·¾¾");
		cTemp = new JTextField(10);
		p1.add(cLabel);
		p1.add(cTemp);
		
		JPanel p2 = new JPanel();
		JLabel fLabel = new JLabel("È­¾¾");
		fTemp = new JTextField(10);
		p2.setEnabled(false);
		p2.add(fLabel);
		p2.add(fTemp);
		
		JPanel p3 = new JPanel();
		JButton b = new JButton("º¯È¯");
		p3.add(b);
		
		b.addActionListener(this);
		
		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.CENTER);
		add(p3,BorderLayout.SOUTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,140);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(cTemp.getText().isEmpty())
			fTemp.setText("??????");
		
			else {
				String s = cTemp.getText();
				double c = Double.parseDouble(s);
				double f = c * 9.0 / 5.0 + 32;
				fTemp.setText("" + f);
			}
	}
}

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	
	}

}
