/**
 * @author SWAMYNATHAN G.H
 */
//Enumerator introduced in 1.0Version of Java
package day17jan22;

import java.util.Vector;

import java.util.Enumeration;

public class EnmerationDemo {
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		vector.add(1);
		vector.add(4);
		vector.add(3);
		vector.add(5);
		vector.add(2);

	/**
	 * we can create enumeration object by using elements() method. 
	 * Enumeration is used in legacy classes(It's not a Universal cursor)
	 *  objects to get Objects one by one.
	 */
		Enumeration<Integer> elements = vector.elements();
		/**
		 * 
		 */
		while (elements.hasMoreElements()) { 
			Integer n = elements.nextElement();
			System.out.println(n);
	/**
	 * Enumeration can perform read operation,
	 * we can't perform write Operation.
	 */

		}
		System.out.println("------------------------------------------");
		System.out.println(vector);
	}

}