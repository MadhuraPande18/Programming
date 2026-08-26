import pandas as pd

import matplotlib.pyplot as plt

import seaborn as sns

from sklearn.model_selection import train_test_split

from sklearn.tree import DecisionTreeClassifier, plot_tree

from sklearn.metrics import (
    accuracy_score,
    confusion_matrix,
    classification_report,
    ConfusionMatrixDisplay
)

Border = "-"*40

#########################################################
# Step 1 : Load the dataset
#########################################################

print(Border)
print("Step 1 : Load the dataset")
print(Border)

DatasetPath = "iris.csv"

df = pd.read_csv(DatasetPath)   #df=data frame

print("Dataset gets loaded succesfully...")
print("Initial entries from dataset :")
print(df.head())        #first 5 col display

#########################################################
# Step 2 : Data Analysis (EDA)
#########################################################

print(Border)
print("Step 2 : Data analysis")
print(Border)

print("Shape of dataset : ",df.shape)
print("Column Names : ",list(df.columns))   #typecasted to list

print("Missing values (Per Column)")
print(df.isnull().sum())

print("Class Distribution (Species count)")
print(df["species"].value_counts())

print("Statistical Report of dataset")
print(df.describe())

#########################################################
# Step 3 : Decide Independent and Dependant Variablrs
#########################################################

print(Border)
print("Step 3 : Decide Independent and Dependant Variablrs")
print(Border)

# X : Independent variables / Fetures
# Y : Dependant variables   / Labels

feture_cols = [
    "sepal length(cm)",
    "sepal width(cm)",
    "petal length(cm)",
    "petal width(cm)",
]

X = df[feture_cols]
Y = df["species"]

print("X shape : ",X.shape) #(150,4)150 records and 4 col
print("Y shape : ",Y.shape) #150 records of species(150,1)

#########################################################
# Step 4 : Visualization
#########################################################

print(Border)
print("Step 3 : Decide Independent and Dependant Variablrs")
print(Border)

# Scatter plot
plt.figure(figsize=(7,5))

for sp in df["species"].unique():
    temp = df[df["species"]== sp]
    plt.scatter(temp["petal length(cm)"], temp["petal width(cm)"], label = sp)

plt.title("Iris : Petal length vs petal width")
plt.xlabel("petal length(cm)")
plt.ylabel("petal width(cm)")

plt.legend()
plt.grid(True)
plt.show()

#########################################################
# Step 5 : Split the Dataset for training and testing
#########################################################

#total(X,Y)=(150 rows,5 col)=(160,5)
# X=(150,3)
#Y=(150,1)

print(Border)
print("Step 5 : Split the Dataset for training and testing")
print(Border)

#Test size=20%
#Train size=80%

X_train,X_test,Y_train,Y_test=train_test_split(
    X,
    Y,
    test_size=0.2,      #keyword argument (its 20% testing)
    random_state=42
)

print("Data spliting activity done:")

print("X - Independent:",X.shape)   #(150,4)
print("Y - dependent:"   ,Y.shape)  #(150,1)
print("X_train:",X_train.shape)     #(120,4) 80% of 150
print("X_test:",X_test.shape)       #(30,4)
print("Y_train:",Y_train.shape)     #(120,)  //species
print("y_test:",Y_test.shape)       #(30,)  //species

