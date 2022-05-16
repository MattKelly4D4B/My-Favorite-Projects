import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class TicTacToe extends JFrame implements ActionListener
{
   private int gameCounter = 0;
   ArrayList<String> XButtons = new ArrayList<String>();
   ArrayList<String> OButtons = new ArrayList<String>();

   JButton b1 = new JButton("");
   JButton b2 = new JButton("");
   JButton b3 = new JButton("");
   JButton b4 = new JButton("");
   JButton b5 = new JButton("");
   JButton b6 = new JButton("");
   JButton b7 = new JButton("");
   JButton b8 = new JButton("");
   JButton b9 = new JButton("");
   Font defaultFont = new Font("Arial", Font.BOLD, 30);
         
   public TicTacToe()
   {      
      
      GameWindow();
      Initialize();
      setVisible(true);
      
                  
   }//end constructor
   
   
   private void Initialize()
   {
      
      b1.setPreferredSize(new Dimension(75, 75));   
      b2.setPreferredSize(new Dimension(75, 75));
      b3.setPreferredSize(new Dimension(75, 75));
      b4.setPreferredSize(new Dimension(75, 75));
      b5.setPreferredSize(new Dimension(75, 75));
      b6.setPreferredSize(new Dimension(75, 75));
      b7.setPreferredSize(new Dimension(75, 75));
      b8.setPreferredSize(new Dimension(75, 75));
      b9.setPreferredSize(new Dimension(75, 75));
      
      b1.setName("1");
      b2.setName("2");
      b3.setName("3");
      b4.setName("4");
      b5.setName("5");
      b6.setName("6");
      b7.setName("7");
      b8.setName("8");
      b9.setName("9");
   } // End method
   
    private void GameWindow()
    {
      setSize(260, 285);
      getContentPane().setBackground(Color.BLACK);
      setLayout(new FlowLayout(FlowLayout.LEFT));
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      
      add(b1);
      add(b2);
      add(b3);
      add(b4);
      add(b5);
      add(b6);
      add(b7);
      add(b8);
      add(b9);
      
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b4.addActionListener(this);
      b5.addActionListener(this);
      b6.addActionListener(this);
      b7.addActionListener(this);
      b8.addActionListener(this);
      b9.addActionListener(this);
   } // End method
   
   private void addLetter(Object source)
   {
      if(gameCounter % 2 == 0)
         {
            if(source == b1)
            {
               b1.setText("X");
               gameCounter++;
               XButtons.add("1");
               b1.setBackground(Color.BLUE);
               b1.setForeground(Color.WHITE);
            }//end if
            else if(source == b2)
            {
               b2.setText("X");
               gameCounter++;
               XButtons.add("2");
               b2.setBackground(Color.BLUE);
               b2.setForeground(Color.WHITE);
            }//end else if
            else if(source == b3)
            {
               b3.setText("X");
               gameCounter++;
               XButtons.add("3");
               b3.setBackground(Color.BLUE);
               b3.setForeground(Color.WHITE);
            }//end else if
            else if(source == b4)
            {
               b4.setText("X");
               gameCounter++;
               XButtons.add("4");
               b4.setBackground(Color.BLUE);
               b4.setForeground(Color.WHITE);
            }//end else if
            else if(source == b5)
            {
               b5.setText("X");
               gameCounter++;
               XButtons.add("5");
               b5.setBackground(Color.BLUE);
               b5.setForeground(Color.WHITE);
            }//end else if
            else if(source == b6)
            {
               b6.setText("X");
               gameCounter++;
               XButtons.add("6");
               b6.setBackground(Color.BLUE);
               b6.setForeground(Color.WHITE);
            }//end else if
            else if(source == b7)
            {
               b7.setText("X");
               gameCounter++;
               XButtons.add("7");
               b7.setBackground(Color.BLUE);
               b7.setForeground(Color.WHITE);
            }//end else if
            else if(source == b8)
            {
               b8.setText("X");
               gameCounter++;
               XButtons.add("8");
               b8.setBackground(Color.BLUE);
               b8.setForeground(Color.WHITE);
            }//end else if
            else if(source == b9)
            {
               b9.setText("X");
               gameCounter++;
               XButtons.add("9");
               b9.setBackground(Color.BLUE);
               b9.setForeground(Color.WHITE);
            } //end else if        
         }//end if
         else
         {
            if(source == b1)
            {
               b1.setText("O");
               gameCounter++;
               OButtons.add("1");
               b1.setBackground(Color.RED);
               b1.setForeground(Color.WHITE);
            }//end if
            else if(source == b2)
            {
               b2.setText("O");
               gameCounter++;
               OButtons.add("2");
               b2.setBackground(Color.RED);
               b2.setForeground(Color.WHITE);
            }//end else if
            else if(source == b3)
            {
               b3.setText("O");
               gameCounter++;
               OButtons.add("3");
               b3.setBackground(Color.RED);
               b3.setForeground(Color.WHITE);
            }//end else if
            else if(source == b4)
            {
               b4.setText("O");
               gameCounter++;
               OButtons.add("4");
               b4.setBackground(Color.RED);
               b4.setForeground(Color.WHITE);
            }//end else if
            else if(source == b5)
            {
               b5.setText("O");
               gameCounter++;
               OButtons.add("5");
               b5.setBackground(Color.RED);
               b5.setForeground(Color.WHITE);
            }//end else if
            else if(source == b6)
            {
               b6.setText("O");
               gameCounter++;
               OButtons.add("6");
               b6.setBackground(Color.RED);
               b6.setForeground(Color.WHITE);
            }//end else if
            else if(source == b7)
            {
               b7.setText("O");
               gameCounter++;
               OButtons.add("7");
               b7.setBackground(Color.RED);
               b7.setForeground(Color.WHITE);
            }//end else if
            else if(source == b8)
            {
               b8.setText("O");
               gameCounter++;
               OButtons.add("8");
               b8.setBackground(Color.RED);
               b8.setForeground(Color.WHITE);
            }//end else if
            else if(source == b9)
            {
               b9.setText("O");
               gameCounter++;
               OButtons.add("9");
               b9.setBackground(Color.RED);
               b9.setForeground(Color.WHITE);
            }//end else if
            
         } //end else 
   }//end addLetter
   
   private boolean usedAlready(String sourceName)
   {
      boolean usedAlready = false;
      if (XButtons.contains(sourceName) || OButtons.contains(sourceName))
      {
         usedAlready = true;
      }//end if
         return usedAlready;         
   }//end usedAlready
   
   private void checkForWinner()
   {
      String winnerString = "";
      for (int i=0; i<9; i++)
      {
         ///////HORIZONTAL WINS////////////
         if ((XButtons.contains("1")) && (XButtons.contains("2")) && (XButtons.contains("3")))
         {
             winnerString = "X";
         }//end if
         
         else if ((XButtons.contains("4")) && (XButtons.contains("5")) && (XButtons.contains("6")))
         {
             winnerString = "X";
         }//end else
         
         else if ((XButtons.contains("7")) && (XButtons.contains("8")) && (XButtons.contains("9")))
         {
             winnerString = "X";
         }//end else if
         else if((OButtons.contains("1")) && (OButtons.contains("2")) && (OButtons.contains("3")))
         {
             winnerString = "O";
         }//end else if
         
         else if ((OButtons.contains("4")) && (OButtons.contains("5")) && (OButtons.contains("6")))
         {
             winnerString = "O";
         }//end else   if       
         else if ((OButtons.contains("7")) && (OButtons.contains("8")) && (OButtons.contains("9")))
         {
             winnerString = "O";
         }//end else if
         
         ////////VERTICAL WINS/////////////  
         else if ((XButtons.contains("1")) && (XButtons.contains("4")) && (XButtons.contains("7")))
         {
             winnerString = "X";
         }//end else if
         else if ((XButtons.contains("2")) && (XButtons.contains("5")) && (XButtons.contains("8")))
         {
             winnerString = "X";
         }//end else if
         else if ((XButtons.contains("3")) && (XButtons.contains("6")) && (XButtons.contains("9")))
         {
             winnerString = "X";
         }//end else if
         else if ((OButtons.contains("1")) && (OButtons.contains("4")) && (OButtons.contains("7")))
         {
             winnerString = "O";
         }//end else if
         else if ((OButtons.contains("2")) && (OButtons.contains("5")) && (OButtons.contains("8")))
         {
             winnerString = "O";
         }//end else if
         else if ((OButtons.contains("3")) && (OButtons.contains("6")) && (OButtons.contains("9")))
         {
             winnerString = "O";
         }//end else if
         ///////////DIAGONAL WINS///////////////
         else if ((XButtons.contains("1")) && (XButtons.contains("5")) && (XButtons.contains("9")))
         {
             winnerString = "X";
         }//end else if
         else if ((XButtons.contains("3")) && (XButtons.contains("5")) && (XButtons.contains("7")))
         {
             winnerString = "X";
         }//end else if
         else if ((OButtons.contains("1")) && (OButtons.contains("5")) && (OButtons.contains("9")))
         {
             winnerString = "O";
         }//end else if
         else if ((OButtons.contains("3")) && (OButtons.contains("5")) && (OButtons.contains("7")))
         {
             winnerString = "O";
         }//end else if
         
      }//end for
      if (winnerString != "")
      {
         System.out.println("The winner is: " + winnerString + "! Press run to play again.");
         System.exit(0);
      }//end if
      else if (gameCounter == 9)
      {
         System.out.println("It's a draw! Press run to play again.");
         System.exit(0);
      }
   }//end method

   @Override
   public void actionPerformed(ActionEvent event) // This is the event handler
   {
         //Object source = event.getSource();
         JButton sourceButton = (JButton)event.getSource();         
         if(usedAlready(sourceButton.getName()))
         {
            System.out.println("This square was already chosen.");
         }//end if
         else
         {
            addLetter(sourceButton);
         }//end else
         
         checkForWinner();
         
   } // End method
}//end class