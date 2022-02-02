import java.util.Arrays;

public class AssassinPath {
    public static void main(String[] args) {

        String[] example1 = {
                "X.....>",
                "..v..X.",
                ".>..X..",
                "A......"
        }; // shoul return false

        String[] example2 = {
                "...Xv",
                "AX..^",
                ".XX.."
        };

        System.out.println("\n");
        Arrays.asList(example1).forEach(s -> {
            System.out.print("| ");
            for (char c : s.toCharArray()) {
                System.out.print(c + " | ");
            }
            System.out.println("\n");
        });
    }
}
