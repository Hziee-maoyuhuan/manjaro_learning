file = open("score.txt")  # 打开文件
text = file.readline()  # 排除第一行干扰
a = b = c = d = e = 0  # 初始化五个参数 代表五个分段

while True:  # 进行循环判断
	text = file.readline()  # 只读取一行内容
	if not text:  # 判断是否读取到内容
		break
	# print(text, end="")  # 进行测试
	score = int(text.split("\t")[1].split("\n")[0])  # 获取到对应行的分数

	# 对取出的成绩进行判断 归属到某一个分组
	if score >= 90:
		a += 1
	elif score >= 80:
		b += 1
	elif score >= 70:
		c += 1
	elif score >= 60:
		d += 1
	else:
		e += 1

print("A:{}\nB:{}\nC:{}\nD:{}\nE:{}\n".format(a, b, c, d, e))  # 输出结果
