/* @formatter:off
 *
 * Dave Rosenberg
 * Comp 2000 - Data Structures
 * Lab: List application - card game
 * Fall, 2024
 * 
 * Usage restrictions:
 * 
 * You may use this code for exploration, experimentation, and furthering your
 * learning for this course. You may not use this code for any other
 * assignments, in my course or elsewhere, without explicit permission, in
 * advance, from myself (and the instructor of any other course).
 * 
 * Further, you may not post (including in a public repository such as on github)
 * nor otherwise share this code with anyone other than current students in my 
 * sections of this course. Violation of these usage restrictions will be considered 
 * a violation of the Wentworth Institute of Technology Academic Honesty Policy.
 *
 * Do not remove this notice.
 *
 * @formatter:on
 */


package edu.wit.scds.ds.lists.app.game ;

/**
 * Representation of a hand of cards
 *
 * @author Trevor J Grafton    // TODO
 *
 * @version 1.0 2024-10-31 Initial implementation
 */

import java.util.ArrayList;
import java.util.List;

public class Hand extends Pile {
    private List<Card> hand;

    public Hand() {
        hand = new ArrayList<>();
        }

    public void addCard(Card card) {
        hand.add(card);
    }

    public Card playCard(int index) {
        return hand.remove(index);
    }

    public List<Card> getCards() {
        return hand;
    }
    public boolean containsCard(Card card) {
        return hand.contains(card);
    }
    public int size() {
        return hand.size();
    }
    public String displayHand() {
        StringBuilder playerHand = new StringBuilder();
        for (Card card : hand) {
            playerHand.append(card).append("\n");
        }
    return playerHand.toString();
}
}