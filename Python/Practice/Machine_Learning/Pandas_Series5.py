import pandas as pd

def main():
    
    sobj = pd.Series([25000,26000,27000,28000],index=["PPA","LB","Python","React"])

    print(sobj)
    print(sobj["Python"])

if __name__ == "__main__":
    main()