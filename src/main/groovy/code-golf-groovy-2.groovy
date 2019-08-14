y=java.time.YearMonth.of 1996,1
43.times{ i ->
    y = y.plusMonths i < 10 ? [0, 13, 22, 17, 21, 31, 27, 55, 32, 42][i] : 6
    println "JDK ${i < 5 ? "1.$i" : i} w${i < 11 ? 'as' : 'ill be'} released in $y.month $y.year"
}