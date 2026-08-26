import pandas as pd
import numpy as np
import matplotlib.pyplot as plt

from sklearn.model_selection import TimeSeriesSplit
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_squared_error, r2_score

def Marvellous_Advertise(DataPath):
    Border='-'*40
    #---------------------------------------------------------------------------------------------
    # Step 1 : Load Dataset
    #---------------------------------------------------------------------------------------------

    print(Border)

    print("Step 1:load dataset")

    df=pd.read_csv(DataPath)
    print("Few records from dataset:")

    #---------------------------------------------------------------------------------------------
    # Step 2 : Remove unwanted columns
    #---------------------------------------------------------------------------------------------

    print(Border)
    print("Step 2:Remove unwanted columns")
    print(Border)

    print("Shape of data before removal:",df.shape)

    if 'Unnamed: 0' in df.columns:
        df.drop(columns=['Unnamed: 0'],inplace=True)

    #removed unnamed column
    print("Shape of data after removal:",df.shape)

    print(Border)
    print("Clean dataset")
    print(Border)

    print(df.head())

    #---------------------------------------------------------------------------------------------
    #  Step 3 : Check missing values
    #---------------------------------------------------------------------------------------------

    print(Border)
    print("Step 3:Check missing values")
    print(Border)

    print("Missing values count:\n",df.isnull().sum())

    #---------------------------------------------------------------------------------------------
    # Step 4 : Display Statistical summary
    #---------------------------------------------------------------------------------------------

    print(Border)
    print("Step 4:Display statistical summary")
    print(df.describe())

    #---------------------------------------------------------------------------------------------
    # Step 5 : Correlation between columns
    #---------------------------------------------------------------------------------------------

    print(Border)
    print("Step 5:Correlation between columns")
    print(Border)

    print("Correlation matrix")
    print(df.corr())

def main():
    Marvellous_Advertise(r"C:\PPA new\Python_Programming\My_Codes\Machine_Learning\Advertising.csv")
if __name__ == "__main__":
    main()