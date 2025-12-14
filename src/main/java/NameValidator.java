public class NameValidator {
    //class for name validator
    public static boolean isValidName(String name) {
        return name != null && name.matches("[a-zA-Z]+");
    }
}
