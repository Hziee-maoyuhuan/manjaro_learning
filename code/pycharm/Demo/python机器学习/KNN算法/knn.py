# 使用鸢尾花数据集
# 列名分别为 id 花卉长度 花卉宽度 花瓣长度 花瓣宽度 花种类

import numpy as np
import pandas as pd

'''

data = pd.read_csv('dataset/iris.arff.csv', header=0)  # 加载数据源(一个csv文件) header指定标题行 默认为0(首行) 无则为None
data1 = pd.read_csv('dataset/iris.arff.csv', header=0)  # 加载数据源(一个csv文件) header指定标题行 默认为0(首行) 无则为None

# 输出示例
print(data)  # 打印数据集,进行查看
print(data.head(7))  # 打印前几行数据 默认为5 可以调整 显示末尾几行使用tail函数 默认为5
print(data.sample(2))  # 随机抽样本进行展示 默认为1 可以调整

# 对列操作
data["class"] = data['class'].map({"Iris-setosa": 0, "Iris-versicolor": 1, "Iris-virginica": 2})  # 实现文本到数值的映射
print(data)
# 删除不需要的列 (class列为例)
# 默认删除的是行(axis=0),即删除行 现在改为删除列则需要改成1 副本操作,不会影响到原数据 给一个新的数据集赋值 也可以使用inplace属性就地修改
data.drop("class", axis=1, inplace=True)
print(data)

# 对行操作
print("数据集长度:" + str(len(data)))  # 查看行数
print(data.duplicated())  # 数据集中判断重复
print(data.duplicated().any())  # any 只要有True则为True
# data.drop_duplicates(inplace=True)  # 删除重复记录 默认在副本上操作,同样可以加inplace属性在原数据集上操作
print(data1["class"].value_counts())  # 查看各个类型的花有多少朵

'''


class KNN:
	'''使用Python语言实现KNN(k邻近算法)'''

	def __init__(self, k):
		''' 初始化方法 parameter: k->邻居个数'''
		self.k = k  # 将k赋值到当前对象的k

	def fit(self, X, y):  # 矩阵大写表示 向量小写表示 通常
		''' 训练方法 parameter: X->类数组类型,形状(待训练的样本特征)为:{样本数量,特征数量} y->类数组类型,样本目标值(样本数量) '''
		self.X = np.asarray(X)  # 将X转换成npArray
		self.y = np.asarray(y)

	def prefix(self, X):
		''' 根据传入参数(样本), 对样本将诶过进行预测 parameter:X->类数组类型,形状(待训练的样本特征)为:{样本数量,特征数量} 返回预测结果(result) '''
		X = np.asarray(X)
		result = []  # 先定义一个列表 返回结果为加入值后的数组
		for x in X:  # 每次取出数组中的一行数据(一个样本)
			a = np.sqrt(np.sum((x - self.X) ** 2, axis=1))  # 数组减法是对数组中对应元素的减法 这里使用广播方式 单行减多行本身不可以但是单行进行扩展后就可以计算 进行距离运算
			print(a)