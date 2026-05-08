public class countWordsInString {
    public int countWords(String v) {
        if (v == null || v.isEmpty()) return 0;
        String[] arr = v.trim().split("\\s+");
        return v.trim().isEmpty() ? 0 : arr.length;
    }
}
