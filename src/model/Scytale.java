//Name:Ellie Do 
package model;

public class Scytale implements Algorithm {

	/**
	 * Encrypt the message by changing the order of the letters
	 * @param key and plain message
	 * @return encrypted message
	 */
	public String encrypt (int key, String plaintext) {
		
		int row=0;
		String encrypted;
		
		char[] plainArray=plaintext.toCharArray();
		
		//set the row value
		if (key==1) {
			encrypted=plaintext;
			}
		else {
		for (int i=1;i< plaintext.length();i++) {
			
			 if (key*i % plaintext.length()< key) {
				row=i;		
			}
		}	
		//convert the 1D array to 2D grid
		int index=0;
		char [][] plainGrid= new char[row][key];
		for (int r=0;r<row;r++) {
			for (int c=0;c<key;c++) {
				if(index<plainArray.length) {
				plainGrid[r][c]=plainArray[index];
				index++;
			}
			}	
		}
		
		int index1=0;
		char [] encryptedArray=new char[row*key];
		
		//parse the column values to the 1D array to encrypt the message
		for (int c=0;c<key;c++) {
			for (int r=0;r<row;r++) {

				if(index1<encryptedArray.length) {
				encryptedArray[index1]=plainGrid[r][c];
				index1++;
				
				;
				}
				
			}
		}
		

		 encrypted = new String (encryptedArray);
		

		}
		return encrypted;
	}
	/**
	 * Decrypt the message by reorganizing the order of the letters
	 * @param key and encrypted message
	 * @return decrypted message
	 */
	
	public String decrypt (int key, String encrypted) {
		
		int row=0;
		
		String decrypted;
		
		char[] encryptedArray=encrypted.toCharArray();
		//set the row value
		if (key==1) {
			decrypted =encrypted;
			}
		else {
		for (int i=1;i< encrypted.length();i++) {
			
			 if (key*i % encrypted.length()< key) {
				row=i;		
			}
		}	

		int index=0;
		char [][] encryptedGrid= new char[row][key];
		
		//convert the 1D array to 2D grid
		for (int c=0;c<key;c++) {
			for (int r=0;r<row;r++) {
				if(index<encryptedArray.length) {
				encryptedGrid[r][c]= encryptedArray[index];
				index++;
			
			}
			}	
		}
		
		int index1=0;
		//parse the column values to the 1D array to decrypt the message
		char [] decryptedArray=new char[row*key];
		for (int r=0;r<row;r++) {
			for (int c=0;c<key;c++) {

				if(index1<decryptedArray.length) {
				decryptedArray[index1]=encryptedGrid[r][c];
				//System.out.println(encryptedArray[index1]);
				index1++;
				
				;
				}
				
			}
		}
		 decrypted = new String (decryptedArray);
		

		}
		return decrypted;
	}
}
