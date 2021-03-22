package pfsystem.structure.user;

import pfsystem.structure.cards.Card;


public class User {

    private static boolean canHaveGuest = false;
    private static Card card;
    private static String cardID;
    private static Guest guest;
    private static boolean massagePrivilege;

    public static boolean canHaveGuest() {
        return canHaveGuest;
    }

    public static void setCard(Card card){
        User.card = card;
    }

    public static Card getCard(){
        return card;
    }

    public static String getCardID(){
        if(card != null){
            return cardID;
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
