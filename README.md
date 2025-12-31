# spring6-mybatis

## やりたいこと
- `SpringBoot`を使わずに、`SpringFramework`を使って開発する。  
- 極力、設定ファイルは使わず、`Config`クラスを使用する。
- データベースは組み込み`H2`データベース
- APサーバは組み込み`Jetty`サーバ
- `flyway`を使ってDBスキーマ、DBデータのセットアップ

## 前提環境

以下がインストール済みであること
* JDK 21
  * `JAVA_HOME`を環境変数に設定すること
* GitBash

> [!TIP]
> Java環境構築(Windows版)　JDKインストール  
> https://www.techfun.co.jp/services/magazine/java/windows-jdk-install.html  
> 
> Java環境構築(Windows版)　パスの設定  
> https://www.techfun.co.jp/services/magazine/java/windows-jdk-pathset.html  
> 
> Git Bashって使ってる？Windowsで動く意外にすごい便利ツール  
> https://www.sejuku.net/blog/72673  

## 使用するフレームワーク

* spring-web 6.2
* spring-webmvn 6.2
* spring-jdbc 6.2
* thymeleaf-spring6
* hibernate-validator
* jakarta.validation-api
* mybatis
* mybatis-spring
* logback-classic
* lombok
* flyway-core
* 組み込みh2データベース
* 組み込みJettyサーバ
* 組み込みMaven 3

## 準備 githubからソースコードを取得

gitを使ってソースコードをダウンロードする
```
コマンドプロンプトで実行
git clone https://github.com/namickey/spring6-mybatis.git
cd spring6-mybatis
```

## 実行 jetty:run

起動する
```
コマンドプロンプトで実行
mvnw.cmd jetty:run
```

## ブラウザアクセス
http://localhost:8080/

## 停止
```
起動中のコマンドプロンプトで、以下を実行
Ctrl + C
```
