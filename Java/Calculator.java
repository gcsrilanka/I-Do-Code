/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cal;

/**int 
 *
 * @author Randika
 */

public class Calculator {
    int tot,sub,mul,div;
    public int addition(int a, int b)
    {
            int tot=a+b;
            return tot;
    }
    public int substraction(int a , int b)
    {
        int sub=a-b;
        return sub;
    }
    public int multiplication(int a , int b)
    {
        int mul=a*b;
        return mul;
    }
    public int division(int a , int b)
    {
        int div = a/b;
        return div;
    }

}
