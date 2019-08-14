m=('January','February','December','May','September','July','March')
y=1995
i=0
c=(1,4,2,5)
for i in range(43):
    y+=1 if i<3 else 2 if i<7 else 5 if i<8 else 3 if i<10 else 0 if i%2 else 1
    q=i if i<4 else c[i-4] if i<8 else 4 if i%2 else 6
    print 'JDK %s %s released in %s %s' % ('1.%d'%i if i<5 else i,'was' if i<11 else 'will be',m[q],y)