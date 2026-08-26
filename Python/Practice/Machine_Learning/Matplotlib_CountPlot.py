import matplotlib.pyplot as plt
import seaborn as sns

def main():

     # Catagorical data
    sns.countplot(data= ["A","B","A","A","B","A","C","D","D","D"])

    plt.show()
    

if __name__ == "__main__":
    main()