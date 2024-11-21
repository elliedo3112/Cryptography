//Name: Ellie Do
package controller;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Message;
import view.EncryptedField;
import view.PlaintextField;

/**
 * This class provides a graphical user interface that allows a user to enter
 * text and select an encryption algorithm and key to encrypt the text. The user
 * can also enter encrypted text, select an algorithm and key to decrypt the
 * text.
 *
 */
public class CryptographyGUI  {
    // The width of the text areas for entering encrypted and decrypted text,
    // in characters
    private static final int TEXT_WIDTH = 50;

    // The number of rows in the text areas for entering encrypted and decrypted
    // text,
    // in characters
    private static final int TEXT_HEIGHT = 5;
    
    // Error message if the user does not enter a number for the key.
    private static final String KEY_ERROR_MESSAGE = 
            "Enter a number for the key.";

    // The three kinds of encryption we know. These go in the menu.
    private static final String CAESAR = "Caesar cipher";
    private static final String SCYTALE = "Scytale";
    private static final String COPY = "Copy";

    private Message message = new Message();

    // Where the unencrypted text appears on the screen
    private PlaintextField plainTextArea = new PlaintextField(TEXT_HEIGHT, TEXT_WIDTH, message);

    // Where the encrypted text appears on the screen
    private EncryptedField cipherTextArea = new EncryptedField(TEXT_HEIGHT, TEXT_WIDTH, message);

    /**
     * Constructs the user interface for the program.
     */
    public CryptographyGUI() {
    	
    	//create a frame
        JFrame frame = new JFrame();
        
        JButton encryptButton=new JButton ("Encrypt"); 
        JButton decryptButton=new JButton("Decrypt");
        String[] items= {COPY, CAESAR,SCYTALE};
        message.addListener(cipherTextArea);
        message.addListener(plainTextArea);
        JTextField key = new JTextField("Key", 10);
        JComboBox<String> menu =new JComboBox<>(items);
        
        //adding listeners to actions
        menu.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if (e.getStateChange()==ItemEvent.SELECTED) {
					String selecedOption= (String) menu.getSelectedItem();
					message.setAlgorithm(selecedOption);
					
				}
			}
        });
        
        //add listener for encrypt and decrypt buttons
        encryptButton.addActionListener(new ActionListener() {

    		@Override
    		public void actionPerformed(ActionEvent e) {
    			try {
    				// TODO Auto-generated method stub
    			int intValue = Integer.parseInt(key.getText());
    			message.setPlaintext(plainTextArea.getText());
    			message.encryptWithKey(intValue);
    			}
    			catch(NumberFormatException a){
    				JOptionPane.showMessageDialog(plainTextArea, KEY_ERROR_MESSAGE);
    				
    			}
    		}	
            });
       
        decryptButton.addActionListener(new ActionListener() { 

        	@Override
    		public void actionPerformed(ActionEvent e) {
    			try {
    				// TODO Auto-generated method stub
    			int intValue = Integer.parseInt(key.getText());
    			message.setEncrypted(cipherTextArea.getText());
    			message.decryptWithKey(intValue);
    			}
    			catch(NumberFormatException a){
    				JOptionPane.showMessageDialog(cipherTextArea, KEY_ERROR_MESSAGE);
    				
    			}
    			
   
    		}	
            });
        
       
        JPanel p=new JPanel();
        p.add(encryptButton);
        p.add(decryptButton);
        p.add(menu);
        p.add(key);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Add the listeners to the text fields.
        message.addListener(plainTextArea);
        message.addListener(cipherTextArea);
        

        // Add all the GUI elements to the display.
        frame.add(plainTextArea, BorderLayout.NORTH);
        frame.add(cipherTextArea, BorderLayout.CENTER);
        frame.add(p,BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
        
    }

    /**
     * The main method to start the program.
     * 
     * @param args None required
     */
    public static void main(String[] args) {
    	//Initialize the window
    	
        new CryptographyGUI();
    }

}
