iphone = input("Enter the phone model: ") #get the projected sales
phoneCost = float(input("Enter the phone cost: $")) #projected phoneCost
warrantyCost = float(input("Enter the warranty cost: $")) #WarrantyCost

#Calculations 
salesTax = 5/100 * (phoneCost + warrantyCost)
shippingCost = 1.8/100 * phoneCost
totalAmount = phoneCost + warrantyCost + salesTax + shippingCost

print("\nReceipt: ")
print("Model: $ ", iphone + "\n")
print("warranty cost: $", format(warrantyCost, '.2f')+"\n")
print("Sales tax: $", format(salesTax, '.2f')+ "\n")
print("Shipping Cost: $", format(shippingCost, '.2f')+ "\n")
print("Total Price: $", format(totalAmount, '.2f')+ "\n")
