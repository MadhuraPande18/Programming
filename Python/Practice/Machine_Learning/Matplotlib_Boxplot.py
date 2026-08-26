import matplotlib.pyplot as plt
import seaborn as sns

def main():

    # Detecting outliers(mhanje out of range)
    sns.boxplot(x= [10,20,30,110])

    #either we can remove outlier or replace

    plt.show()
    
if __name__ == "__main__":
    main()