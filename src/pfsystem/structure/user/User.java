package pfsystem.structure.user;

import pfsystem.structure.cards.Card;


public class User {
    private static Card card;
    private static Guest guest;

    /**sets the card object**/
    public static void setCard(Card card){
        User.card = card;
    }

    /**gets the card object**/
    public static Card getCard(){
        return card;
    }

    /**gets the cardID object**/
    public static String getCardID(){
        return card.getID();
    }

    /**gets the guest object**/
    public static Guest getGuest(){
        return guest;
    }

    /**gets the massage bool in the card object**/
    public static boolean getMassagePrivilege(){
        return card.massagePrivilege;
    }
}
