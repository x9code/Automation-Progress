package robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class HandlingKeyBoardKeys {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		//Runtime.getRuntime().exec("Notepad");
		new ProcessBuilder("notepad.exe").start();
		Thread.sleep(3000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_Q);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_SHIFT);
		
		    r.keyPress(KeyEvent.VK_SPACE);
	        r.keyRelease(KeyEvent.VK_SPACE);

	        r.keyPress(KeyEvent.VK_SHIFT);
	        r.keyPress(KeyEvent.VK_S);
	        r.keyRelease(KeyEvent.VK_S);
	        r.keyRelease(KeyEvent.VK_SHIFT);

	        Thread.sleep(1000);

	        // Close Notepad (ALT + F4)
	        r.keyPress(KeyEvent.VK_ALT);
	        r.keyPress(KeyEvent.VK_F4);
	        r.keyRelease(KeyEvent.VK_F4);
	        r.keyRelease(KeyEvent.VK_ALT);

	        Thread.sleep(500);

	        // Select "Don't Save" (ALT + N)
	        r.keyPress(KeyEvent.VK_ALT);
	        r.keyPress(KeyEvent.VK_N);
	        r.keyRelease(KeyEvent.VK_N);
	        r.keyRelease(KeyEvent.VK_ALT);
	}
}
