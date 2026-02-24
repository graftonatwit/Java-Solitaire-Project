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


package edu.wit.scds.ds.lists.app.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * Representation of a deck of cards
 *
 * @author Trevor J Grafton // TODO
 *
 * @version 1.0 2024-10-31 Initial implementation
 */
public class Deck extends Pile
	{
	private List<Card> unoCards;

    public Deck() {
        unoCards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            if (suit == Suit.NONE) continue;
            for (Rank rank : Rank.values()) {
                if (rank == Rank.WILD || rank == Rank.WILD_DRAW_FOUR) continue;
                unoCards.add(new Card(suit, rank, true));
                if (rank != Rank.ZERO) {
                    unoCards.add(new Card(suit, rank, true)); 
                }
            }
        }
        for (int i = 1; i <= 4; i++) {
            unoCards.add(new Card(Suit.NONE, Rank.WILD, true));
            unoCards.add(new Card(Suit.NONE, Rank.WILD_DRAW_FOUR, true));
        }
    }
    
    public void shuffle() {
        Collections.shuffle(unoCards);
    }

    /**
     * 
     * 
     * @return
     */
    public Card deal() {
        return unoCards.isEmpty() ? null : unoCards.remove(0);
    }

    /**
     * 
     * 
     * @return
     */
    public int remainingCards() {
        return unoCards.size();
    }

	}	// end class Deck