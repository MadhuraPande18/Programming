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
