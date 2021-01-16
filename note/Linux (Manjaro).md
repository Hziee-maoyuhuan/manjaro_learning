# Linux (Manjaro) 

- 设置镜像源

	> sudo pacman-mirrors -i -c China -m rank
	>
	> 会弹出一个选择源的窗口

- 更新本地数据包

	> sudo pacman -Syy

- 终端字体间隔过宽

	> sudo pacman -S wqy-bitmapfont
	> sudo pacman -S wqy-zenhei

- 排列源

	> sudo pacman-mirrors -g
	>
	> 添加源 参考: https://www.jianshu.com/p/966017a6f251

- 导入GPG  key

	> sudo pacman -Syy && sudo pacman -S archlinuxcn-keyring

- 安装输入法

	> sudo pacman -S fcitx-im   (#默认全部安装)
	>
	> sudo pacman -S fcitx-configtool
	>
	> sudo pacman -S fcitx-sogoupinyin (#安装搜狗拼音)

- 双系统时间不统一

	> 1. 修改Linux方案：
	> 	timedatectl set-local-rtc 1 --adjust-system-clock
	> 	timedatectl set-ntp 0
	>
	> 2. 修改Windows方案：
	> 	[HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Control\TimeZoneInformation]
	> 	   "RealTimeIsUniversal"=dword:00000001
	>
	> sudo timedatectl set-local-rtc true

- ll

- ll

- ll