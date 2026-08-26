from sklearn import tree

#Rough=1
#Smooth=0

#Tennis=1
#Cricket=2

def main():
    print("Ball classification case study")

    #independent variables
    Fetures = [[35,1],[47,1],[90,0],[48,1],[90,0],[35,1],[92,0],[35,1],[35,1],[35,1],[96,0],[43,1],[110,0],[35,1],[95,0]]

    #dependent variables
    Labels = [1,1,2,1,2,1,2,1,1,1,2,1,2,1,2]

    modelobj=tree.DecisionTreeClassifier()
    trainedmodel=modelobj.fit(Fetures,Labels) #fit=training
    Result=(trainedmodel.predict([37,1],[94,0]))    #exam

    print("Model predicts the object as :",Result)


if __name__=="__main__":
    main()

#Dataset size=15