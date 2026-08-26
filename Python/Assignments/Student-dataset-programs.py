import pandas as pd
import matplotlib.pyplot as plt

Border='-'*40
#########################################################
# Step 1 : Load the dataset
#########################################################

print(Border)
print("Step 1 : Load the dataset")
print(Border)

DatasetPath=DatasetPath = "C:/PPA new/Python_Programming/My Assignments/student_performance_ml.csv"

df=pd.read_csv(DatasetPath)

print("Dataset gets loaded successfully")
print("Initial entries from the dataset are")
print(df.head())

#########################################################
#  2 : analyze the dataset
#########################################################

print("First 5 records:",df.head())
print("last 5 records:",df.tail())
print("Total rows and col",df.shape)
print("List of col names:",df.columns.to_list())
print("Data types of each column",df.columns.dtype)

print(Border)

#########################################################
#   Question 3:
#########################################################

TotalStudents=len(df)
Passed_Students=(df['FinalResult']==1).sum()
Failed_Students=(df['FinalResult']==0).sum()

print(TotalStudents)
print(Passed_Students)
print(Failed_Students)

#########################################################
#  Question 4:
#########################################################

print("Average study hours:",df['StudyHours'].mean())
print("Average Attendance :", df["Attendance"].mean())
print("Maximum previous score:",df["PreviousScore"].max())
print("Minimum sleet hours:",df['StudyHours'].min())

#########################################################
#  Question 4:
#########################################################

Counts=df["FinalResult"].value_counts()
print("Pass/fail count:")
print(Counts)
Percentage=(Counts/len(df)*100)
print(Percentage)


if abs(Percentage[1]-Percentage[0]<=10):
    print("Its balanced")
else:
    print("Dataset is imbalanced")

# ---------------------------------------------------------
# Question 5
# ---------------------------------------------------------
PassData = df[df["FinalResult"] == 1]
FailData = df[df["FinalResult"] == 0]

print("Average study hours of passed students:",PassData["StudyHours"].mean())
print("Average StudyHours of Failed Students :", FailData["StudyHours"].mean())

print("Average attendence of passed students:",PassData["Attendance"].mean())
print("Average attendence of Failed Students :", FailData["Attendance"].mean())


print("\nObservation:")
print("1. Students with higher StudyHours generally perform better.")
print("2. Students with higher Attendance have a greater chance of passing.")
print("3. Low StudyHours and Attendance are common among failed students.")
print("4. Both factors positively influence FinalResult.")


# ---------------------------------------------------------
# Plot histogram
# ---------------------------------------------------------
plt.figure(figsize=(7,5))
plt.hist(df["StudyHours"], bins=10, edgecolor="black")
plt.title("Histogram of StudyHours")
plt.xlabel("StudyHours")
plt.ylabel("Number of Students")
plt.grid(True)
plt.show()

print("Observation:")
print("Histogram shows how StudyHours are distributed among students.")

# ---------------------------------------------------------
#   Scatter plot
# ---------------------------------------------------------

Passed = df[df["FinalResult"] == 1]
Failed = df[df["FinalResult"] == 0]

plt.figure(figsize=(7,5))

plt.scatter(Passed["StudyHours"],
            Passed["PreviousScore"],
            color="green",
            label="Pass")

plt.scatter(Failed["StudyHours"],
            Failed["PreviousScore"],
            color="red",
            label="Fail")

plt.title("StudyHours vs PreviousScore")
plt.xlabel("StudyHours")
plt.ylabel("PreviousScore")
plt.legend()
plt.grid(True)
plt.show()


# ---------------------------------------------------------
# Boxplot
# ---------------------------------------------------------

plt.figure(figsize=(6,5))
plt.boxplot(df["Attendance"])
plt.title("Attendance Boxplot")
plt.ylabel("Attendance")
plt.grid(True)
plt.show()

Q1 = df["Attendance"].quantile(0.25)
Q3 = df["Attendance"].quantile(0.75)
IQR = Q3 - Q1

Lower = Q1 - 1.5 * IQR
Upper = Q3 + 1.5 * IQR

Outliers = df[(df["Attendance"] < Lower) | (df["Attendance"] > Upper)]

print("Number of Outliers :", len(Outliers))


# ---------------------------------------------------------
# Question 9
# ---------------------------------------------------------

print("\n" + "=" * 60)
print("QUESTION 9")
print("=" * 60)

plt.figure(figsize=(7,5))

plt.scatter(df["AssignmentsCompleted"],
            df["FinalResult"])

plt.title("AssignmentsCompleted vs FinalResult")
plt.xlabel("AssignmentsCompleted")
plt.ylabel("FinalResult")
plt.grid(True)
plt.show()

print("Observation:")
print("Students completing more assignments generally have better FinalResult.")

# ---------------------------------------------------------
# Question 10
# ---------------------------------------------------------

print("\n" + "=" * 60)
print("QUESTION 10")
print("=" * 60)

plt.figure(figsize=(7,5))

plt.scatter(df["SleepHours"],
            df["FinalResult"])

plt.title("SleepHours vs FinalResult")
plt.xlabel("SleepHours")
plt.ylabel("FinalResult")
plt.grid(True)
plt.show()

print("Observation:")
print("Adequate sleep is beneficial,")
print("but sleeping more alone does not guarantee success.")
print("StudyHours, Attendance, and Assignments also affect performance.")