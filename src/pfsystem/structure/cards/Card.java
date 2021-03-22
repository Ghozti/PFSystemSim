package pfsystem.structure.cards;

public class Card {

    public String ID;
    public boolean activated;
    public boolean massagePrivilege;

    public Card(String ID){
        this.ID = ID;
        activated = false;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void deactivate(){
        activated = false;
    }

    public void activate(){
        activated = true;
    }
}