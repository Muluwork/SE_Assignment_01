
package mvccalculator;


public class CalculatorModel {
    private int calculationValue;
    
    public void multiplyTwoNumbers(int firstNumber, int secondNumber,int cased){
        if(cased==1){
            calculationValue = firstNumber + secondNumber;
        }
        else if(cased==2){
        calculationValue = firstNumber - secondNumber;}
        else if(cased==3){
            calculationValue = firstNumber * secondNumber;
        }
        else if(cased==4){
        calculationValue = firstNumber / secondNumber;}
        else {
        calculationValue = firstNumber % secondNumber;}
    
    }
    
    public int getCalculationValue(){
    return calculationValue;}
}
