import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression

def main():
    df = pd.read_csv("C:\PPA new\Python_Programming\My_Codes\Machine_Learning\Advertising.csv")    

    print(df.shape)   
    print(df)
    
    #Data Cleaning
    if 'Unnamed: 0' in df.columns:
        df.drop(columns=['Unnamed: 0'], inplace=True)

        #removed unnamed wala column

    print(df.shape)

    print(df)

    

if __name__ == "__main__":
    main()