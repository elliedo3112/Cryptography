//Name: Ellie Do
package model;

public interface Algorithm {
	
	/**
	Called when we create the Algorithm object
	 */

	public String encrypt(int key, String plaintext);
	public String decrypt(int key, String encrypted);
}
