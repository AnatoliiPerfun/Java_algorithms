

public class StringAlgorithms {

    public static void main(String[] args) {
        System.out.println(lowCase("la la")); //check string is lowercase
        System.out.println(upCase("CHA CHA")); // check string is uppercase

        System.out.println(normalizeString(" My Name, is Cheeky ")); // trimming string

        String s = "Boom boom";
        System.out.println(atEvenIndex(s, 'b')); // check for even index
        System.out.println(atEvenIndex(s, 'o')); //

        System.out.println(reverse("string algorithms")); // make string reversed
        System.out.println(reverseTwo("string algorithms")); // make string reversed using build-in operation
        System.out.println(individualReverse("Cheeky cheeky la la boom boom cha cha cha"));
        // make each word reversed
    }


    public static String individualReverse(String s) {
        if(s == null || s.isEmpty()) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            sb.append(reverse(arr[i]));
            if (i != arr.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static String reverseTwo(String s) {
        if(s == null || s.isEmpty()) {
            return s;
        }
        return new StringBuilder(s).reverse().toString();
    }

    public static String reverse(String s) {
        if(s == null || s.isEmpty()) {
            return s;
        }
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
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
