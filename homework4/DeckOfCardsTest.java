package h4task1;// Fig. 7.11: DeckOfCardsTest.java
// Card shuffling and dealing application.

public class DeckOfCardsTest {
   // execute application
   public static void main(String args[]) {
      DeckOfCards myDeckOfCards = new DeckOfCards();
      myDeckOfCards.shuffle(); // place Cards in random order

      Card[] hand = new Card[4];
      int counter=0;
         for (int i = 0; i < 4; i++) {

            for(int j=0;j< hand.length;++j){
               if(myDeckOfCards.dealCard()!=hand[j]){
                  hand[i] = myDeckOfCards.dealCard();
                  ++counter;
               } else{
                  ++counter;
               }
            }
            if (hand[i] != null)
               System.out.println(hand[i]);
            else
               return; // exit application
         }
        System.out.println("\nNumber of picks: "+ counter);
      // end main
   } // end class DeckOfCardsTest
}


/**************************************************************************
 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
