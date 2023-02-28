# Git

版本管理 分布式

SVN 集中式版本管理

* 中心化缺点
  * 所有的信息都集中在一个服务器里
  * 恶意篡改
  * 丢失
  * 。。。

Git去中心化

* 每人都有一个完整的版本库
* 没有中央服务器 

Push上传 推

Pull 拉取  拉      （Fetch+Merge）获取 合并



创建版本库

```git
git init
```

HEAD文件指向主版本库

git add 放到暂存区

git commit 上转到本地主分支

git push 上传到远程仓库

git log    查看提交日志

git diff  比较提交前后同一个文件差异         

 git remote add origin https://github.com/GithGZ/GMS.git         获取连接            

git push -u origin master   推

git clone 克隆

