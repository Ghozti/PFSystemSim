package pfsystem.structure.cards;

public class Card implements CardMethods{

    String ID;
    String exDate;

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
}
