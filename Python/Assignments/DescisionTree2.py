import pandas as pd
import matplotlib.pyplot as plt
from sklearn.tree import plot_tree

from sklearn.model_selection import train_test_split
from sklearn.tree import DecisionTreeClassifier
from sklearn.metrics import accuracy_score
from sklearn.metrics import confusion_matrix
from sklearn.metrics import ConfusionMatrixDisplay

border='-'*40

# -------------------------------------------------------------
# Step 1 : Load Dataset
# -------------------------------------------------------------

DataSetPath= "student_performance_ml.csv"
df=pd.read_csv(DataSetPath)

print("Dataset loaded successfully")
print(border)

# -------------------------------------------------------------
# Step 2 : Analyze the dataset
# -------------------------------------------------------------

print("First 5 Records")
print(df.head())

print("\nDataset Shape :", df.shape)

print("\nInformation")
print(df.info())

print("\nMissing Values")
print(df.isnull().sum())

print("\nStatistical Information")
print(df.describe())

#########################################################
# Step 3 : Decide Independent and Dependant Variablrs
#########################################################

print(border)
print("Step 3 : Decide Independent and Dependant Variablrs")
print(border)

# X : Independent variables / Fetures
# Y : Dependant variables   / Labels

feture_cols = [
    "StudyHours",
    "Attendance",
    "PreviousScore",
    "AssignmentsCompleted",
    "SleepHours"
    
   
]

X = df[feture_cols]
Y = df["FinalResult"]

print("X shape : ",X.shape)
print("Y shape : ",Y.shape)

# -------------------------------------------------------------
# Step 4 : Vizualization of the dataset
# -------------------------------------------------------------

plt.figure(figsize=(6,4))
plt.hist(df["StudyHours"], bins=10)
plt.title("Study Hours Distribution")
plt.xlabel("Study Hours")
plt.ylabel("Students")
plt.show()

# -------------------------------------------------------------
# Step 5 : train_test_split
# -------------------------------------------------------------

X_train, X_test, Y_train, Y_test = train_test_split(
    X,
    Y,
    test_size=0.2,
    random_state=42
)

# -------------------------------------------------------------
# Step 6 : Train descision tree model
# -------------------------------------------------------------

model=DecisionTreeClassifier(random_state=42)

model.fit(X_train,Y_train)

print("Trained model successfully")


# -------------------------------------------------------------
# Step 7 : Prediction
# -------------------------------------------------------------

Y_pred = model.predict(X_test)

print("\nActual Values")
print(Y_test.values)

print("\nPredicted Values")
print(Y_pred)


# -------------------------------------------------------------
# Step 8 : Accuracy
# -------------------------------------------------------------

accuracy=accuracy_score(Y_test,Y_pred)
print("Accuracy of the mode is",accuracy*100)

# -------------------------------------------------------------
# Step 9 : Confusion Matrix
# -------------------------------------------------------------

cm=confusion_matrix(Y_test,Y_pred)

print("Confusion matrix")
print(cm)

disp = ConfusionMatrixDisplay(confusion_matrix=cm)
disp.plot()
plt.show()

# -------------------------------------------------------------
# Step 10 : Training Accuracy
# -------------------------------------------------------------

train_pred=model.predict(X_train)   #exam

train_accuracy=accuracy_score(Y_train,train_pred)

print(train_accuracy*100)

# -------------------------------------------------------------
# Step 11 : Compare Train & Test Accuracy
# -------------------------------------------------------------

print("Training Accuracy :", train_accuracy * 100)
print("Testing Accuracy :", accuracy * 100)

if(train_accuracy>accuracy):
    print("Overfitting")

elif(accuracy>train_accuracy):
    print("Underfitting")

else:
    print("Its balanced")

# -------------------------------------------------------------
# Step 12 : Compare Different max_dept
# -------------------------------------------------------------
print("\nAccuracy Comparison")

depths = [1,3,None]

for depth in depths:

    temp_model = DecisionTreeClassifier(max_depth=depth,
                                        random_state=42)

    temp_model.fit(X_train,Y_train)

    prediction = temp_model.predict(X_test)

    acc = accuracy_score(Y_test,prediction)

    print("max_depth =",depth,
          " Accuracy = {:.2f}%".format(acc*100))

# -------------------------------------------------------------
# Step 14 : Predict New Student
# -------------------------------------------------------------

new_data = pd.DataFrame(
    [[5, 8, 7, 6, 9]],
    columns=X.columns
)
prediction = model.predict(new_data)
if prediction[0]==1:
    print("Student Will PASS")

else:
    print("Student Will FAIL")

# -------------------------------------------------------------
# Step 15 : Final Conclusion
# -------------------------------------------------------------

print("\nConclusion")
print("Decision Tree model trained successfully.")
print("Accuracy calculated.")
print("Confusion Matrix generated.")
print("Training and Testing accuracy compared.")
print("Different max_depth values compared.")
print("Prediction completed.")

print(border)

new_Students=pd.DataFrame(
    [
        [8,95,90,10,7],
        [7,88,82,9,8],
        [6,85,80,8,7],
        [4,60,55,5,6],
        [9,98,96,10,8]
    ],

    columns=X.columns
)

Prediction = model.predict(new_Students)

print(Prediction)
print(model.predict_proba(new_Students))
for i, result in enumerate(Prediction, start=1):
    if result == 1:
        print(f"Student {i} Will PASS")
    else:
        print(f"Student {i} Will FAIL")

#Accuracy = (Correct Predictions / Total Predictions) × 100

correct=0

for actual,predicted in zip(Y_test,Y_pred):
    if actual==predicted:
        correct=correct+1

manual_accuracy=(correct/len(Y_test)*100)
print(manual_accuracy)

print(border)
missclassified=X_test[Y_test!=Y_pred]
print("Misclassified Students")

print(missclassified)

print("Total missclassified:",len(missclassified))


print(border)

states=[0,10,42]

for state in states:
    model=DecisionTreeClassifier(random_state=state)
    model.fit(X_train,Y_train)

    pred=model.predict(X_test)

    acc=accuracy_score(Y_test,Y_pred)

    print("Random state=",state,
          "Accuracy=",acc*100)


print(border)
print("Visualization")

plt.figure(figsize=(10,8))

plot_tree(
    model,
    feature_names=X.columns,
    class_names=["FAIL", "PASS"],
    filled=True
)

plt.show()

print(border)

df["PerformanceIndex"] = (
    df["StudyHours"] * 2
) + df["Attendance"]

feature_cols = [
    "StudyHours",
    "Attendance",
    "PreviousScore",
    "AssignmentsCompleted",
    "SleepHours",
    "PerformanceIndex"
]

model.fit(X_train, Y_train)

train_accuracy = accuracy_score(
    Y_train,
    model.predict(X_train)
)

test_accuracy = accuracy_score(
    Y_test,
    model.predict(X_test)
)

print("Training Accuracy :", train_accuracy * 100)
print("Testing Accuracy :", test_accuracy * 100)

#Max_Depth=node == Fully grown tree
#A small max_depth creates a simple tree and may cause underfitting.
#A large max_depth creates a complex tree and may cause overfitting.
#max_depth=None means there is no limit, so the tree grows until no more useful splits can be made.