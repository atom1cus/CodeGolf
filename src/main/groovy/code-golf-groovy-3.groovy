y=1996
(0..42).each { i ->
    m = java.time.Month.of i<8 ? [1,2,12,5,2,9,12,7][i] : i%2 ? 9 : 3
    y += i<8 ? [1,2,2,2,2,5,3,3][i] : i%2 ? 0 : 1
    println "JDK ${i < 5 ? "1.$i" : i} w${i < 11 ? 'as' : 'ill be'} released in $m $y"
}