from sklearn.datasets import load_iris

def main():
    print("Iris classification case study")

    Dataset = load_iris()

    # First four feature vectors rows 
    print(Dataset.data[0])
    print(Dataset.data[1])
    print(Dataset.data[2])
    print(Dataset.data[3])

    # Target values (dependent variable)
    print(Dataset.target[50])
    print(Dataset.target[51])
    print(Dataset.target[52])
    print(Dataset.target[53])

    print(Dataset.target[100])
    print(Dataset.target[101])
    print(Dataset.target[102])
    print(Dataset.target[103])

if __name__ == "__main__":
    main()