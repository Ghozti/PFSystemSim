package pfsystem.structure.user;

import pfsystem.structure.cards.BlackCard;
import pfsystem.structure.cards.WhiteCard;

public class User {

    public boolean canHaveGuest = false;
    public WhiteCard wCard = null;
    public BlackCard bCard = null;
    public Guest guest = null;
    public boolean massagePrivelage = false;

    public User(WhiteCard whiteCard, int age, String name){
        wCard = whiteCard;
    }

    public User(BlackCard blackCard, int age, String name, Guest guest){
        canHaveGuest = true;
        bCard = blackCard;
        this.guest = guest;
        massagePrivelage = true;
    }

    public String getCardID(){
        if(wCard != null){
            return wCard.getID();
        }else if(bCard != null){
            return bCard.getID();
        }
        return "ID COULD NOT BE RETURNED";
    }
}
