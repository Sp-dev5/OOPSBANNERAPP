public class OOPSBannerApp {
    public static void main(String[] args) {
        // UC4: Build the banner lines into an array and print with a loop
        String[] bannerLines = new String[] {
            String.join(" ", "  *****  ", "  *****  ", "*******  ", "  *****  "),
            String.join(" ", " *     * ", " *     * ", "*      * ", " *     * "),
            String.join(" ", "*       *", "*       *", "*      * ", "*        "),
            String.join(" ", "*       *", "*       *", "*******  ", "  ****   "),
            String.join(" ", "*       *", "*       *", "*        ", "       * "),
            String.join(" ", " *     * ", " *     * ", "*        ", " *     * "),
            String.join(" ", "  *****  ", "  *****  ", "*        ", "  *****  ")
        };

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
