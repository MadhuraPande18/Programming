import time

def factorial(no):
    fact = 1

    for i in range(1, no + 1):
        fact = fact * i

    return fact

def main():
    value = int(input("Enter a number: "))

    start = time.perf_counter()      # Start time

    ans = factorial(value)

    end = time.perf_counter()        # End time

    print("Factorial is:", ans)
    print("Execution Time:", end - start, "seconds")

if __name__ == "__main__":
    main()