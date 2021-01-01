import sys

'''
	第二章 数据类型
	数值类型: 整数 浮点 负数
	布尔类型: 整数的子类型
	序列类型: 列表 字符串 元组 字节
	映射类型: 字典
	集合类型: 集合
'''

# 数值类型
# 整数类型int python2区分为整形和长整形,python3不区分 整形最大值取决于操作系统
a = -80
print(type(a))  # 整数类型
print(sys.maxsize)  # 打印当前电脑能输出的最大值 2**63

# 数值进制 二进制/八进制/十进制/十六进制  默认是十进制
num = 0b10  # 二进制前缀为0b或者0B
print(num)
print(type(num))
num = 0o10  # 八进制前缀为0o或者0O
print(num)
print(type(num))
num = 0x10  # 十六进制前缀为0x或者0X
print(num)
print(type(num))
