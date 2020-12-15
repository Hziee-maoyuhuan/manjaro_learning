file = open("table.txt")  # 打开文件
text = file.readline()  # 排除第一行干扰

while True:  # 进行循环判断
	text = file.readline()  # 只读取一行内容
	if not text:  # 判断是否读取到内容
		break
	index = int(text.split("\t")[0])
	score = int(text.split("\t")[2])
	price = int(text.split("\t")[3])


	print("A:{}\nB:{}\nC:{}".format(index, score, price))  # 输出结果
