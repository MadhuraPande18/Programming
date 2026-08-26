import os

def main():

    print("PID of running process is:", os.getpid())
    print("PPID of running parent process is:", os.getppid())

if __name__ == "__main__":
    main()

#ppid=parent process id
#pid=process id