# QingYuan PaaS for Java

soft-primitive 即：“轻”，“元”

## Prerequisites

Oracle Java (>= jdk1.7.0_21, succeeded compiled under MacOS) or 

OpenJDK (>= 1.8.0_91, succeeded tested under Linux Fedora 23)

Apache Maven (>= 3.3.3)

## Examples

For example:

    [vagrant@localhost soft-primitive-caas]$ java -jar qingyuanos-caas-openshift-client/target/qingyuanos-caas-openshift-client-0.0.1-SNAPSHOT.jar

Demo is using HTTP/2, for HTTPS/2:

    [vagrant@localhost soft-primitive-caas]$ java -Xbootclasspath/p:/home/vagrant/.m2/repository/org/mortbay/jetty/alpn/alpn-boot/8.1.7.v20160121/alpn-boot-8.1.7.v20160121.jar  -jar qingyuanos-caas-openshift-client/target/qingyuanos-caas-openshift-client-0.0.1-SNAPSHOT.jar

More detail, please reference

## References

[gRPC Basics: Java](http://www.grpc.io/docs/tutorials/basic/java.html)

[gRPC Javadoc](http://www.grpc.io/grpc-java/javadoc/io/grpc/stub/package-summary.html)

[Google Protobuf Javadoc](https://developers.google.com/protocol-buffers/docs/reference/java/com/google/protobuf/package-summary)

[Google Protobuf](https://github.com/google/protobuf) Java generated tool:

review sub-directory of `java`

[gRPC](https://github.com/grpc/grpc-java) TCP or HTTP/2 framework

[gRPC Spring Boot Starter](https://github.com/LogNet/grpc-spring-boot-starter)
 
## Tips

### Generate Java POJO 

Currently the example message is from another Golang project

* Using Maven plugin

There have various plugins to generate Java contents from Protobuf message in Github, for example: [protobuf-maven-plugin](https://github.com/xolstice/protobuf-maven-plugin)

    [vagrant@localhost qingyuancloud-caas-sdk]$ mvn protobuf:compile -DprotocExecutable=/usr/local/bin/protoc -Dos.detected.classifier=linux-x86_64

* Directly generate from _protoc_ binary

Downlo appropriate bin version, or _make_ from [source](https://github.com/google/protobuf)

    [vagrant@localhost go-to-cloud-1]$ protoc --proto_path=/data/src/github.com/tangfeixiong/go-to-cloud-1/_proto --java_out=/data/src/github.com/tangfeixiong/go-to-cloud-1/_java_generated/openshift-project-and-build/src/main/java/ /data/src/github.com/tangfeixiong/go-to-cloud-1/_proto/paas/ci/openshift/manage_service.proto

note:

In my lab, it won't generate gRPC stub but only message

## Stuff

For Android client

`mvn dependency:get -Dartifact=io.grpc:grpc-okhttp:0.14.1`

For downloader MOJO

`mvn dependency:get -Dartifact=org.apache.maven.plugins:maven-downloader-plugin:1.0`

