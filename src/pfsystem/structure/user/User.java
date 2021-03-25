package pfsystem.structure.user;

import pfsystem.structure.cards.Card;


public class User {

    private static String name;
    private static String bday;
    private static Card card;
    private static Guest guest;

    /**sets the user's name**/
    public static void setName(String name){
        User.name = name;
    }

    /**gets the user's name**/
    public static String getName(){
        return name;
    }

    /**sets the user's bday**/
    public static void setBday(String date){
        bday = date;
    }

    /**gets the user's name**/
    public static String getDate(){
        return bday;
    }

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
