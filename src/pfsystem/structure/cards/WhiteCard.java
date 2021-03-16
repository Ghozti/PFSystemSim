package pfsystem.structure.cards;

public class WhiteCard extends Card{

    public WhiteCard(String ID, String exDate, boolean privelage) {
        super(ID, exDate,privelage);
        activate();
    }
}
