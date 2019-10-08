/**
 * By Mark Yates
 * ASUID 1207697747
 * Test Seat L-A-10
 * Assignment 2
 *
 * The file containing the AddingMachine Class, which works as a visual calculator
 * by taking input, storing and processing it, and displaying the output along
 * with the transaction history
 */

package cse360assign2;

import java.io.*;
import java.util.*;

public class AddingMachine {
	
	private int total;
	private ArrayList<String> transaction;
	
	/**
	 * Class Constructor
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		transaction = new ArrayList<String>();
		transaction.add("0");
	}
	
	
	/**
	 * Class Getter for getTotal
	 * 
	 * @return the int stored in getTotal
	 */
	public int getTotal () {
		return this.total;
	}
	
	/**
	 * Method to add a given value to the current total
	 * 
	 * @param value user input to be added to total
	 */
	public void add (int value) {
		this.total += value;
		transaction.add(" + ");
		transaction.add(Integer.toString(value));
	}
	
	/**
	 * Method to subtract a given value from the current total
	 * 
	 * @param value user input to be subtracted from total
	 */
	public void subtract (int value) {
		this.total -= value;
		transaction.add(" - ");
		transaction.add(Integer.toString(value));
	}
	
	/**
	 * Method to display history of inputs
	 * 
	 * @return string of user inputs
	 */
	public String toString () {
		int loopCount;
		for(loopCount = 0; loopCount <= transaction.size(); loopCount++) {
			System.out.print(transaction.get(loopCount));
		}
		System.out.println();
		return "";
	}
	
	/**
	 * Method to clear the current use
	 */
	public void clear() {
		transaction.clear();
		transaction.add("0");
	}
	
}
