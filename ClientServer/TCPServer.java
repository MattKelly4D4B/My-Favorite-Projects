///////////////////////////////////////////////////////////////////
// File name: TCPServer.java (adapted from Kurose, pp. 168-169)
// Purpose: Implements a simple server that listens for a request
//          for a TCP connection from a client.  After estblishing
//          the connection, the server read the text phrase sent
//          by a client, converts the text to all uppercase letters,
//          sends the modified text phrase back to the client,
//          and then listens for another client to call 
/////////////////////////////////////////////////////////////////// 

import java.io.*;
import java.net.*;


// #################################################################
class TCPServer 
{

   // ############################################## 
   public static void main(String[] args) throws Exception 
   {
   int portNumber;
   String clientSentence;   
   String capitalizedSentence;
   ServerSocket welcomeSocket;
   Socket connectionSocket;
   BufferedReader inFromClient;
   DataOutputStream outToClient;

   if (args.length != 1) 
      {
      System.out.println("java <program name> <port number>");
      System.exit(1);
      } // End if

   portNumber = Integer.parseInt(args[0]);   

   welcomeSocket = new ServerSocket(portNumber);

   while (true)  // Infinite loop
      {
      connectionSocket = welcomeSocket.accept();

      inFromClient = new BufferedReader( new InputStreamReader( connectionSocket.getInputStream() ) );

      outToClient = new DataOutputStream( connectionSocket.getOutputStream() );

      clientSentence = inFromClient.readLine();
 
      capitalizedSentence = clientSentence.toUpperCase() + '\n';

      outToClient.writeBytes(capitalizedSentence);
 
      } // End while

   } // End main
	

} // End class

