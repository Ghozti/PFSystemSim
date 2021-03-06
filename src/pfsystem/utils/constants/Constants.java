package pfsystem.utils.constants;

public class Constants {

    public static class Paths extends Constants {
        /** PATHS**/
        public static final String p_mainPath = System.getProperty("user.home") + "/" + "PFsystem";

        public static final String p_userPath = System.getProperty("user.home") + "/" + "PFsystem/User";

        public static final String p_cardPath = System.getProperty("user.home") + "/" + "PFsystem/User/Card";

        public static final String p_cardDatePath = System.getProperty("user.home") + "/" + "PFsystem/User/Card/date.txt";

        public static final String p_cardNamePath = System.getProperty("user.home") + "/" + "PFsystem/User/Card/name.txt";

        public static final String p_cardIDPath = System.getProperty("user.home") + "/" + "PFsystem/User/Card/ID.txt";

        public static final String p_typePath = System.getProperty("user.home") + "/" + "PFsystem/User/Card/type.txt";

        public static final String p_activatePath = System.getProperty("user.home") + "/" + "PFsystem/User/Card/active.txt";
    }

    public static class Errors extends Constants {
        /**ERRORS**/
        public static final String e_invalidInput = "Invalid Input";

        public static final String e_EmptyFields = "These fields cannot be empty!";

        public static final String e_NoDataFound = "No Data Found";

        public static final String e_WrongData = "This does not match any card ID in the data base";
    }

    public static class Messages extends Constants {
        /**MESSAGES**/
        public static final String m_createCardLabel = "Great! your card ID is :";

        public static final String m_confirmDeactivate = "Card deactivated successfully";
    }
}
