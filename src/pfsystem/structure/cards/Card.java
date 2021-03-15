package pfsystem.structure.cards;

public class Card implements CardMethods{

    String ID;
    String exDate;
    boolean activated;

    public Card(String ID ,String exDate){
        this.ID = ID;
        this.exDate = exDate;
        activated = false;
    }

    @Override
    public void setExpirationDate(String date) {
        exDate = date;
    }

    @Override
    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String getID() {
        return ID;
    }

    @Override
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
