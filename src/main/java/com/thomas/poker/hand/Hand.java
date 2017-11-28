package com.thomas.poker.hand;

import com.thomas.poker.card.Card;

import java.util.Collection;
import java.util.List;

public class Hand {

    private final HandRank rank;
    private final Collection<Card> cards;

    public Hand(HandRank rank, List<Card> cards) {
        this.rank = rank;
        this.cards = cards;
    }

    public HandRank getRank() {
        return rank;
    }

    public Collection<Card> getCards() {
        return cards;
    }
}
