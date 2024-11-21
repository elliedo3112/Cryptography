//Name: Ellie Do
package model;

import java.util.ArrayList;
import java.util.List;

import view.MessageListener;

/**
 * A message contains a plaintext value and an encrypted value.
 */
public class Message {
    private String plaintext = "";
    private String encrypted = "";
    private Algorithm algo;
    
    private List<MessageListener> listeners = new ArrayList<>();
    
    
    /**
     * Set the encryption algorithm and create the right type of algorithm object
     * @param the algorithm name
     */
    public void setAlgorithm (String algoName) {
    	if (algoName.equals("Copy")) {
    		algo= new Copy ();
    	}else if (algoName.equals("Caesar cipher")) {
    		algo= new Caesar();
    		
    	}else {
    		algo= new Scytale();
    		
    	}
    }
    
    /**
     * Encrypts the plaintext using the currently selected algorithm
     * @param key the key the algorithm should use
     */
    public void encryptWithKey(int key) {
        // TODO Add code to do the encryption and set the encrypted instance variable
    	 encrypted=algo.encrypt(key, plaintext);
        notifyListeners();
    }
    
    /**
     * Decrypts the cipher text using the currently selected algorithm
     * @param key the key the algorithm should use
     */
    public void decryptWithKey(int key) {
        // TODO Add code to do the decryption and set the plaintext instance variable
       plaintext=algo.decrypt(key, encrypted);
    	notifyListeners();
    }
    
    /**
     * Add a listener to the counter's list of listeners.  The listener will 
     * be notified when the counter's value changes.
     * @param listener the listener to add.
     */
    public void addListener(MessageListener listener) {
        listeners.add(listener);
    }

    private void notifyListeners() {
        for (MessageListener listener : listeners) {
            listener.update();
        }
    }
    
    public String getPlaintext() {
        return plaintext;
    }
    
    public String getEncrypted() {
        return encrypted;
    }
    
    public void setPlaintext(String plaintext) {
        this.plaintext = plaintext;
    }

    public void setEncrypted(String encrypted) {
        this.encrypted = encrypted;
    }

}
