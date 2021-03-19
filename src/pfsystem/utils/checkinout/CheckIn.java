package pfsystem.utils.checkinout;

import pfsystem.structure.user.User;

public class CheckIn {

    public boolean allowGuest = false;
    public boolean hasWhiteCard = false;
    public boolean hasBlackCard = false;

    public void checkIn(User user) {

        if (!user.bCard.activated) {
            return;
        }

        if (user.canHaveGuest && user.guest != null) {
            allowGuest = true;
        }

        if (user.bCard != null) {
            hasBlackCard = true;
        }

        if (user.wCard != null) {
            hasWhiteCard = true;
        }
    }
}
