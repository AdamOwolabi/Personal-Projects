package main //create a standalone executable 

import "fmt"   //part of a package to handle standard requirements, ex: fmt, mat, net 

func main()  {
	fmt.Println("Hi Mom!")

	// var name string = "Adam" 
	// var age int = 25

	name, age := "Mother", 10

	fmt.Println(name)

	fmt.Println(age)

	name, age = "Adam", 20

	fmt.Println(name)
	
	fmt.Println(age)

}
