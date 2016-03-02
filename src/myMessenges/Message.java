package myMessenges;

import java.nio.charset.Charset;

/** Abstract base class for messages exchanged with myMessenger
 * @author Ray and Chris
 *
 */
public abstract class Message {
	
	
	enum messageType { TEXTMESSAGE, FILEMESSAGE, TERMINATIONMESSAGE };
//	final static byte TEXTMESSAGE = 0xTEXTMESSAGE;
//	final static byte FILEMESSAGE = 0xFILEMESSAGE;
//	final static byte TERMINATIONMESSAGE = 0xTERMINATIONMESSAGE;
//	byte[] 
	
	Charset characterSet = Charset.defaultCharset();
	
	/** Default constructor for message to be exchanged between
	 * client and host. 
	 * 
	 */
	Message(byte messageType){
		
	}
	
}
