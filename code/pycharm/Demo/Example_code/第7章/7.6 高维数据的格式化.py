# -*- coding: utf-8 -*-
# @Time : 2020/7/9 5:31
# @Author : MYH
# @File : 7.6 高维数据的格式化.py
# @Software: PyCharm

# 高维数据能展示数据之间的更为复杂的组织关系,采用的还是基础的键值对二维关系:键值对 通常采用XML格式或者JSON格式进行存储
# 当多键值对时json格式有一些约定: 数据保存在键值对中 键值对之间使用逗号进行分割 大括号表示用于保存键值对组成的对象 方括号表示保存键值对组成的数组
# json格式更加灵活且数据量更少 建议使用