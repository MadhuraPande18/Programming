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

    #Independent Variables for training
    Xtrain = [[35,1],[47,1],[90,0],[48,1],[90,0],[35,1],[92,0],[35,1],[35,1],[35,1],[96,0],[43,1],[110,0]]
    
    # Independent Vatiable for Testigi
    Xtest = [[35,1],[95,0]]
    
    # Dependent Variable for training
    
    Ytrain = [1,1,2,1,2,1,2,1,1,1,2,1,2]
    
    # Dependent Variable for training
    Ytest =  [1,2]

    modelobj = tree.DecisionTreeClassifier()             #Selection

    trainedmodel=modelobj.fit(Xtrain,Ytrain)                       #training

    Result = trainedmodel.predict([[35,1]])       #testing

    if Result == 1:
        print("object looks like tennis ball")      #[1,2]
    elif Result == 2 :
        print("Object looks like cricket ball")
if __name__ == "__main__":
    main()


# Dataset Size : 15