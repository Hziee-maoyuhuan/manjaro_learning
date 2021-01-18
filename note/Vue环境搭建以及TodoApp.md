# 搭建Vue开发环境并编写TodoApp

## 搭建Vue开发环境

1. 将淘宝镜像源加入 安装cnpm (使用sudo以防止写入错误,下同)

	> sudo npm install -g cnpm --registry=https://registry.npm.taobao.org

2. 使用cnpm命令安装Vue

	> sudo cnpm install -g @vue/cli

3. 切换到目录下并新建vue工程 todo-app(版本选择Vue3)

	> cd [FileName]
	>
	> vue create todo-app 
	
4.  [了解] 使用vue图形化界面进行项目管理 (没有的话可以导入)

	> vue ui

5.  启动服务器并查看Demo原本的样子(使用浏览器访问)

	> yarn serve 或者 npm run serve

## 编写TodoApp