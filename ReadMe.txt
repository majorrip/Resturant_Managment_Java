CSE 215L Sec: 4
Final Project:

Respected sirs this readme file is an introduction on what we have done in this program 
we have stored all the information in files 
1. customer.txt        - Contains customer info
2. employedata.txt     - Contains Employee data
3. FEEDBACK.txt        - Contains Feedback from customer
4. manager.txt         - Contains manager name and password
5. totalemployees.txt  - contains Total Employee number
6. FileFood.txt --> which is stored Resources->Storage->FileFood.txt - It stores info about all amout of food purchased


					ALL INFORMATION IS SEPERATED BY ',' IN THE ABOVE FILES

*If having problems in signup that means the text files above have been mistakenly erased so i have a backup file so you just replace the file*

The features each packages include:

->In the universalsignin package
	there is a signup feature for customer.
	there is a sign in feature for employee.
	there is a sign in feature for manager.  
->Menu
	*this tends to pop up in other packages so i am naming what it has*
	DeveloperInfo class has all our information
	Menu where you can order from a fixed amount of food items.
	fileHandling handles the amount of food items and stores it in the text file named FileFood.txt
	Total sell displays fileHandlings data
->Manager
	add employee
	remove employee
	Employee Database
	pay Employee
	Track total sales -> shows total sales
	Check Menu	  -> shows menu
->Employee
	can give attendance
	can View Menu
	can Change password
	can deduct cost from a specific customers account (Customer Pay)
	Check how much money he was given by manager as salary
	Refil customer walet (refil customer balance)
->Customer
	can order food
	provide feedback
	check balance
	delete his/her account
	