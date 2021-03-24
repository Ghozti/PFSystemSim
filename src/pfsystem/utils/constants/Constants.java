package pfsystem.utils.constants;

public class Constants {

    /**PATHS**/
    public static final String p_mainPath = System.getProperty("user.home") + "/" + "PFsystem";
    public static final String p_userPath = System.getProperty("user.home") + "/" + "PFsystem/User";
    public static final String p_cardPath = System.getProperty("user.home") + "/" + "PFsystem/User/Card";
    public static final String p_cardIDPath = System.getProperty("user.home") + "/" + "PFsystem/User/Card/ID.txt";
    public static final String p_typePath = System.getProperty("user.home") + "/" + "PFsystem/User/Card/type.txt";
    public static final String p_activatePath = System.getProperty("user.home") + "/" + "PFsystem/User/Card/active.txt";
    /**ERRORS**/
    public static final String e_invalidInput = "Invalid Input";
    public static final String e_EmptyFields = "These fields cannot be empty!";

    /**MESSAGES**/
    public static final String m_createCardLabel = "Great! your card ID is :";
}
