Number = int(input("Enter the number upto which the series of n power n is to be printed:"))
Term = 1
Counter = 1
Count = 1
print("The series of n power n upto %d is" %(Number), end = ' ')
while Term <= Number:
  Term = 1
  Counter = 1
  while Counter <= Count:
    Term = Term * Count
    Counter = Counter + 1
  if Term <= Number:
    print ("m Main.class
    ", Term, end = '')
  Count = Count + 1
print(".")
