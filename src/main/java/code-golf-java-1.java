class С {
    public static void main(String[] a) {
        for (int i = 0; i < 43; i++) System.out.printf(
                "JDK %s w%s released in %tB %<tY\n",
                i < 5 ? "1." + i : i,
                i < 11 ? "as" : "ill be",
                new java.util.Date(0, i < 9 ? "ҀҍңҴӉӨԃԺ՚".charAt(i) : 6 * i + 'Վ', 1)
        );
    }
}