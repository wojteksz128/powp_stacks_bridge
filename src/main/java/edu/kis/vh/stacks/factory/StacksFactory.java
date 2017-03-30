/*
 * Stworzone w pkt 15 klasy fabryk łamią zasadę izolacji przez użycie konkretnych klas StackList oraz StackArray do tworzenia obiektu.
 * Lepszym rozwiązaniem byłoby stworzenie generycznej klasy fabryki, która jako parametr przyjmuje obiekty implementujące interfejs Stackable.
 */

package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;

/**
 * Interface of methods to creating factory of stacks.
 * 
 * @author Wojciech Szczepaniak
 *
 */
public interface StacksFactory {

	/**
	 * Returned new empty {@link Stack}.
	 * 
	 * @return new empty stack
	 */
	public Stack getStandardStack();
 
	/**
	 * Returned new empty {@link Stack}.
	 * 
	 * @return new empty stack
	 */
	public Stack getFalseStack();

	/**
	 * Returned new empty {@link StackFIFO}.
	 * 
	 * @return new empty queue
	 */
	public StackFIFO getFIFOStack();

	/**
	 * Returned new empty {@link StackHanoi}.
	 *  
	 * @return new empty StackHanoi
	 */
	public StackHanoi getHanoiStack();

}
