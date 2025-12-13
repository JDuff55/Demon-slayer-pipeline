public class NameValidator{

    public static boolean isValidName(String name){
        return name != null && name.matches("[a-zA-z]+");
    }
}