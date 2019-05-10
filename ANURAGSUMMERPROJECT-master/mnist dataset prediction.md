

```python
import numpy as np
import pandas as pd
import matplotlib.pyplot as pt
from sklearn.tree import DecisionTreeClassifier
#importing required modules as required names
```


```python
data=pd.read_csv("C:/Users/Acer/train.csv").as_matrix()#importing the data in form of matrix(2D)
#@each index there is a matrix m with m[0]=label and then next 784 pixel values
```

    C:\Users\Acer\Anaconda3\lib\site-packages\ipykernel_launcher.py:1: FutureWarning: Method .as_matrix will be removed in a future version. Use .values instead.
      """Entry point for launching an IPython kernel.
    


```python
xtrain=data[0:25000,1:]#Training the data"pixels" along with corresponding label.
xlabel=data[0:25000,0]##data[the total index slicing for training values,index slicing req"0"-for label,1:end-pixel values]
```


```python
clf=DecisionTreeClassifier()#called DTC earlier. We are going to use DTC for classification
```


```python
xtest=data[25000:,1:]#we took first 25000 data for training we take the rest for testing
actuallabel=data[25000:,0]
```


```python
clf.fit(xtrain,xlabel)#training
```




    DecisionTreeClassifier(class_weight=None, criterion='gini', max_depth=None,
                max_features=None, max_leaf_nodes=None,
                min_impurity_decrease=0.0, min_impurity_split=None,
                min_samples_leaf=1, min_samples_split=2,
                min_weight_fraction_leaf=0.0, presort=False, random_state=None,
                splitter='best')




```python
n=int(input())#entering user input for testing a random dataset
print("ACTUAL VALUE :",actuallabel[n])#showing actual value of the dataset
```

    2
    ACTUAL VALUE : 5
    


```python
k=clf.predict([xtest[n]])#predicting and saving the value in  a variable
```


```python
d=xtest[n]#tsaving the req datmatrix "containig 784 pixel" in a variable
d.shape=(28,28)#shaping the matrix for getting 28*28 shaped matrix for plotting pixel values "i.e making a 2d array"
```


```python
f=pt.imshow(d,cmap="gray")#plotting the image @ grayscale
print("Predicted value :",k)#showing predicted value
```

    Predicted value : [5]
    


![png](output_9_1.png)



```python
t=clf.score(xtest,actuallabel)#calculating accuracy
```


```python
print("Accuracy :",t*100,"%")#showing accuracy
```

    Accuracy : 84.19411764705882 %
    


```python

```
