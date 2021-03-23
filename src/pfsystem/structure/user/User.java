package pfsystem.structure.user;

import pfsystem.structure.cards.Card;


public class User {
    public static Card card;
    public static boolean canHaveGuest;
    public static Guest guest;
    public static boolean massagePrivilege;

    public static void setCard(Card card){
        User.card = card;
    }

    public static Card getCard(){
        return card;
    }

    public static boolean canHaveGuest() {
        return canHaveGuest;
    }

    public static String getCardID(){
        if(card != null){
            return card.getID();
        }
        return "ID COULD NOT BE RETURNED";
    }

    public static Guest getGuest(){
        return guest;
    }

    public static boolean getMassagePrivilege(){
        return massagePrivilege;
    }
}
