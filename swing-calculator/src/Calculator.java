import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator  implements ActionListener{
	boolean isOperatorClicked=false,delOperator=false,squareOperator=false,cubeOperator=false;
	boolean plusOperator=false,minusOperator=false,mulOperator=false,divOperator=false;
	String oldValue;
	JFrame jf;   //jf is now global
	JLabel displayLabel; //displayLabel is made Global
	JButton sevenButton,eightButton,nineButton,fiveButton,sixButton;
	JButton fourButton,threeButton,twoButton,oneButton,dotButton,zeroButton;
	JButton equalButton,plusButton,minusButton,mulButton,divButton;
	JButton squareButton,cubeButton, delButton,clearButton;
	
	public Calculator() {
		jf=new JFrame("calculator");
		jf.setLayout(null);
		jf.setSize(600,600);
		jf.setLocation(300,150);
		jf.getContentPane().setBackground(Color.GRAY);
		
		displayLabel=new JLabel();
		displayLabel.setBounds(25,45,530,40);
		displayLabel.setBackground(Color.black); 
		displayLabel.setOpaque(true);
		displayLabel.setForeground(Color.white);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setFont((new Font("Verdana", Font.PLAIN, 25)));
		jf.add(displayLabel);
		
	    sevenButton=new JButton("7");
		sevenButton.setBounds(50,130,80,80);
		sevenButton.setFont((new Font("Verdana", Font.PLAIN, 25)));
		sevenButton.setForeground(Color.white);
		sevenButton.setBackground(Color.BLACK);
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		
	    eightButton=new JButton("8");
		eightButton.setBounds(150,130,80,80);
		eightButton.setFont((new Font("Verdana", Font.PLAIN, 25)));
		eightButton.setForeground(Color.white);
		eightButton.setBackground(Color.BLACK);
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
	    nineButton=new JButton("9");
		nineButton.setBounds(250,130,80,80);
		nineButton.setFont((new Font("Verdana", Font.PLAIN, 25)));
		nineButton.setForeground(Color.white);
		nineButton.setBackground(Color.BLACK);
		nineButton.addActionListener(this);
		jf.add(nineButton);
					
		 fourButton=new JButton("4");
		 fourButton.setBounds(50,230,80,80);
		 fourButton.setFont((new Font("Verdana", Font.PLAIN, 25)));
		 fourButton.setForeground(Color.white);
		 fourButton.setBackground(Color.BLACK);
		 fourButton.addActionListener(this);
		jf.add(fourButton);
		
		 fiveButton=new JButton("5");
		 fiveButton.setBounds(150,230,80,80);
		 fiveButton.setFont((new Font("Verdana", Font.PLAIN, 25)));
		 fiveButton.setForeground(Color.white);
		 fiveButton.setBackground(Color.BLACK);
		 fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
	     sixButton=new JButton("6");
		 sixButton.setBounds(250,230,80,80);
		 sixButton.setFont((new Font("Verdana", Font.PLAIN, 25)));
		 sixButton.setForeground(Color.white);
		 sixButton.setBackground(Color.BLACK);
		 sixButton.addActionListener(this);
		jf.add(sixButton);
		
		oneButton=new JButton("1");
		oneButton.setBounds(50,330,80,80);
		oneButton.setFont((new Font("Verdana", Font.PLAIN, 25)));
		oneButton.setForeground(Color.white);
		oneButton.setBackground(Color.BLACK);
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
	    twoButton=new JButton("2");
		twoButton.setBounds(150,330,80,80);
		twoButton.setFont((new Font("Verdana", Font.PLAIN, 25)));
		twoButton.setForeground(Color.white);
		twoButton.setBackground(Color.BLACK);
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
	    threeButton=new JButton("3");
		threeButton.setBounds(250,330,80,80);
		threeButton.setFont((new Font("Verdana", Font.PLAIN, 25)));
		threeButton.setForeground(Color.white);
		threeButton.setBackground(Color.BLACK);
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
	    dotButton=new JButton(".");
		dotButton.setBounds(50,430,80,80);
		dotButton.setFont((new Font("Verdana", Font.PLAIN, 25)));
		dotButton.setForeground(Color.white);
		dotButton.setBackground(Color.BLACK);
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(150,430,80,80);
		zeroButton.setFont((new Font("Verdana", Font.PLAIN, 25)));
		zeroButton.setForeground(Color.white);
		zeroButton.setBackground(Color.BLACK);
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		 equalButton=new JButton("=");
		 equalButton.setBounds(250,430,80,80);
		 equalButton.setFont((new Font("Verdana", Font.PLAIN, 25)));
		 equalButton.setForeground(Color.white);
		 equalButton.setBackground(Color.BLACK);
		 equalButton.addActionListener(this);
		jf.add(equalButton);
		
	    plusButton=new JButton("+");
		plusButton.setBounds(350,430,80,80);
		plusButton.setFont((new Font("Verdana", Font.PLAIN, 25)));
		plusButton.setForeground(Color.white);
		plusButton.setBackground(Color.BLACK);
		plusButton.addActionListener(this);
		jf.add(plusButton);
		
		minusButton=new JButton("-");
		minusButton.setBounds(350,330,80,80);
		minusButton.setFont((new Font("Verdana", Font.PLAIN, 25)));
		minusButton.setForeground(Color.white);
		minusButton.setBackground(Color.BLACK);
		minusButton.addActionListener(this);
		jf.add(minusButton);
		
		
		 mulButton=new JButton("x");
		 mulButton.setBounds(350,230,80,80);
		 mulButton.setFont((new Font("Verdana", Font.PLAIN, 25)));
		 mulButton.setForeground(Color.white);
		 mulButton.setBackground(Color.BLACK);
		 mulButton.addActionListener(this);
		jf.add(mulButton);
		
		divButton=new JButton("/");
		divButton.setBounds(350,130,80,80);
		divButton.setFont((new Font("Verdana", Font.PLAIN, 25)));
		divButton.setForeground(Color.white);
		divButton.setBackground(Color.BLACK);
		divButton.addActionListener(this);
		jf.add(divButton);
		
	    squareButton=new JButton("^2");
	    squareButton.setBounds(450,130,80,80);
	    squareButton.setFont((new Font("Verdana", Font.PLAIN, 25)));
	    squareButton.setForeground(Color.white);
	    squareButton.setBackground(Color.BLACK);
	    squareButton.addActionListener(this);
		jf.add(squareButton);
		
		cubeButton=new JButton("^3");
		cubeButton.setBounds(450,230,80,80);
		cubeButton.setFont((new Font("Verdana", Font.PLAIN, 25)));
		cubeButton.setForeground(Color.white);
		cubeButton.setBackground(Color.BLACK);
		cubeButton.addActionListener(this);
		jf.add(cubeButton);
		
		 delButton=new JButton("del");
		 delButton.setBounds(450,330,80,80);
		 delButton.setFont((new Font("Verdana", Font.PLAIN, 25)));
		 delButton.setForeground(Color.white);
		 delButton.setBackground(Color.BLACK);
		 delButton.addActionListener(this);
		jf.add(delButton);
				
		
		clearButton=new JButton("C");
		clearButton.setBounds(450,430,80,80);
		clearButton.setFont((new Font("Verdana", Font.PLAIN, 25)));
		clearButton.setForeground(Color.white);
		clearButton.setBackground(Color.BLACK);
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		}
	
 public static void main(String args[]) {
	new Calculator();
 }

@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==sevenButton)	{
		if(isOperatorClicked) {
			displayLabel.setText("7");
			isOperatorClicked=false;
		}else {
			displayLabel.setText(displayLabel.getText()+"7");
			
		}			   
	
	}else if(e.getSource()==eightButton)	{
		 if(isOperatorClicked) {
			displayLabel.setText("8");
			isOperatorClicked=false;
		 }else {
			displayLabel.setText(displayLabel.getText()+"8");
		 }
	}else if(e.getSource()==nineButton)	{
		 if(isOperatorClicked) {
			displayLabel.setText("9");
			isOperatorClicked=false;
		 }else {
			displayLabel.setText(displayLabel.getText()+"9");
		 }
	}else if(e.getSource()==fourButton)	{
		if(isOperatorClicked) {
			displayLabel.setText("4");
			isOperatorClicked=false;
		 }else {
			displayLabel.setText(displayLabel.getText()+"4");
		 }
	}else if(e.getSource()==fiveButton)	{
		if(isOperatorClicked) {
			displayLabel.setText("5");
			isOperatorClicked=false;
		 }else {
			displayLabel.setText(displayLabel.getText()+"5");
		 }
	}else if(e.getSource()==sixButton)	{
		if(isOperatorClicked) {
			displayLabel.setText("6");
			isOperatorClicked=false;
		 }else {
			displayLabel.setText(displayLabel.getText()+"6");
		 }
	}else if(e.getSource()==oneButton)	{
		if(isOperatorClicked) {
			displayLabel.setText("1");
			isOperatorClicked=false;
		 }else {
			displayLabel.setText(displayLabel.getText()+"1");
		 }
	}else if(e.getSource()==twoButton)	{
		if(isOperatorClicked) {
			displayLabel.setText("2");
			isOperatorClicked=false;
		 }else {
			displayLabel.setText(displayLabel.getText()+"2");
		 }
	}else if(e.getSource()==threeButton)	{
		if(isOperatorClicked) {
			displayLabel.setText("3");
			isOperatorClicked=false;
		 }else {
			displayLabel.setText(displayLabel.getText()+"3");
		 }
	}else if(e.getSource()==zeroButton)	{
		if(isOperatorClicked) {
			displayLabel.setText("0");
			isOperatorClicked=false;
		 }else {
			displayLabel.setText(displayLabel.getText()+"0");
		 }
	}else if(e.getSource()==dotButton)	{
		displayLabel.setText(displayLabel.getText()+".");
				
	}else if(e.getSource()==squareButton)	{
		isOperatorClicked=true;
		squareOperator=true;
		oldValue=displayLabel.getText();
	}else if(e.getSource()==cubeButton)	{
		isOperatorClicked=true;
		cubeOperator=true;
		oldValue=displayLabel.getText();
	}else if(e.getSource()==delButton)	{
		delOperator=true;
		String currentText=displayLabel.getText();
		     if(currentText.isEmpty()) {
			      displayLabel.setText(""); 
		          }else {
			      displayLabel.setText(currentText.substring(0, currentText.length()-1));
		          }		 
          delOperator=false;
	}else if(e.getSource()==divButton)	{
		isOperatorClicked=true;
		divOperator=true;
		oldValue=displayLabel.getText();
	}else if(e.getSource()==mulButton)	{
		isOperatorClicked=true;
		mulOperator=true;
		oldValue=displayLabel.getText();	;
	}else if(e.getSource()==minusButton)	{
		isOperatorClicked=true;
		minusOperator=true;
		oldValue=displayLabel.getText();
	}else if(e.getSource()==plusButton)	{
		isOperatorClicked=true;
		plusOperator=true;
		oldValue=displayLabel.getText();
	}else if(e.getSource()==equalButton)	{
		String newValue=displayLabel.getText();
		float newValueF=Float.parseFloat(newValue);
		float oldValueF=Float.parseFloat(oldValue);
		        if(plusOperator) {
		              float result=oldValueF+newValueF;	
		             displayLabel.setText(result+"");
		             plusOperator=false;
		            }
		        else if(minusOperator) {
    		         float result=oldValueF-newValueF;	
                    displayLabel.setText(result+"");
                    minusOperator=false;
                    }
		        else if(divOperator) {
    		         float result=oldValueF/newValueF;	
                    displayLabel.setText(result+"");
                    divOperator=false;
                    }
		        else if(mulOperator) {
    		         float result=oldValueF*newValueF;	
                    displayLabel.setText(result+"");
                    mulOperator=false;
                    }
		        else if(squareOperator) {
   		         float result=oldValueF*oldValueF;	
                   displayLabel.setText(result+"");
                   squareOperator=false;
                   }
		        else if(cubeOperator) {
   		         float result=oldValueF*oldValueF*oldValueF;	
                   displayLabel.setText(result+"");
                   cubeOperator=false;
                   }
	}else if(e.getSource()==clearButton)	{
		displayLabel.setText(" ");
		
	
	}}

}



