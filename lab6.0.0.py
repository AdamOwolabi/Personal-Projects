#Adam Owolabi
#04/22/23
#Program to loop through a a txt file and return the exchange rate value. 
#Method to run through file and find a match for th input 
def main():
    #prompt user for input
    txt_File = open('Exchrate.txt','r')
    x = str(input("Enter the name of the Country: "))
    foundFlag = False
    
    for line in txt_File:
        line = line.rstrip('\n')
        data = line.split(',')
        #if statement checks if the line the loop is on matches the user input 
        if data[0] == x:
            foundFlag = True
            print("Lab6-1 Answer")
            print("Currency:", data[1])
            print("Exchange rate:", data[2])
            break
    
    if not foundFlag:
        print("Lab6-1 Answer")
        print(x, "is not in the file.")
    txt_File.close()




main()
