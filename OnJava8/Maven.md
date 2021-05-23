# Maven教程

## Maven功能
- 构建
- 文档生成
- 报告
- 依赖
- SCMs
- 发布
- 分发
- 邮件列表

## 约定配置
Maven 提倡使用一个共同的标准目录结构，Maven 使用约定优于配置的原则，大家尽可能的遵守这样的目录结构。如下所示：

|              目录            |                     目的                       |
|:----------------------------:|:----------------------------------------------:|
|${basedir}                    | 存放pom.xml和所有的子目录|
|${basedir}/src/main/java      |项目的java源代码|
|${basedir}/src/main/resources | 项目的资源，比如说property文件，springmvc.xml|
|${basedir}/src/test/java      | 项目的测试类，比如说Junit代码|
|${basedir}/src/test/resources | 测试用的资源|
|${basedir}/src/main/webapp/WEB-INF|  web应用文件目录，web项目的信息，比如存放web、xml、本地图片、jsp视图页面|
|${basedir}/target             | 打包输出目录|
|${basedir}/target/classes     | 编译输出目录|
|${basedir}/target/test-classes| 测试编译输出目录|
|Test.java                     | Maven只会自动运行符合该命名规则的测试类|
|~/.m2/repository              |Maven默认的本地仓库目录位置|

# Maven 特点
- 项目设置遵循统一的规则。
- 任意工程中共享。
- 依赖管理包括自动更新。
- 一个庞大且不断增长的库。
- 可扩展，能够轻松编写 Java 或脚本语言的插件。
- 只需很少或不需要额外配置即可即时访问新功能。
- 基于模型的构建 − Maven能够将任意数量的项目构建到预定义的输出类型中，如 JAR，WAR 或基于项目元数据的分发，而不需要在大多数情况下执行任何脚本。
- 项目信息的一致性站点 − 使用与构建过程相同的元数据，Maven 能够生成一个网站或PDF，包括您要添加的任何文档，并添加到关于项目开发状态的标准报告中。
- 发布管理和发布单独的输出 − Maven 将不需要额外的配置，就可以与源代码管理系统（如 Subversion 或 Git）集成，并可以基于某个标签管理项目的发布。它也可以将其发布到分发位置供其他项目使用。Maven 能够发布单独的输出，如 JAR，包含其他依赖和文档的归档，或者作为源代码发布。
- 向后兼容性 − 您可以很轻松的从旧版本 Maven 的多个模块移植到 Maven 3 中。
- 子项目使用父项目依赖时，正常情况子项目应该继承父项目依赖，无需使用版本号，
- 并行构建 − 编译的速度能普遍提高20 - 50 %。
- 更好的错误报告 − Maven 改进了错误报告，它为您提供了 Maven wiki 页面的链接，您可以点击链接查看错误的完整描述。

## Maven POM
POM( Project Object Model，项目对象模型 ) 是 Maven 工程的基本工作单元，是一个XML文件，包含了项目的基本信息，用于描述项目如何构建，声明项目依赖，等等。
执行任务或目标时，Maven 会在当前目录中查找 POM。它读取 POM，获取所需的配置信息，然后执行目标。
> POM 中可以指定以下配置：

- 项目依赖
- 插件
- 执行目标
- 项目构建 profile
- 项目版本
- 项目开发者列表
- 相关邮件列表信息