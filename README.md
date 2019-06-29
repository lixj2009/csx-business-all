# csx-business-all
基于bsf之下的公共业务框架,所有公共业务的组件放这里

## 项目结构规范说明
```
csx-business-all
    -- csx-business-api (api常用协议定义,此处不准使用bsf框架)
    -- csx-business-core (业务公共的核心层)
    -- csx-business-dependencies (项目依赖pom定义)
    -- csx-business-starter （项目full-start包）
```

## 相关文档

## 编译说明
1. mvn install csx-business-dependencies
2. mvn install csx-business-all

## 版本升级/切换
```
备注: 格式:1.0.0-RELEASE (版本号+-+RELEASE/SNAPSHOT)
cd csx-business-dependencies
mvn versions:set -DgenerateBackupPoms=false
或
mvn versions:set -DgenerateBackupPoms=false -DnewVersion={version}
```
    
## 其他    
 

##### by 车江毅