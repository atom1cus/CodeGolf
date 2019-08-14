public class A {
    public static void main(String[] a) {
        var b = java.time.YearMonth.of(1995, 7);
        var v = 0x91ac5564f2d01c0L;

        for (int i = 0; i < 43; v >>= 6)
            System.out.printf("JDK %s" + i + " %s released in %3$tB %3$tY%n",
                    i < 5 ? "1." : "",
                    i++ < 11 ? "was" : "will be",
                    b = b.plusMonths(6 + v & 63));
    }
}