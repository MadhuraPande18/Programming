from sklearn.datasets import load_iris      

def main():
    print("Iris Classification case study")

    Dataset = load_iris()

    Border = "-"*40

    print(Border)

    for i in range(len(Dataset.target)):
        print("ID %d, Features %s, Label %s"%(i,Dataset.data[i],Dataset.target[i]))   

    print(Dataset.data[0])
    print(Dataset.data[1])
    print(Dataset.data[2])
    print(Dataset.data[3])

    print(Dataset.target[50])       #target->dependant Variable
    print(Dataset.target[51]) 
    print(Dataset.target[52]) 
    print(Dataset.target[53])
    

    print(Dataset.target[100])       #target->dependant Variable
    print(Dataset.target[101]) 
    print(Dataset.target[102]) 
    print(Dataset.target[103])

if __name__ == "__main__":
    main()