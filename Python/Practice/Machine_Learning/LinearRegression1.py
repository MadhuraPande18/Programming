import numpy as np
import pandas as pd
import matplotlib.pyplot as plt

def MarvellousPredictor():
    #load the data
    X=[1,2,3,4,5]
    Y=[3,4,2,4,5]

    print("Value of Independent variables:X",X)
    print("Value of dependent variables:",Y)

    mean_x=np.mean(X)
    mean_y=np.mean(Y)

    print("X_mean",mean_x)
    print("Y_mean",mean_y)

def main():
    MarvellousPredictor()

if __name__=="__main__":
    main()