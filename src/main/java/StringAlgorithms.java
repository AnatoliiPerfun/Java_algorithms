

public class StringAlgorithms {

    public static void main(String[] args) {
        System.out.println(lowCase("la la")); //check string is lowercase
        System.out.println(upCase("CHA CHA")); // check string is uppercase
        System.out.println(normalizeString(" My Name, is Cheeky ")); // trimming string
        String s = "Boom boom";
        System.out.println(atEvenIndex(s, 'b'));
        System.out.println(atEvenIndex(s, 'o'));
    }


    public static boolean atEvenIndex(String s, char item) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        for ( int i = 0; i < s.length()/2+1; i = i+2) {
            if (s.charAt(i) == item) {
                return true;
            }
        }
        return false;
    }
    public static String normalizeString(String s) {
        return s.toLowerCase().trim().replace(",", "");
    }
    public static boolean upCase(String s) {
        return s.chars().allMatch(Character::isUpperCase);
    }
    public static boolean lowCase(String s) {
        return s.chars().noneMatch(Character::isUpperCase);
    }
}
