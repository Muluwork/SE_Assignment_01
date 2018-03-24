
package mvccalculator;



import java.awt.event.ActionListener;
//import java.util.HashSet;
import java.util.Set;
import javax.swing.*;

public class CalculatorView extends JFrame{
    private JTextField firstNumber = new JTextField(10);
    private JLabel additionLabel = new JLabel("Answer");
    private JLabel additionLabel2 = new JLabel("    ");
    
    private JTextField secondNumber = new JTextField(10);
    private JTextField calcSolution = new JTextField(10);
    private JButton calculateButton = new JButton("+");
    private JButton calculateButton2 = new JButton("-");
    private JButton calculateButton3 = new JButton("*");
    private JButton calculateButton4 = new JButton("/");
    private JButton calculateButton5 = new JButton("%");
    
    
    CalculatorView(){
        JPanel calcPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,200);
        calcPanel.add(firstNumber);
        
        calcPanel.add(secondNumber);
        calcPanel.add(calculateButton);
        calcPanel.add(calculateButton2);
        calcPanel.add(calculateButton3);
        calcPanel.add(calculateButton4);
        calcPanel.add(calculateButton5);
        calcPanel.add(additionLabel2);
        calcPanel.add(additionLabel);
        
        calcPanel.add(calcSolution);
        this.add (calcPanel);
        
    }
    public int getFirstNumber(){
    return Integer.parseInt(firstNumber.getText());
    }
    
    public int getSecondNumber(){
    return Integer.parseInt(secondNumber.getText());
    }
    public int getcalcSolution(){
    return Integer.parseInt(calcSolution.getText());
    }
    public void setcalcSolution(int solution){
    calcSolution.setText(Integer.toString(solution));
    }
    void addCalculationListener(ActionListener listenForCalcButton){
    calculateButton.addActionListener(listenForCalcButton);
    }
    void multiplyCalculationListener(ActionListener listenForCalcButton){
   
    calculateButton3.addActionListener(listenForCalcButton);}
    void subCalculationListener(ActionListener listenForCalcButton){
   
    calculateButton2.addActionListener(listenForCalcButton);}
    void divideCalculationListener(ActionListener listenForCalcButton){
   
    calculateButton4.addActionListener(listenForCalcButton);}
    void reminderCalculationListener(ActionListener listenForCalcButton){
   
    calculateButton5.addActionListener(listenForCalcButton);}

void displayErrorMessage(String errorMessage){
JOptionPane.showMessageDialog(this, errorMessage);}
}
