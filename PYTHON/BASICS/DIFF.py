def DIFF():
    a=int(input("Enter 1st no"));
    b=int(input("Enter 2nd no"));
    if a>b:
        c=a-b;
    if a<b:
        c=b-a;
    print("Diff is",c);

DIFF()