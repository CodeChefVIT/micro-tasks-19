#!/usr/bin/env python
# coding: utf-8

# In[6]:


import numpy as np
import pandas as pd
import matplotlib.pyplot as pt
from sklearn.tree import DecisionTreeClassifier
#importing required modules as required names


# In[7]:


data=pd.read_csv("C:/Users/Acer/train.csv").as_matrix()#importing the data in form of matrix(2D)
#@each index there is a matrix m with m[0]=label and then next 784 pixel values


# In[8]:


xtrain=data[0:25000,1:]#Training the data"pixels" along with corresponding label.
xlabel=data[0:25000,0]##data[the total index slicing for training values,index slicing req"0"-for label,1:end-pixel values]


# In[9]:


clf=DecisionTreeClassifier()#called DTC earlier. We are going to use DTC for classification


# In[10]:


xtest=data[25000:,1:]#we took first 25000 data for training we take the rest for testing
actuallabel=data[25000:,0]


# In[11]:


clf.fit(xtrain,xlabel)#training


# In[12]:


n=int(input())#entering user input for testing a random dataset
print("ACTUAL VALUE :",actuallabel[n])#showing actual value of the dataset


# In[13]:


k=clf.predict([xtest[n]])#predicting and saving the value in  a variable


# In[14]:


d=xtest[n]#tsaving the req datmatrix "containig 784 pixel" in a variable
d.shape=(28,28)#shaping the matrix for getting 28*28 shaped matrix for plotting pixel values "i.e making a 2d array"


# In[15]:


f=pt.imshow(d,cmap="gray")#plotting the image @ grayscale
print("Predicted value :",k)#showing predicted value


# In[17]:


t=clf.score(xtest,actuallabel)#calculating accuracy


# In[18]:


print("Accuracy :",t*100,"%")#showing accuracy


# In[ ]:




