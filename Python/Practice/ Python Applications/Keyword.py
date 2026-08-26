def display(name, age, salary, city):
     print("Name   :", name)
     print("Age    :", age)
     print("Salary :", salary)
     print("City   :", city)

#positional
def main():
     #display("Madhura",21,233.45,"Pune")    #correct
     #display(24,"Madhura",23.566,"Pune")    #wrong
     display(age=26,name="Rahul",city="mumbai",salary=2000.50)  #correct
   
if __name__ == "__main__":
    main()