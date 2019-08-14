p = { v, m ->
  d = new Date(96, m, 1)
  b = v < 11 ? "was" : "will be"
  printf "JDK $v $b released in %tB %tY\n", d, d
}
p 1.0, 0
p 1.1, 13
p 1.2, 35
p 1.3, 52
p 1.4, 73
p 5, 104
p 6, 131
p 7, 186
p 8, 218
(9..42).each {
  p it, 6 * it + 206
}