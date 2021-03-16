package pfsystem.structure.user;

import pfsystem.structure.cards.BlackCard;
import pfsystem.structure.cards.WhiteCard;

public class User {

    boolean canHaveGuest = false;
    WhiteCard wCard;
    BlackCard bCard;

    public User(WhiteCard whiteCard, int age, String name){
        wCard = whiteCard;
    }

    public User(BlackCard blackCard, int age, String name){
        canHaveGuest = true;
        bCard = blackCard;
    }
}
