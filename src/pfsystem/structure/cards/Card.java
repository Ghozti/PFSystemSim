package pfsystem.structure.cards;

abstract class Card {

    String ID;
    String exDate;
    boolean activated;
    boolean massagePrivelage;

    public Card(String ID ,String exDate, boolean privelage){
        this.ID = ID;
        this.exDate = exDate;
        activated = false;
        massagePrivelage = privelage;
    }

    public void setExpirationDate(String date) {
        exDate = date;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public String getExpirationDate() {
        return exDate;
    }

    public void deactivate(){
        activated = false;
    }

    public void activate(){
        activated = true;
    }
}