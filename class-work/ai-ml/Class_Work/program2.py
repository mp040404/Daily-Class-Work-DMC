def square(number):
    return number ** 2

print(f"square = {square} , type = {type(square)}")
print(f"square of 5 = {square(5)}")
print("-" * 80)

square_lamda = lambda number : number ** 2
print(f"square_lambda = {square_lamda},type = {type(square_lamda)}")
print(f"square of 5 = {square_lamda(5)}")
print('-'*80)

add = lambda n1,n2 : n1 + n2 
print(f"10 + 20 = {add(10,20)}")
print('-'*80)

subtract = lambda n1 , n2 : n1 - n2
print(f"10 - 20 = {subtract(10,20)}")
print('-'*80)