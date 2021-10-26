
package webserver;

import java.net.Socket;

final public class HttpRequest implements Runnable {
    
    final static String CRLF = "\r\n";
    Socket socket;
    // Constructor
    public HttpRequest(Socket socket) throws Exception {
        this.socket = socket;
    }
    // Implement the run() method of the Runnable interface.
    public void run() {
        try {
            processRequest();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    private void processRequest() throws Exception {
        
    }
}
