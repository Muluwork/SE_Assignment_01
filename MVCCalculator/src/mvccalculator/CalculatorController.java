
package mvccalculator;




import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class CalculatorController {
   private CalculatorView  theView;
   private CalculatorModel theModel;
   public CalculatorController( CalculatorView theView,CalculatorModel theModel){
   this.theView = theView;
   this.theModel = theModel;
   
   this.theView.addCalculationListener(new CalculateListener(1));
   this.theView.subCalculationListener(new CalculateListener(2));
   this.theView.multiplyCalculationListener(new CalculateListener(3));
   this.theView.divideCalculationListener(new CalculateListener(4));
   this.theView.reminderCalculationListener(new CalculateListener(5));
   }

    class CalculateListener implements ActionListener {
        int casede;
        public CalculateListener(int cased){
            this.casede =cased;
}
        @Override
        public void actionPerformed(ActionEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); 
            int firstNumber , secondNumber;
            firstNumber =0;
            secondNumber = 0;
            try{
            firstNumber = theView.getFirstNumber();
            secondNumber = theView.getSecondNumber();
            theModel.multiplyTwoNumbers(firstNumber, secondNumber,casede);
            
            theView.setcalcSolution(theModel.getCalculationValue());
            
            
            
            }
            catch(NumberFormatException ex){
                theView.displayErrorMessage(" enter two integers");
            }
            
        }

       
    }
   
}
