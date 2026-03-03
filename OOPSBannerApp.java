
public class OOPSBannerApp {

    // Inner class
    static class CharacterPatternWrapper {
        private char character;
        private String[] pattern;

        public CharacterPatternWrapper(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Pattern for O
    public static String[] getOPattern() {
        return new String[]{
                " ***** ",
                " *   * ",
                " *   * ",
                " *   * ",
                " ***** "
        };
    }

    public static void main(String[] args) {

        CharacterPatternWrapper letterO =
                new CharacterPatternWrapper('O', getOPattern());

        for (String line : letterO.getPattern()) {
            System.out.println(line);
        }
    }
}