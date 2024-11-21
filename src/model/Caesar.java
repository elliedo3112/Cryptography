//Name: Ellie Do
package model;

public class Caesar implements Algorithm {
	
	/**
	 * Encrypt the message by shifting each letter by a constant amount 
	 * @param key and plaintext
	 * @return encrypted message
	 */
	public String encrypt (int key, String plaintext) {
		
		char[] encryptedArray= new char[plaintext.length()];
		char[] plainArray=plaintext.toCharArray();
		for (int i=0;i<plainArray.length;i++) {
			encryptedArray[i]= (char) (plainArray[i]+ key);
			
		}
		String encrypted= new String (encryptedArray);
		
		return encrypted;
	}
	/** 
	 * Decrypt the message by shifting each letter by a constant amount
	 * @param key and encrypted message
	 * @return decrypted message
	 */
	public String decrypt (int key, String encrypted) {
		char[] decryptedArray= new char[encrypted.length()];
		char[] encryptedArray=encrypted.toCharArray();
		for (int i=0;i<encryptedArray.length;i++) {
			decryptedArray[i]= (char) (encryptedArray[i]- key);
			
		}
		String decrypted= new String (decryptedArray);
		
		return decrypted;
		
		
	}
}
