import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;
// import java.util.Scanner;

public class MyNewApp {
    /**
     * @param args
     * @throws AWTException
     */
    public static void main(String[] args) throws AWTException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your text: ");
        String Text = scanner.nextLine();
        System.out.print("How many times do you want to send: ");
        int size = scanner.nextInt();
        scanner.close();

        System.out.println("Message Sending... will start in 5 Seconds");

        StringSelection stringSelection = new StringSelection(Text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);

        Thread.sleep(5000);

        Robot robot = new Robot();
        for (int i = 1; i <= size; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);

            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            Thread.sleep(1000);

        }

    }

}
