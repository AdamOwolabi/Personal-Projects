#Adam Owolabi
#04/22/23
#a program that displays the names of the countries inascending order determined by the number of units that can be purchasedfor one American dollar



def main():
    #prompt user for input
    txt_File = open('Exchrate.txt','r')
    lowest = []
    dataList = []
        
    for line in txt_File:
        line = line.rstrip('\n')
        line = line.split(',')
        dataList.append(line)

    dataList.sort
        
       
    for i in range(len(dataList)):
        lowest.append(dataList[i])
    lowest.sort(key=lambda x: x[2])

    for i in range (3):
      print(lowest[i][0])

    txt_File.close()
        





main()
