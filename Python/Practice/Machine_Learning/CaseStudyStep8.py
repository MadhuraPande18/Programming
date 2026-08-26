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

df = pd.read_csv(DatasetPath)

print("Dataset gets loaded succesfully...")
print("Initial entries from dataset :")
print(df.head())

#########################################################
# Step 2 : Data Analysis (EDA)
#########################################################

print(Border)
print("Step 2 : Data analysis")
print(Border)

print("Shape of dataset : ",df.shape)
print("Column Names : ",list(df.columns))

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
    "petal width(cm)"
]

X = df[feture_cols]
Y = df["species"]

print("X shape : ",X.shape)
print("Y shape : ",Y.shape)

#########################################################
# Step 4 : Visulisations of dataset
#########################################################

print(Border)
print("Step 4 : Visulisations of dataset")
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

print(Border)
print("Step 5 : Split the Dataset for training and testing")
print(Border)


# Test size = 20%
# Train size = 80%

X_train, X_test, Y_train, Y_test = train_test_split(
    X,
    Y,
    test_size=0.2,   # keyword argument ahe 
    random_state=42
)

print("Data Spliting activity done : ")

print("X-Independent : ",X.shape)
print("Y-Independent : ",Y.shape)
print("X_train : ",X_train.shape)
print("X_test : ",X_test.shape)
print("Y_train : ",Y_train.shape)
print("Y_test : ",Y_test.shape)

#########################################################
# Step 6 : Build the model
#########################################################

print(Border)
print("Step 6 : Build the model")
print(Border)

print("We are going to use DecisionTreeClassifier")

model = DecisionTreeClassifier( 
    #all the parameters
    criterion="gini",
    max_depth=3,     #Hyper parameter tuning
    random_state=42
)

print("Model successfully created : ",model)

#########################################################
# Step 7 : Train the model
#########################################################

print(Border)
print("Step 7 : Train the model")
print(Border)

model.fit(X_train,Y_train)
print("Model training completed")

######################################################
# Step 8: Evaluate the model
######################################################
print(Border)
print("Step 8 : Evaluate the model")
print(Border)

Y_pred=model.predict(X_test)
print("Model Evaluation (testing) Complete")

print("Expected answer : ")
print(Y_test)

print("Prediction answer : ")
print(Y_pred)

