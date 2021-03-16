package pfsystem.structure.cards;

public class BlackCard extends Card{


    public BlackCard(String ID, String exDate, boolean privelage) {
        super(ID, exDate,privelage);
        activate();
    }
}
