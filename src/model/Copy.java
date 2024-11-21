package model;

public class Copy implements Algorithm {

	//no changes made for both encrypt and decrypt
	public String encrypt (int key, String plaintext) {
		return plaintext;
	}
	
	public String decrypt (int key, String encrypted) {
		return encrypted;
	}
}
