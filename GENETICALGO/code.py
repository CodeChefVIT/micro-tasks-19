'''Tpot consists of the built in gentic algorithm pipeline which selects the 
model and also the features for the given dataset and target column'''
from tpot import TPOTClassifier

#pandas for reading the csv file
import pandas as pd 

#Numpy for converting the column vector into an array
import numpy as np

#used in jupyter notebook for getting the data from directory
import os


#reading the data in csv format
train = pd.read_csv(r"california_housing_train.csv")
test = pd.read_csv(r"california_housing_test.csv")

#Splitting the dataset into X,Y train and test

Y_train = train[["median_house_value"]]
X_train = train.drop("median_house_value",axis=1,inplace=False)

Y_test = test[["median_house_value"]]
X_test = test.drop("median_house_value",axis=1,inplace=False)

#Creating a object of TpotClassifier which runs genetic algo for 5 generations
# and then stops

tpot = TPOTClassifier(generations=5,verbosity=2)

#Creating the model and printing the score

tpot.fit(X_train,np.ravel(Y_train))

print(tpot.score(X_test,np.ravel(Y_test)))

