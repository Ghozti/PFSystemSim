package pfsystem.structure.cards;

abstract class Card {

    public String ID;
    public String exDate;
    public boolean activated;

    public Card(String ID ,String exDate){
        this.ID = ID;
        this.exDate = exDate;
        activated = false;
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