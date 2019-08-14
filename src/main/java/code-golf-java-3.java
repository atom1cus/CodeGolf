class A {
    public static void main(String[] a) {
        long d = 0xbbba51b000L, v = 0x91ac5564f2d01c0L, i = 0;
        for (; i < 43; v >>= 6)
            System.out.printf("JDK %s w%s released in %3$tB %3$tY%n",
                    i < 5 ? "1." + i : i,
                    i++ < 11 ? "as" : "ill be",
                    d += (6 + v & 63) * 0x9ca41900L
            );
    }
}