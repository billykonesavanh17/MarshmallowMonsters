package marshmallows.view;

import javax.swing.JOptionPane;

public class MarshmallowOutput
{
	public void displayMonsterConsole(String info)
	{
		System.out.println("My monster info is: " + info);
	}

	public void displayMonsterGUI(String info)
	{
		JOptionPane.showMessageDialog(null, "My monster information is:" + info);
	}
	
	public void displayMonsterGUI1(String info)
	{
		JOptionPane.showMessageDialog(null, "Type in new info for new monster.");
	}
	
	public void displayMonsterGUI2(String info)
	{
		JOptionPane.showMessageDialog(null, "What is your monsters name?");
	}
	
	public void displayMonsterGUI3(String info)
	{
		JOptionPane.showMessageDialog(null, "How many legs?");
	}
	
	public void showResponse(String info)
	{
		JOptionPane.showMessageDialog(null,  info);
	}
	
	public String grabAnswer(String stuff)
	{
		String answer = "";
		answer = JOptionPane.showInputDialog(null, stuff);
		return answer;
	}
	
}
