#ADAM OWOLABI
#PROGRAM TO PHONENUMBERS USING PHONEBOOKS
def main():
    #prompt user for input
    
    print("Course: CS101 CS102 CS103 NT110 CM241\n")
    x = str(input("Enter a course to display: "))


    courseRoom = {'CS101':'3004','CS102':'4501','CS103':'6755','NT110':'1244', 'CM241':'1411'}

    courseInstructor = {'CS101':'Haynes','CS102':'Alvarado','CS103':'Rich','NT110':'Burke', 'CM241':'Lee'}
    
    courseTime = {'CS101':'8:00am','CS102':'9:00am','CS103':'10:00am','NT110':'11:00am', 'CM241':'11:00am'}
    

        

    m = courseRoom.get(x,'Entry not found')
    n = courseInstructor.get(x,'Entry not found')
    o = courseTime.get(x,'Entry not found')

    print(x)
    print("Room:", m)
    print("Instructor:", n)
    print("Time:", o)
    
main()
