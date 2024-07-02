
#Adam Owolabi
#Program to convert currencies 


def main():
    #prompt user for input
    txt_File = open('Exchrate.txt','r')
    dataList = []
    lowest = []
    d={}
    
        
    for line in txt_File:
        line = line.rstrip('\n')
        line = line.split(',')
        dataList.append(line)

    for i in range(len(dataList)):
        lowest.append(dataList[i])
    lowest.sort(key=lambda x: x[2])


    for i in range(len(dataList)):
        d[dataList[i][0]] = (dataList[i][1], eval(dataList[i][2]))

    print("{0} {1}s from {2} equals {3:,.2f} {4}s from {5}".format(amount, d[country1][0].lower(), country1, amount *
    d[country2][1] / d[country1][1], d[country2][0].lower(), country2))

        
main()
    

