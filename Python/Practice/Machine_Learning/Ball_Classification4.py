from sklearn import tree

# Rough = 1
# Smooth = 0

# Tennis = 1
# Cricket = 2

def main():
    print("Ball classification case study")

    # Independent Variables
    X = [[35,1],[47,1],[90,0],[48,1],[90,0],[35,1],[92,0],[35,1],[35,1],[35,1],[96,0],[43,1],[110,0],[35,1],[95,0]]

    # Dependent Variables
    Y = [1,1,2,1,2,1,2,1,1,1,2,1,2,1,2]

    modelobj = tree.DecisionTreeClassifier()             #Selection

    trainedmodel=modelobj.fit(X,Y)            #training

    Result = trainedmodel.predict([[37,1],[94,0]])       #testing

    print("Model Predicts the object as : ",Result)      #[1,2]
if __name__ == "__main__":
    main()


# Dataset Size : 15