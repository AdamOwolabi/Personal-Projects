#Adam Owolabi
#04/11/23
#Program to create several functions


def main():
    
    CELS_2_FAHR = 1
    FAHR_2_CELS = 2
    QUIT = 3
    C_ABS = -273.15
    F_ABS = -459.67


    
     
    option = 1

    while option >= 1 or option < 3:
        display_menu()
        option = int(input("Enter your choice: "))
        
        if option == CELS_2_FAHR:
            print('\nCelsius Conversions')
            temp = float(input("Enter the Celsius Temperature: "))
            while temp <= C_ABS:
                print("Error: Temperature cannot be below absolute zero. Please reenter!")
                temp = float(input("Enter in the Celsius tremperature: "))
            to_fahr(temp)
            print("%5.2f degrees in Celsius is %5.2f"%(temp, to_fahr(temp)))
            
        elif option == FAHR_2_CELS:
            print('\nFahrenheit Conversions')
            x = float(input("Enter the FAHRENHEIT Temperature: "))
            while x <= F_ABS:
                print("Error: Fahrenheit temperature cannot be below absolute zero. Please reenter!")
                x = float(input("Enter in the fahrenheit tremperature: "))
            to_cels(x)
            print("%5.2f degrees in Fahrenheit is %5.2f"%(x, to_cels(x)))
            
        elif option == QUIT:
            print("Thank you for using this program")
            break
        
        else:
            print('Error: invalid selection. Please reenter')
            
    
                
def to_fahr(ctemp):
    finalTemp = (9/5) * ctemp + 32
    return finalTemp
def to_cels(ftemp):
    finalTemp = (ftemp - 32)* 5/9
    return finalTemp
def display_menu():
    print("\nTemperature Conversions \n")
    print("(1)Celsius to Fahrenheit \n(2)Fahrenheit to Celsius \n(3) Quit")
    
        
        
main()

    
                     

    
    
    



        
    
    

