String[] r = ["January 1996", "February 1997", "December 1998","May 2000","February 2002","September 2004","December 2006","July 2011", "March 2014"];
for (i in 0:43) {
  print("JDK "+(if (i>4)then i.string else ("1."+i.string))
      +(if(i<11)then " was" else " will be")
      +" released in "+(r[i] else ((if(i%2==1)then "September "else "March ")+(2013+i/2).string)));
}