public class WordCounter {
    public static int countWords(String text) {
        if (text == null) return 0;

        String trimmed = text.trim();
        if (trimmed.isEmpty()) return 0;

        StringBuilder sb = new StringBuilder();
        boolean lastWasSpace = false;

        for (int i = 0; i < trimmed.length(); i++) {
            char c = trimmed.charAt(i);
            if (c == ' ') {
                if (!lastWasSpace) {
                    sb.append(' ');
                    lastWasSpace = true;
                }
            } else {
                sb.append(c);
                lastWasSpace = false;
            }
        }

        String normalized = sb.toString();
        if (normalized.isEmpty()) return 0;

        int count = 1;
        for (int i = 0; i < normalized.length(); i++) {
            if (normalized.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }
}
