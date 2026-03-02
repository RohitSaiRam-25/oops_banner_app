package oops_banner_app;

public class uc5 {
    public static void main(String[] args) {
         // Declare and initialize array in a single statement
        String[] banner = {
            String.join("", " ***** ", "   ", " ***** ", "  ", " ***** ", "   ", " ***** "),
            String.join("", "*     *", "  ", "*     *", "  ", "*    * ", "  ", "*     *"),
            String.join("", "*     *", "  ", "*     *", "  ", "*    * ", "  ", "*      "),
            String.join("", "*     *", "  ", "*     *", "  ", "*****  ", "   ", " ***** "),
            String.join("", "*     *", "  ", "*     *", "  ", "*      ", "        ", "*"),
            String.join("", "*     *", "  ", "*     *", "  ", "*      ", "  ", "*     *"),
            String.join("", " ***** ", "   ", " ***** ", "  ", "*      ", "   ", " ***** ")
        };

        // Loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
    
}
