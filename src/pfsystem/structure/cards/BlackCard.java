package pfsystem.structure.cards;

public class BlackCard extends Card{

    public BlackCard(String ID) {
        super(ID);
        massagePrivilege = true;
        canHaveGuest = true;
        activate();
    }
}
