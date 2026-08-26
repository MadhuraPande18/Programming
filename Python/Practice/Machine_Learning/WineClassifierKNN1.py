import pandas as pd
import matplotlib.pyplot as plt

from sklearn.model_selection import train_test_split
from sklearn.neighbors import KNeighborsClassifier
from sklearn.metrics import accuracy_score, confusion_matrix, classification_report

def MarvellousClassifier(DataPath):
    border = "-"*40

    #step 1:Load the dataset from csv file

    print(border)
    print("Step 1 : Load the dataset from CSV file")
    print(border)

    df=pd.read_csv(DataPath)

    print(border)
    print("some entries from the dataset")
    print(df.head())
    print(border)

    #Step 2:Clean the dataset by removing empty rows and col

    df.dropna(inplace=True)
    print("Tota; records",df.shape[0])
    print("Total columns",df.shape[1])
    print(border)


def main():
    border = "-"*40
    print(border)
    print("Wine Classifier using KNN")
    print(border)

    MarvellousClassifier(r"C:\PPA new\Python_Programming\My_Codes\Machine_Learning\WinePredictor.csv")

if __name__=="__main__":
    main()