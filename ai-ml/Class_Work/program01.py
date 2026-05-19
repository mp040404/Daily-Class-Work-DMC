def function1():
    print("inside function1")

def function2(param):
    print(f"inside function2")
    print(f"param = {param}, type = {type(param)}")
    param()

def add(p1,p2):
    print(f"inside add")
    print(f"{p1} + {p2} = {p1 + p2}")

def substract(p1,p2):
    print(f"inside substract")
    print(f"{p1} - {p2} = {p1 - p2}")

def multiply(p1,p2):
    print(f"inside multiply")
    print(f"{p1} * {p2} = {p1 * p2}")

def divide(p1,p2):
    print(f"inside divide")
    print(f"{p1} / {p2} = {p1 / p2}")

def execute(function):
    print(f"inside execute")
    print(f"function = {function}, type = {type(function)}")

    function(10,20)

execute(add)
execute(substract)
execute(divide)
execute(multiply)