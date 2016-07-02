# QingYuan PaaS for Java

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

[Google Protobuf javadoc](https://developers.google.com/protocol-buffers/docs/reference/java/com/google/protobuf/package-summary)

[Google Protobuf](https://github.com/google/protobuf) Java generated tool:

review sub-directory of `java`

[Google RPC](https://github.com/grpc/grpc-java) TCP or HTTP/2 framework

 
## Tips

Build for Android client

`mvn dependency:get -Dartifact=io.grpc:grpc-okhttp:0.14.1`

MOJO for downloading OS-Specified protoc binary

`mvn dependency:get -Dartifact=org.apache.maven.plugins:maven-downloader-plugin:1.0`

