import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
from sklearn.model_selection import TimeSeriesSplit
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_squared_error, r2_score
from sklearn.model_selection import train_test_split
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

    #---------------------------------------------------------------------------------------------
    # Step 6 : Split Dataset into independant &  dependant variable
    #---------------------------------------------------------------------------------------------       
    
    print(Border)
    print("Step 6 : Split Dataset into independant &  dependant variable")
    print(Border)
    
    X = df[['TV','radio','newspaper']]
    Y = df[['sales']]

    print("Shape of independent variables : ",X.shape)
    print("Shape of dependent variables : ",Y.shape)

    #---------------------------------------------------------------------------------------------
    # Step 7 : Split Dataset for Training and testing 
    #---------------------------------------------------------------------------------------------       
    
    print(Border)
    print("Step 7:Split the dataset for training and testing")
    print(Border)

    X_train,X_test,Y_train,Y_test=train_test_split(X,Y,test_size=0.2,random_state=42)

    print(X_train.shape)
    print(X_test.shape)
    print(Y_train.shape)
    print(Y_test.shape)

    #---------------------------------------------------------------------------------------------
    # Step 8 : create and Train the Model 
    #---------------------------------------------------------------------------------------------       
    model=LinearRegression()
    model.fit(X_train,X_test)


    #---------------------------------------------------------------------------------------------
    # Step 9 : Test the Model 
    #---------------------------------------------------------------------------------------------       
    
    print(Border)
    print("Step 9 : Test the model ")
    print(Border)

    Y_Pred=model.predict(X_test)
    
    #---------------------------------------------------------------------------------------------
    # Step 10 : Evaluate the Model 
    #---------------------------------------------------------------------------------------------       
    
    print(Border)
    print("Step 10 : Evaluate the model ")
    print(Border)

    MSE=mean_squared_error(Y_test,Y_Pred)
    #Y_test=actual values
    #Y_Pred=predicted values

    RMSE=np.sqrt(MSE)
    R2=  r2_score(Y_test,y_pred)

    print("Mean suqared error:",MSE)
    print("Root mean squared error:",RMSE)
    print("R square ",R2)

    #---------------------------------------------------------------------------------------------
    # Step 11 : Calculate Model Coifficient
    #---------------------------------------------------------------------------------------------       
    
    print(Border)
    print("Step 11:Calculate model coefficient")  
    print(Border)

    for column,value in zip(X.columns,model.coef_):
        print(f"{column}:{value}")

        ##zip is used to merge

    print("Intercept:",model.intercept_)


    #---------------------------------------------------------------------------------------------
    # Step 12 : Compare the actual and predicted values
    #---------------------------------------------------------------------------------------------       
    
    print(Border)
    print("Step 12 : Compare the actual and predicted values")
    print(Border)

    Result=pd.DataFrame({
        'Actual sale':Y_test.values,
        'Predicted sale':Y_Pred
    })

    print(Result.head())

def main():
    Marvellous_Advertise(r"C:\PPA new\Python_Programming\My_Codes\Machine_Learning\Advertising.csv")
if __name__ == "__main__":
    main()