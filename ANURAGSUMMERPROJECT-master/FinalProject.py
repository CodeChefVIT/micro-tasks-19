#!/usr/bin/env python
# coding: utf-8

# In[4]:


import pandas as pd #importing pandas in order to read csv file


# In[5]:


data=pd.read_csv("C:/Users/Acer/Downloads/iris.csv")# storing the csv file components in data variable


# In[6]:


print(data) #checking the data optional


# In[7]:


x=data[["Id","SepalLengthCm","SepalWidthCm","PetalLengthCm","PetalWidthCm"]]#setting values for x i.e the features of the flower


# In[8]:


y=data["Species"]#setting the corresponding species for the above data


# In[9]:


from sklearn.model_selection import train_test_split#importing model selection for spliting data randomly into 70% training dataset and 30% testing


# In[10]:


x_train,x_test,y_train,y_test=train_test_split(x,y,test_size=0.3) 


# In[11]:


from sklearn.tree import DecisionTreeClassifier#importing DecisionTree Classifier algorithm
c1=DecisionTreeClassifier()
c1.fit(x_train,y_train)#training the datasets for the algorithm


# In[12]:


l1=[]#we store the accuracy scores
l2=[]#stores corresponding classifier name in shorthand
l1.append(c1.score(x_test,y_test))
l2.append("DTC")


# In[13]:


from sklearn.naive_bayes import MultinomialNB#importing 2nd classifier algo


# In[14]:


c2=MultinomialNB()#training using NB algo
c2.fit(x_train,y_train)


# In[15]:


l1.append(c2.score(x_test,y_test))
l2.append("NB")


# In[16]:


from sklearn.neighbors import KNeighborsClassifier


# In[17]:


c3=KNeighborsClassifier()


# In[18]:


c3.fit(x_train,y_train)


# In[ ]:





# In[19]:


l1.append(c3.score(x_test,y_test))
l2.append("KNN")


# In[20]:


from sklearn.svm import SVC
c4=SVC()
c4.fit(x_train,y_train)


# In[21]:


l1.append(c4.score(x_test,y_test))
l2.append("SVM")


# In[22]:


import matplotlib.pyplot as pt#after storing the accuracy in l1 and corresponding classifier in l2 we have to plot performance of each algo using bar graph
get_ipython().run_line_magic('matplotlib', 'inline')


# In[23]:


r=[1,2,3,4]#apparently the bar positions


# In[24]:


j=[]
for i in l1:
    j.append(i)
for i in range(len(j)):
    f=round(j[i],4)
    j[i]=f
for i in range(len(j)):
    j[i]=j[i]*100
    k=str(j[i])+"%"
    j[i]=k


# In[25]:


b=pt.bar(r,l1,color=["red","blue","green","orange"],width=0.3)
pt.xticks(r,l2,fontsize=12)
pt.ylim(0,1.1)
for i in range(len(r)):
    pt.text(x=r[i]-0.2,y=l1[i]+0.01,s=j[i],color="purple")
pt.show()
print("\033[1;31;47mLEGEND \n")
print("\033[0;32;47mDTC : Decision Tree Classifier\nNB : Naive Bayes\nKNN : K Nearest Neighbor Classfier\nSVM : Support Vector Machine")


# In[ ]:




