package zad2;

public class DeckOfCardsTest
{
    // execute application
    public static void main(String[] args)
    {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle(); // place Cards in random order

        Card[] hand = new Card[5];
        while(true){
            System.out.println("\nNew Hand deal: ");
            for (int i = 0; i < 5; i++) {
                hand[i] = myDeckOfCards.dealCard();
                if (hand[i] != null)
                    System.out.println(hand[i]);
                else
                    return; // exit application
            }

            //display result
            System.out.println("Hand contains: ");
            int couples = myDeckOfCards.pairs(hand); //pair
            myDeckOfCards.twoPairs(couples);// two pairs
            int triples = myDeckOfCards.threeOfAKind(hand); //triples
            myDeckOfCards.fourOfAKind(hand); //four of a kind
            myDeckOfCards.flush(hand); //flush
            //myDeckOfCards.straight(hand);  - to do
            myDeckOfCards.fullHouse(couples, triples);
        }
    } // end main
} // end class DeckOfCardsTest


/* *************************************************************************
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

