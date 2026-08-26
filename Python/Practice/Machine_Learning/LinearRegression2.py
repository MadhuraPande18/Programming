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

    n=len(X)    #5
    #Y=mx+c
    #m=(sum(x-xbar)*(Y-ybar))/(sum(x-xbar)**2)

    numerator=0
    denominator=0
    for i in range(n):
        numerator=numerator+((X[i]-mean_x)*(Y[i]-mean_y))
        denominator=denominator+((X[i]-mean_x)**2)

    m=numerator / denominator
    
    print("Slope of line m:",m) #0.4

    C=mean_y-(m*mean_x)

    print("Y intercept of line ie C : ",C)

def main():
    MarvellousPredictor()

if __name__=="__main__":
    main()