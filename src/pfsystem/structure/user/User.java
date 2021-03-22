package pfsystem.structure.user;

import pfsystem.structure.cards.BlackCard;
import pfsystem.structure.cards.Card;
import pfsystem.structure.cards.WhiteCard;

public class User {

    public static boolean canHaveGuest = false;
    public static Card card;
    public static Guest guest = null;
    public static  boolean massagePrivelage = false;

    public User(WhiteCard whiteCard, int age, String name){
        card = whiteCard;
    }

    public User(BlackCard blackCard, int age, String name, Guest guest){
        canHaveGuest = true;
        card = blackCard;
        this.guest = guest;
        massagePrivelage = true;
    }

    public String getCardID(){
        if(card != null){
            return card.getID();
        }else if(card != null){
            return card.getID();
        }
        return "ID COULD NOT BE RETURNED";
    }
}
