package pfsystem.structure.cards;

public class BlackCard extends Card{


    public BlackCard(String ID, String exDate, boolean privilege) {
        super(ID, exDate,privilege);
        activate();
    }
}
