### 第二章 Java 程序设计环境

    本章主要介绍如何安装Java开发工具箱（JDK)以及如何编译和运行各类型的程序
    
#### 2.1 安装Java 开发工具箱

    Oracle公司为Linux，Mac OS X, Solaris 和 Windows提供了Java开发工具箱（JDK) 的最新，最完整的版本。
    
##### 2.1.1 下载JDK
    
   访问[Oracle网站](http://www.oracle.com/technetwork/java/index.html)
    
##### 2.1.2 设置执行路径

   1. 在UNIX（包括Linux， Mac OS X 和 Solaris）环境下，编辑执行路径的过程与所使用的shell有关，
   在~/.bashrc或~/.bash_profile 文件的末尾就添加：
   export PATH=jdk/bin:$PATH
   
   2. 在Windows下，以管理员身份登录。在环境变量中添加jdk/bin 路径到Path下。
   
##### 2.1.5 导航Java目录

  
   |目录结构|描述|
   |-|-|
   |jdk|根目录|
   | ~bin|编译器和工具|
   | ~demo|演示|
   | ~docs|HTML格式的类库文档|
   | ~include|用于编译本地方法的文件|
   | ~jre|Java运行环境文件|
   | ~lib|类库文件|
   | ~src|类库源文件|
     
    
    
    
#### 2.2 选择开发环境

    过去推荐使用文本编辑器编写简单的程序，如：Emacs，JEdit，现在不再这样推荐了，因为集成开发环境
    非常快捷，方便。应当了解如何使用基本的JDK工具，这样才会感觉使用集成开发环境是一种享受。
    
#### 2.3 使用命令行工具
    javac ***.java
    java ***

#### 2.4 使用集成开发环境

    Eclipse， NetBase， Idea
    
#### 2.5 运行图像化应用程序
    
    demo：ImageViewer
    
    本书第7章到第9章介绍编写图像化应用程序的内容。
    
#### 2.6 建立并运行applet

    applet查看器没有能力发送邮件有显示一个网页，