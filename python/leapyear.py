'''
@python2.7
Program to accept a year and check whether
the given year is a leap year or not.
'''

a = int(raw_input("Enter the year: "))

if not a % 4:
    print "The entered year is a leap year"
else:
    print "The entered year is not a leap year"

