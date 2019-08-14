val s = "September"
val f = "February"
val d = "December"
val m = listOf("January", f, d, "May", f, s, d, "July", "March", s)
val y = listOf(-9, -8, -7, -5, -3, -1, 1, 6, 9).map { 2005 + it }

(0..42).forEach {
    println("JDK ${if (it < 5) "1.$it" else it } w${if(it < 11)"as" else "ill be"} released in ${if (it < 8) m[it] else m [8 + it % 2]} ${if (it < 9) y[it] else 2013 + it/2}")
}