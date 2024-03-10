# This is a sample Python script.

# Press Shift+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.
import pandas as pd

def read_csv():
    file_path = 'Employees.csv'

    df = pd.read_csv(file_path)
    df_no_duplicates = df.drop_duplicates()
    df_no_duplicates['Age'] = df_no_duplicates['Age'].astype(int)
    usdToDollar = 49.35
    df_no_duplicates['Salary(EGP)'] = df_no_duplicates['Salary(USD)'] * usdToDollar
    print(df_no_duplicates)
    print("Average Age :",df_no_duplicates['Age'].mean())
    print("Average Salaries in USD :", df_no_duplicates['Salary(USD)'].median())
    print("Average Salaries in EGP :", df_no_duplicates['Salary(EGP)'].median())
    gender_count= df_no_duplicates['Gender'].value_counts()
    gender_ratio = gender_count / gender_count.sum()
    print(gender_ratio)
    file_path = 'output.csv'
    df_no_duplicates.to_csv(file_path, index=False)

# Press the green button in the gutter to run the script.
if __name__ == '__main__':
    read_csv()

# See PyCharm help at https://www.jetbrains.com/help/pycharm/
