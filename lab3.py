print("Welcome to the CMSY-156 Pizza shop")
print("What would you like to order today?")

cheeseCost = 17.10
gardenFreshCost = 18.49
meatLoversCost = 19.75
totalCost = 0
salesTax = 0.06
deliveryCost = 5.00

userChoice = int(input("\nEnter 1 for the cheese pizza, 2 for a Garden Fresh pizza, or 3 for a Meat Lovers pizza: "))
orderChoice = int(input("Enter 1 for delivery; 2 for the tip: "))

if orderChoice == 1:
    deliveryAddress = str(input("Please enter your delivery address: "))
    totalCost += deliveryCost


tipAmount = float(input("Please enter the amount of the tip: $"))







if userChoice == 1:
    print("\nyou ordered a cheese pizza")
    totalCost += cheeseCost +(cheeseCost*salesTax) + tipAmount
    print("The total cost with tax and tip is: $",format(totalCost,'.2f'))
elif userChoice == 2:
    print("\nYou entered a Garden Fresh Pizza")
    totalCost += gardenFreshCost+(gardenFreshCost*salesTax) + tipAmount 
    print("The total cost with tax and tip is: $",format(totalCost,'.2f'))
else:
    print("\nYou ordered a Meat Lovers Pizza")
    totalCost += meatLoversCost+(meatLoversCost*salesTax) + tipAmount
    print("The total cost with tax and tip is: $",format(totalCost,'.2f'))




if orderChoice == 1:
    print("The pizza will be delivered to: ", deliveryAddress)





print("\nThank you for using the CMSY-156 Pizza shop")







 
                  
            
            
        

