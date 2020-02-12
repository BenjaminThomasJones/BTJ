import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

class codingBat extends JFrame implements ActionListener{
	
	//Methods from coding bat
	public int makeChocolate(int small, int big, int goal) {
		if(small+big*5<goal)return -1;
		if(goal%5>small)return -1;
  
		if(goal>big*5)return goal-big*5;
		return goal%5;
	}
	
	public String fizzString(String str) {
		String answ = "";
		if(str.charAt(0) == 'f') answ += "Fizz";
		if(str.charAt(str.length()-1) == 'b') answ += "Buzz";
		if(answ == "")return str;
		else return answ;
	}
	
	
	//Menu
	
	JMenuItem cb1, cb2, cb3;
	JMenu Skills;
	JMenuBar CodingBAMenu;
	
	
	//Layout

	JPanel Choccy = new JPanel();
	
	JLabel cTitle = new JLabel("MakeChocolate");
	JLabel cSmall = new JLabel("Small Bars");
	JLabel cBig = new JLabel("Big Bars");
	JLabel cGoal = new JLabel("Goal length");
	
	JLabel cBlank1 = new JLabel("");
	JLabel cBlank2 = new JLabel("");
	JLabel cBlank3 = new JLabel("");
	JLabel cBlank4 = new JLabel("");
	JLabel cBlank5 = new JLabel("");
	
	JTextField cSmallCount = new JTextField(5);
	JTextField cBigCount = new JTextField(5);
	JTextField cGoalCount = new JTextField(5);
	JTextField cResult = new JTextField(10);
	
	JButton cGo = new JButton("Result");
	
	JPanel ChoccyGrid = new JPanel(new GridLayout(5,3));
	
	
	//layout 2
	
	JPanel Fizzy = new JPanel();
	
	JLabel fTitle = new JLabel("FizzBuzz");
	
	JLabel fBlank1 = new JLabel("");
	JLabel fBlank2 = new JLabel("");
	
	JTextField fInput = new JTextField(5);
	JTextField fResult = new JTextField(10);
	
	JButton fGo = new JButton("Result");
	
	JPanel FizzyGrid = new JPanel(new GridLayout(2,3));
	
	//Layout 3: 3rd strike
	JPanel makeSense = new JPanel(new GridBagLayout());
	
	
	public codingBat(){
		
		super("CodingBat App");
		setSize( 600,400 );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		
		//copy all the stuff to choccy
		
		cGo.addActionListener (this);
		
		ChoccyGrid.add(cBlank1);
		ChoccyGrid.add(cTitle);
		ChoccyGrid.add(cBlank2);
		
		ChoccyGrid.add(cSmall);
		ChoccyGrid.add(cBig);
		ChoccyGrid.add(cGoal);
		
		ChoccyGrid.add(cSmallCount);
		ChoccyGrid.add(cBigCount);
		ChoccyGrid.add(cGoalCount);
		
		ChoccyGrid.add(cBlank3);
		ChoccyGrid.add(cGo);
		ChoccyGrid.add(cBlank4);
		
		ChoccyGrid.add(cBlank5);
		ChoccyGrid.add(cResult);
		
		Choccy.add(ChoccyGrid);
		
		
		//copy all the stuff to fizzy
		
		fGo.addActionListener (this);
		
		FizzyGrid.add(fBlank1);
		FizzyGrid.add(fTitle);
		FizzyGrid.add(fBlank2);
		
		FizzyGrid.add(fInput);
		FizzyGrid.add(fGo);
		FizzyGrid.add(fResult);
		
		Fizzy.add(FizzyGrid);
		
		
		//copy menu stuff
		
		CodingBAMenu = new JMenuBar();
		Skills = new JMenu("Programs");
		cb1 = new JMenuItem("Choccy");
		cb2 = new JMenuItem("Fizzy");
		cb3 = new JMenuItem("This one is empty please don't look at it");
		
		//put cbs into skills
		
		cb1.addActionListener(this);
		cb2.addActionListener(this);
		cb3.addActionListener(this);
		Skills.add(cb1);
		Skills.add(cb2);
		Skills.add(cb3);
		
		CodingBAMenu.add(Skills);
		
		setJMenuBar(CodingBAMenu);
		
		//details??
		
		setLayout(new BorderLayout());
		add("Center",Choccy);
		
		add(Choccy);
		
		cTitle.setHorizontalAlignment(SwingConstants.CENTER);
		cSmall.setHorizontalAlignment(SwingConstants.CENTER);
		cBig.setHorizontalAlignment(SwingConstants.CENTER);
		cGoal.setHorizontalAlignment(SwingConstants.CENTER);
		
		fTitle.setHorizontalAlignment(SwingConstants.CENTER);
		
		setVisible( true );
	}
	
	public static void main(String[] args ){
		
		codingBat gui = new codingBat();	
	}
	
	public void ChoccyPoint(){
		int small = Integer.valueOf(cSmallCount.getText());
		int big = Integer.valueOf(cBigCount.getText());
		int goal = Integer.valueOf(cGoalCount.getText());
		
		String output = String.valueOf(makeChocolate(small, big, goal));
		cResult.setText(output);
	}
	
	public void FizzyPoint(){
		String input = fInput.getText();
		
		fResult.setText(fizzString(input));
	}
	
	
	public void actionPerformed( ActionEvent event ){
		if(event.getSource()== cGo)
			ChoccyPoint();
		if(event.getSource()== fGo)
			FizzyPoint();
		
		if(event.getSource()== cb1)
			ChoccyPressed();
		if(event.getSource()== cb2)
			FizzyPressed();
		if(event.getSource()== cb3)
			whatEverDude();
	}
	
	
	public void ChoccyPressed(){
		add("Center",Choccy);
		Choccy.setVisible(true);
		Fizzy.setVisible(false);
		makeSense.setVisible(false);
	}
	
	public void FizzyPressed(){
		add("Center",Fizzy);
		Choccy.setVisible(false);
		Fizzy.setVisible(true);
		makeSense.setVisible(false);		
	}
	
	public void whatEverDude(){
		add("Center",makeSense);
		Choccy.setVisible(false);
		Fizzy.setVisible(false);
		makeSense.setVisible(true);
	}
}

