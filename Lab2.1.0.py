#Name: Adam Owolabi
#Date: 02/26/23
#Description: Soccer calculator based on user inputs

print("CMSY 156 Soccer Calculator") #Displays Welcome message



option = 'y'
while option == 'y' or option =='Y':

    #Inputs for variables 
    games = float(input("Enter number of games: ")) 
    while games < 0:
        print("Error - number of games cannot be negative of games i.e < 0, pls reenter")
        games = float(input("Enter number of games: "))
    if games == 0:
            print(f'The average goals per game is: {0:15.2f}')
            print(f'The average shots on goal per game is: {0:7.2f}')
            print(f'The average shots per goal is: {0:15.2f}')
            print()
            option = str(input("Would you like to enter another(y/n): "))
            print()
    else:
            shots = float(input("Enter number of shots: "))
            if shots < 0:
                while shots < 0:
                    print("Error - shots on goal cannot be negative i.e < 0, plese reenter: ")
                    print()
                    shots = float(input("Enter number of shots: "))
            goals = float(input("Enter number of goals: "))
            if goals < 0:
                while goals < 0:
                    print("Error- number of goals cannot be negativei.e < 0, please reenter: ")
                    print()
                    goals = float(input("Enter number of goals: "))
            print()
#Calculations
            if goals == 0:
                shotsPerGoals = 0.00
                goalsPerGames = 0.00
    
                
            else: 
                goalsPerGames = (goals/games)
                shotsPerGames = shots/games
                shotsPerGoals = shots/goals
            print()
#Print Statements
            print("\nThe average goals per game is: {:15.2f}".format(goalsPerGames))
            if goals == 0:
                print('The average shots on goals per game is: {:6.2f}'.format(shots/games))
            else:
                print('The average shots on goals per game is: {:6.2f}'.format(shotsPerGames))
            print("The average shots per goals is: {:14.2f}".format(shotsPerGoals))
            print()
            option = str(input("Would you like to enter another(y/n): "))

            if option != 'y' and option != "Y" and option != 'n' and option != "N":
                while option != 'y' and option != 'Y' and option != 'n' and option != 'N':
                    print("Error - must enter y or n. Please try again.")
                    print()
                    option = str(input("Would you like to enter another(y/n): "))



            
#GoodBye message
print("Thanks for playing")




           
