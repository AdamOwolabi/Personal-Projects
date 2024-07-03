
#Adam Owolabi
#Program to convert currencies 


def main():
    #prompt user for input


    try:
         maleNames = open('MaleNames.txt','r')
    except:
        print("Error: MaleNames.txt cannot be opened")
        quit()

    try:
         femaleNames = open('FemaleNames.txt','r')
    except:
        print("Error: FemaleNames.txt cannot be opened")
        quit()
   
    
    #lists
    maleList = []
    femaleList = []
    firstCase = []
    secondCase = []
    thirdCase = []
    
    
    
        
    for line in maleNames:
        line = line.rstrip('\n')
        line = line.split(',')
        maleList.append(line)
        
    for line in femaleNames:
        line = line.rstrip('\n')
        line = line.split(',')
        femaleList.append(line)

    maleNames.close()
    femaleNames.close()

    allNames = maleList + femaleList
    
    allNames.sort()

    print("All names: ",allNames)


    try: 
        #creat 3 file to store occurences
        a2iNames = open('babyNamesAtoI.txt', 'w')
        j2rNames = open('babyNamesItoS.txt', 'w')
        s2zNames = open('babyNamesStoZ.txt', 'w')

        

        #write the each name in a file based on first letter
        for name in allNames:
            #print(name[0].startswith("A"))
            if name[0].startswith(("A", "B", "C")) or name[0].startswith(("D", "E", "F")) or name[0].startswith(("G", "H", "I")):
                firstCase.append(name)
                a2iNames.write(str(name)+"\n")
            elif name[0].startswith(("J", "K", "L")) or name[0].startswith(("M", "N", "O")) or name[0].startswith(("P", "Q", "R")):
                secondCase.append(name)
                j2rNames.write(str(name)+"\n")
            elif name[0].startswith(("S", "T", "U")) or name[0].startswith(("V", "W", "X")) or name[0].startswith(("Y", "Z")):
                thirdCase.append(name)
                s2zNames.write(str(name)+"\n")

    except:
        print("Error, something's wrong with files") 
        
    


        
main()
    

