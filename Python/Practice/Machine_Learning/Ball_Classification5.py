from sklearn import tree

# Rough = 1
# Smooth = 0

# Tennis = 1
# Cricket = 2

def main():
    print("Ball classification case study")

    #original encoded dataset
    # Independent Variables
    X = [[35,1],[47,1],[90,0],[48,1],[90,0],[35,1],[92,0],[35,1],[35,1],[35,1],[96,0],[43,1],[110,0],[35,1],[95,0]]

    # Dependent Variables
    Y = [1,1,2,1,2,1,2,1,1,1,2,1,2,1,2]

    #independent variables for testing
    XTrain=[[35,1],[47,1],[90,0],[48,1],[90,0],[35,1],[92,0],[35,1],[35,1],[35,1],[96,0],[43,1],[110,0]]

    #independent var for testing
    XTest=[[35,1],[95,0]]

    #dependent variable for training
    YTrain=[1,1,2,1,2,1,2,1,1,1,2,1,2]

    #dependent variable for training

    YTest=[1,2]


    modelobj = tree.DecisionTreeClassifier()             #Selection

    trainedmodel=modelobj.fit(XTrain,YTrain)            #training(study)

    Result = trainedmodel.predict(XTest)       #testing(exam)

    print("Model Predicts the object as : ",Result)      #[1,2]
if __name__ == "__main__":
    main()


# Dataset Size : 15