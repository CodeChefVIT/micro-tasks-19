

```python
import pandas as pd #importing pandas in order to read csv file
```


```python
data=pd.read_csv("C:/Users/Acer/Downloads/iris.csv")# storing the csv file components in data variable
```


```python
print(data) #checking the data optional
```

          Id  SepalLengthCm  SepalWidthCm  PetalLengthCm  PetalWidthCm  \
    0      1            5.1           3.5            1.4           0.2   
    1      2            4.9           3.0            1.4           0.2   
    2      3            4.7           3.2            1.3           0.2   
    3      4            4.6           3.1            1.5           0.2   
    4      5            5.0           3.6            1.4           0.2   
    5      6            5.4           3.9            1.7           0.4   
    6      7            4.6           3.4            1.4           0.3   
    7      8            5.0           3.4            1.5           0.2   
    8      9            4.4           2.9            1.4           0.2   
    9     10            4.9           3.1            1.5           0.1   
    10    11            5.4           3.7            1.5           0.2   
    11    12            4.8           3.4            1.6           0.2   
    12    13            4.8           3.0            1.4           0.1   
    13    14            4.3           3.0            1.1           0.1   
    14    15            5.8           4.0            1.2           0.2   
    15    16            5.7           4.4            1.5           0.4   
    16    17            5.4           3.9            1.3           0.4   
    17    18            5.1           3.5            1.4           0.3   
    18    19            5.7           3.8            1.7           0.3   
    19    20            5.1           3.8            1.5           0.3   
    20    21            5.4           3.4            1.7           0.2   
    21    22            5.1           3.7            1.5           0.4   
    22    23            4.6           3.6            1.0           0.2   
    23    24            5.1           3.3            1.7           0.5   
    24    25            4.8           3.4            1.9           0.2   
    25    26            5.0           3.0            1.6           0.2   
    26    27            5.0           3.4            1.6           0.4   
    27    28            5.2           3.5            1.5           0.2   
    28    29            5.2           3.4            1.4           0.2   
    29    30            4.7           3.2            1.6           0.2   
    ..   ...            ...           ...            ...           ...   
    120  121            6.9           3.2            5.7           2.3   
    121  122            5.6           2.8            4.9           2.0   
    122  123            7.7           2.8            6.7           2.0   
    123  124            6.3           2.7            4.9           1.8   
    124  125            6.7           3.3            5.7           2.1   
    125  126            7.2           3.2            6.0           1.8   
    126  127            6.2           2.8            4.8           1.8   
    127  128            6.1           3.0            4.9           1.8   
    128  129            6.4           2.8            5.6           2.1   
    129  130            7.2           3.0            5.8           1.6   
    130  131            7.4           2.8            6.1           1.9   
    131  132            7.9           3.8            6.4           2.0   
    132  133            6.4           2.8            5.6           2.2   
    133  134            6.3           2.8            5.1           1.5   
    134  135            6.1           2.6            5.6           1.4   
    135  136            7.7           3.0            6.1           2.3   
    136  137            6.3           3.4            5.6           2.4   
    137  138            6.4           3.1            5.5           1.8   
    138  139            6.0           3.0            4.8           1.8   
    139  140            6.9           3.1            5.4           2.1   
    140  141            6.7           3.1            5.6           2.4   
    141  142            6.9           3.1            5.1           2.3   
    142  143            5.8           2.7            5.1           1.9   
    143  144            6.8           3.2            5.9           2.3   
    144  145            6.7           3.3            5.7           2.5   
    145  146            6.7           3.0            5.2           2.3   
    146  147            6.3           2.5            5.0           1.9   
    147  148            6.5           3.0            5.2           2.0   
    148  149            6.2           3.4            5.4           2.3   
    149  150            5.9           3.0            5.1           1.8   
    
                Species  
    0       Iris-setosa  
    1       Iris-setosa  
    2       Iris-setosa  
    3       Iris-setosa  
    4       Iris-setosa  
    5       Iris-setosa  
    6       Iris-setosa  
    7       Iris-setosa  
    8       Iris-setosa  
    9       Iris-setosa  
    10      Iris-setosa  
    11      Iris-setosa  
    12      Iris-setosa  
    13      Iris-setosa  
    14      Iris-setosa  
    15      Iris-setosa  
    16      Iris-setosa  
    17      Iris-setosa  
    18      Iris-setosa  
    19      Iris-setosa  
    20      Iris-setosa  
    21      Iris-setosa  
    22      Iris-setosa  
    23      Iris-setosa  
    24      Iris-setosa  
    25      Iris-setosa  
    26      Iris-setosa  
    27      Iris-setosa  
    28      Iris-setosa  
    29      Iris-setosa  
    ..              ...  
    120  Iris-virginica  
    121  Iris-virginica  
    122  Iris-virginica  
    123  Iris-virginica  
    124  Iris-virginica  
    125  Iris-virginica  
    126  Iris-virginica  
    127  Iris-virginica  
    128  Iris-virginica  
    129  Iris-virginica  
    130  Iris-virginica  
    131  Iris-virginica  
    132  Iris-virginica  
    133  Iris-virginica  
    134  Iris-virginica  
    135  Iris-virginica  
    136  Iris-virginica  
    137  Iris-virginica  
    138  Iris-virginica  
    139  Iris-virginica  
    140  Iris-virginica  
    141  Iris-virginica  
    142  Iris-virginica  
    143  Iris-virginica  
    144  Iris-virginica  
    145  Iris-virginica  
    146  Iris-virginica  
    147  Iris-virginica  
    148  Iris-virginica  
    149  Iris-virginica  
    
    [150 rows x 6 columns]
    


```python
x=data[["Id","SepalLengthCm","SepalWidthCm","PetalLengthCm","PetalWidthCm"]]#setting values for x i.e the features of the flower
```


```python
y=data["Species"]#setting the corresponding species for the above data
```


```python
from sklearn.model_selection import train_test_split#importing model selection for spliting data randomly into 70% training dataset and 30% testing
```


```python
x_train,x_test,y_train,y_test=train_test_split(x,y,test_size=0.3) 
```


```python
from sklearn.tree import DecisionTreeClassifier#importing DecisionTree Classifier algorithm
c1=DecisionTreeClassifier()
c1.fit(x_train,y_train)#training the datasets for the algorithm
```




    DecisionTreeClassifier(class_weight=None, criterion='gini', max_depth=None,
                max_features=None, max_leaf_nodes=None,
                min_impurity_decrease=0.0, min_impurity_split=None,
                min_samples_leaf=1, min_samples_split=2,
                min_weight_fraction_leaf=0.0, presort=False, random_state=None,
                splitter='best')




```python
l1=[]#we store the accuracy scores
l2=[]#stores corresponding classifier name in shorthand
l1.append(c1.score(x_test,y_test))
l2.append("DTC")
```


```python
from sklearn.naive_bayes import MultinomialNB#importing 2nd classifier algo
```


```python
c2=MultinomialNB()#training using NB algo
c2.fit(x_train,y_train)
```




    MultinomialNB(alpha=1.0, class_prior=None, fit_prior=True)




```python
l1.append(c2.score(x_test,y_test))
l2.append("NB")
```


```python
from sklearn.neighbors import KNeighborsClassifier
```


```python
c3=KNeighborsClassifier()
```


```python
c3.fit(x_train,y_train)

```




    KNeighborsClassifier(algorithm='auto', leaf_size=30, metric='minkowski',
               metric_params=None, n_jobs=None, n_neighbors=5, p=2,
               weights='uniform')




```python

```


```python
l1.append(c3.score(x_test,y_test))
l2.append("KNN")
```


```python
from sklearn.svm import SVC
c4=SVC()
c4.fit(x_train,y_train)
```

    C:\Users\Acer\Anaconda3\lib\site-packages\sklearn\svm\base.py:196: FutureWarning: The default value of gamma will change from 'auto' to 'scale' in version 0.22 to account better for unscaled features. Set gamma explicitly to 'auto' or 'scale' to avoid this warning.
      "avoid this warning.", FutureWarning)
    




    SVC(C=1.0, cache_size=200, class_weight=None, coef0=0.0,
      decision_function_shape='ovr', degree=3, gamma='auto_deprecated',
      kernel='rbf', max_iter=-1, probability=False, random_state=None,
      shrinking=True, tol=0.001, verbose=False)




```python
l1.append(c4.score(x_test,y_test))
l2.append("SVM")
```


```python
import matplotlib.pyplot as pt#after storing the accuracy in l1 and corresponding classifier in l2 we have to plot performance of each algo using bar graph
%matplotlib inline
```


```python
r=[1,2,3,4]#apparently the bar positions
```


```python
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

```


```python
b=pt.bar(r,l1,color=["red","blue","green","orange"],width=0.3)
pt.xticks(r,l2,fontsize=12)
pt.ylim(0,1.1)
for i in range(len(r)):
    pt.text(x=r[i]-0.2,y=l1[i]+0.01,s=j[i],color="purple")
pt.show()
print("\033[1;31;47mLEGEND \n")
print("\033[0;32;47mDTC : Decision Tree Classifier\nNB : Naive Bayes\nKNN : K Nearest Neighbor Classfier\nSVM : Support Vector Machine")
```


![png](output_22_0.png)


    [1;31;47mLEGEND 
    
    [0;32;47mDTC : Decision Tree Classifier
    NB : Naive Bayes
    KNN : K Nearest Neighbor Classfier
    SVM : Support Vector Machine
    


```python

```
