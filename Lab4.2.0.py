#Adam Owolabi
#03/10/23
#Program to display temperature conversion tables.

celsius = float(input("Enter in the starting tremperature: "))
originalCelsius = celsius

#input validation 
while celsius <= -273.15:
    print("Error: Temperature cannot be below absolute zero. Please reenter!")
    celsius = float(input("Enter in the starting tremperature: "))


#to determine how many iterations for whileloop
celsiusCounter = celsius + 31

#while loop to print conversions
print("temperature conversions using a while loop")
print(('  Cels         Fahr         Kelvin'))
while celsius != celsiusCounter:

    
    fahrenehitTemp = (9/5)* celsius + 32
    kelvinTemp = celsius + 273.15
    
    
    print("%5.2f  %12.2f %14.2f" % (celsius, fahrenehitTemp, kelvinTemp))
    celsius+=1






#for loop to print conversions
print("\ntemperature conversions using a for loop")
celsius = originalCelsius
print(('  Cels         Fahr         Kelvin'))
for x in range(0,31):
    
    fahrenehitTemp = (9/5)* celsius + 32
    kelvinTemp = celsius + 273.15
    
   
    print("%5.2f  %11.2f %14.2f" % (celsius, fahrenehitTemp, kelvinTemp))
    celsius += 1



#goodbye message
print("\nThank you for using the program!")



