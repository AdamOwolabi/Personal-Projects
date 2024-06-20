#Adam Owolabi
#02/23/23
#Program to calculate total cost of pizza including tax from a restaurant

#se
cheeseCost = 17.10
gardenFreshCost = 18.49
meatLoversCost = 19.75
totalCost = 0
salesTax = 0.06
deliveryCost = 5.00

print("Welcome to the CMSY-156 Pizza shop")
print("")

orderChoice = int(input("Enter 1 for delivery; 2 for pickup: "))

#check if it's a delivery order
while orderChoice != 1 and orderChoice != 2:
    print("Error: please enter either 1 or 2. Please Try again!")
    orderChoice = int(input("Enter 1 for delivery; 2 for the pickup: "))
    print("")
if orderChoice == 1:
    deliveryAddress = str(input("Please enter your delivery address: "))
    totalCost += deliveryCost
    print("")
elif orderChoice == 2:
    totalCost = 0
    print("")


#Entry for pizza type
print("What would you like to order today?")
print("\n1. for the cheese pizza \n2. for a Garden Fresh pizza \n3. for a Meat Lovers pizza \n4. Checkout")
userChoice = int(input("Enter your order here: "))
x = 1
while x != 0:
    while userChoice != 1 and userChoice != 2 and userChoice != 3 and userChoice != 4:
        #Entry for pizza type
        print("Error: please enter a valid menu option. Please Try again!")
        print("\n1. for the cheese pizza \n2. for a Garden Fresh pizza \n3. for a Meat Lovers pizza \n4. Checkout")
        userChoice = int(input("Enter your order here: "))
    if userChoice <= 3:
        #if elif statements to calculate cost
            if userChoice == 1:
                print("\nyou ordered a cheese pizza")
                totalCost += cheeseCost
                print("What would you like to order today?")
                print("")
                print("\n1. for the cheese pizza \n2. for a Garden Fresh pizza \n3. for a Meat Lovers pizza \n4. Checkout")
                userChoice = int(input("Enter your order here: "))
            elif userChoice == 2:
                print("\nYou entered a Garden Fresh Pizza")
                totalCost += gardenFreshCost
                print("What would you like to order today?")
                print("")
                print("\n1. for the cheese pizza \n2. for a Garden Fresh pizza \n3. for a Meat Lovers pizza \n4. Checkout")
                userChoice = int(input("Enter your order here: "))
            elif userChoice == 3:
                print("\nYou ordered a Meat Lovers Pizza")
                totalCost += meatLoversCost
                print("What would you like to order today?")
                print("")
                print("\n1. for the cheese pizza \n2. for a Garden Fresh pizza \n3. for a Meat Lovers pizza \n4. Checkout")
                userChoice = int(input("Enter your order here: "))
    if userChoice == 4:
        tipAmount = float(input("Please enter the amount of the tip: $"))
        totalCost += tipAmount + (totalCost*salesTax)
        print("The total cost with tax and tip is: $",format(totalCost,'.2f'))
        x = 0
        print("")



    
    #print address if it's a delivery order
if orderChoice == 1:
        print("The pizza will be delivered to: ", deliveryAddress)


#Thank you message
print("\nThank you for using the CMSY-156 Pizza shop. Please come again")
print("")
    







 
                  
            
            
        

