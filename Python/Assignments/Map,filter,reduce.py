from functools import reduce
#input
numbers=[1,2,3,4,5,6,7,8,9,10]

# 1. map() - Square of each number
square=list(map(lambda x:x*x,numbers))
print(square)

#filter() -Even numbers

even=list(filter(lambda x:x%2==0),numbers)
print("Even numbers",even)

#filter-odd numbers

odd=list(filter(lambda x:x%2!=0),numbers)
print(odd)

#4.reduce() sum of all

total=reduce(lambda x,y:x+y,numbers)
print("Sum",total)