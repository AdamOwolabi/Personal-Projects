#ADAM OWOLABI
#02/23/23
#Program to calculate total cost of Ice Cream including tax from a restaurant


scoopCount = 0
REGULAR_PRICE = 2.75
DISCOUNT_PRICE = 2.10
WAFFLE_CONE = 1.55
totalCost = 0.00

scoopCount = int(input("How many scoop would you like? "))

#checks input if its valid
if scoopCount <= 0:
    print("You asked for %d scoops. You must order one or more scoops." %(scoopCount))
#only works if input is valid
elif scoopCount != 0:
    option = str(input("Would you like a waffle cone? y/n: "))
    if option =="Y" or option == 'y':
        print("The price of a waffle cone is $"+format(WAFFLE_CONE, '0.2f'))
        totalCost += 1.55
        print()

    #decides if regular price is applicable 
    if(scoopCount <= 2):
        totalCost += scoopCount * REGULAR_PRICE
        print()
        print("The price per scoop is $"+format(REGULAR_PRICE,'0.2f'))
        print("You ordered %d scoops " %(scoopCount))
        print("Your total cost is $"+format(totalCost,"0.2f")) 
    #decides if discounted price is applicable 
    elif(scoopCount >= 3):
        print()
        totalCost += scoopCount * DISCOUNT_PRICE
        print("The price per scoop is $"+format(DISCOUNT_PRICE,'.2f'))
        print("You ordered %d scoops"%(scoopCount))
        print("Your total cost is $"+format(totalCost,'.2f'))
    




print("Thank you for using the program")




    
    
    
    

