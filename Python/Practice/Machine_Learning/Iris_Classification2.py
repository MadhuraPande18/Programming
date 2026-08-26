from sklearn import tree
from sklearn.datasets import load_iris

def main():
    print("Iris classification case study")

    Dataset=load_iris()

    #its is metadata of dataset=headers che names

    print("Independent variables are:") #features of flower

    print(Dataset.feature_names)

    print("Dependent variables are")      #lables(names)of flower

    print(Dataset.target_names)

    print("Length of independent variables is") #150
    print(len(Dataset.data))

    print("Length of dependent variables is")   #150
    print(len(Dataset.target))

if __name__ == "__main__":
    main()


# Dataset Size : 15