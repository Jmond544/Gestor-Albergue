

package Entity;


public class User {
    private static String userName;
    private static String rolName;

    public static String getUserName() {
        return userName;
    }

    public static String getRolName() {
        return rolName;
    }

    public static void setUserName(String userName) {
        User.userName = userName;
    }

    public static void setRolName(String rolName) {
        User.rolName = rolName;
    }
    
}
