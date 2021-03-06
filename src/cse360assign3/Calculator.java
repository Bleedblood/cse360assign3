/**@author Joel Myhre
 * 
* Models the functions of a calculator.
*
*
*
*/
package cse360assign3;

public class Calculator {

	//private variable
	private int total;
	String History ="0";
	/**
	 * Class Constructor
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/*
	 * calculates the total, updates the total
	 */
	public int getTotal () {
		return total;
	}
	
	/*
	 * adds a addition operation
	 */
	public void add (int value) {
		total = total+ value;
		History = History + " + " + value;
	}
	
	/*
	 * adds a subtract operation
	 */
	
	public void subtract (int value) {
		total = total - value;
		History = History + " - " + value;
	}
	
	/*
	 * adds a multiply operation
	 */
	public void multiply (int value) {
		total = total * value;
		History = History + " * " + value;
	}
	
	/*
	 * adds a divide operation
	 * 
	 */
	
	public void divide (int value) {
		if (value == 0)
		{
			total = 0;
			History = History + " / " + value;
			return;
		}
		
		
		total = total / value;	
		History = History + " / " + value;
	}
	
	/*
	 * get history displays command history
	 */
	public String getHistory() {
		return History;
	}
}
