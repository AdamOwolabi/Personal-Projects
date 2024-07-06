#ADAM OWOLABI
#PROGRAM TO PHONENUMBERS USING PHONEBOOKS
def main():
    #prompt user for input

    x = str(input("Enter a 10 CHRACTER phone number to be translated: "))

    m = x.upper()
    print(m)


    phoneBook = {'A':'2','B':'2','C':'2','D':'3','E':'3','F':'3','G':'4',
                 'H':'4','I':'4','J':'5','K':'5','L':'5','M':'6','N':'6',
                 'O':'6','P':'7','Q':'7','R':'7','S':'7','T':'8','U':'8',
                 'V':'8','W':'9','X':'9','Y':'9','Z':'9', '-':'-'}

    
    
    #z = phoneBook.get('B','Entry not found')
    
    Y = []
    for index in m:
        y = phoneBook.get(index,'Entry not found')
        Y.append(y)
        

    print(*Y,sep='')
    
main()


   
