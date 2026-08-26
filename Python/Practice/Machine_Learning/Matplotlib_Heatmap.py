import matplotlib.pyplot as plt
import seaborn as sns
import pandas as pd

def main():
    dobj=pd.DataFrame({
        "A":[1,2,3],
        "B":[4,5,6],
        "C":[7,8,9]
    })

    print(dobj)
    # Feature Correlation
    sns.heatmap(dobj.corr(),annot=True)
      #cor==correlation
    
    plt.show()  #to display
   

if __name__ == "__main__": 
    main()