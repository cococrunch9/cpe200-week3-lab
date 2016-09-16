package cpe200;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {
    public Operand firstOperand;
    public Operand secondOperand;

    public BinaryCalculator()
    {
        /* your code here */
    }

    public void setFirstOperand(Operand operand)
    {
        this.firstOperand = operand;
    }


    public void setSecondOperand(Operand operand)
    {
        this.secondOperand = operand;
    }

    public String add()
    {
        double num1,num2,hold;
        String ans;
        num1 = Double.parseDouble(firstOperand.getOperand());
        num2 = Double.parseDouble(secondOperand.getOperand());
        hold = num1 + num2;
        hold = (double)Math.round(hold * 100000d) / 100000d;
        if(hold*10%10 == 0)
        {
            int hold2 = ((int) hold);
            ans = Integer.toString(hold2);
        }
        else ans = Double.toString(hold);
        return ans;
    }

    public String subtract()
    {
        double num1,num2,hold;
        String ans;
        num1 = Double.parseDouble(firstOperand.getOperand());
        num2 = Double.parseDouble(secondOperand.getOperand());
        hold = num1 - num2;
        hold = (double)Math.round(hold * 100000d) / 100000d;
        if(hold*10%10 == 0)
        {
            int hold2 = ((int) hold);
            ans = Integer.toString(hold2);
        }
        else ans = Double.toString(hold);
        return ans;
    }

    public String multiply()
    {
        double num1,num2,hold;
        String ans;
        num1 = Double.parseDouble(firstOperand.getOperand());
        num2 = Double.parseDouble(secondOperand.getOperand());
        hold = num1 * num2;
        hold = (double)Math.round(hold * 100000d) / 100000d;
        if(hold*10%10 == 0)
        {
            int hold2 = ((int) hold);
            ans = Integer.toString(hold2);
        }
        else ans = Double.toString(hold);
        return ans;
    }

    /* This method should throw an exception when divide by zero */
    public String division()
    {
        double num1,num2,hold;
        String ans;
        num1 = Double.parseDouble(firstOperand.getOperand());
        num2 = Double.parseDouble(secondOperand.getOperand());
        if(num2 == 0)
        {
            throw new ArithmeticException();
        }
        hold = num1/num2;
        hold = (double)Math.round(hold * 100000d) / 100000d;
        if(hold*10%10 == 0)
        {
            int hold2 = ((int) hold);
            ans = Integer.toString(hold2);
        }
        else ans = Double.toString(hold);
        return ans;
    }


}
