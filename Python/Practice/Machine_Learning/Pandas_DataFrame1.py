import pandas as pd

def main():
    Data={
        "Name":["Sagar","Amit","Pooja"],
        "Age":[23,26,25],
       "City":["Pune", "Mumbai", "Satara"]
    }

    dobj=pd.DataFrame(Data);       #dataframe=combination of series
    print(dobj)

    ##specific##

    print(dobj["City"])
    print(dobj["Age"])


if __name__=="__main__":
    main()