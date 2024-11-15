@rem
@rem Copyright 2015 the original author or authors.
@rem
@rem Licensed under the Apache License, Version 2.0 (the "License");
@rem you may not use this file except in compliance with the License.
@rem You may obtain a copy of the License at
@rem
@rem      https://www.apache.org/licenses/LICENSE-2.0
@rem
@rem Unless required by applicable law or agreed to in writing, software
@rem distributed under the License is distributed on an "AS IS" BASIS,
@rem WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@rem See the License for the specific language governing permissions and
@rem limitations under the License.
@rem

@if "%DEBUG%"=="" @echo off
@rem ##########################################################################
@rem
@rem  evm startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%"=="" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Resolve any "." and ".." in APP_HOME to make it shorter.
for %%i in ("%APP_HOME%") do set APP_HOME=%%~fi

@rem Add default JVM options here. You can also use JAVA_OPTS and EVM_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS="-Dsecp256k1.randomize=false"

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if %ERRORLEVEL% equ 0 goto execute

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto execute

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\lib\besu-evmtool-22.7.7.jar;%APP_HOME%\lib\besu-22.7.7.jar;%APP_HOME%\lib\besu-ethereum-ethstats-22.7.7.jar;%APP_HOME%\lib\besu-clique-22.7.7.jar;%APP_HOME%\lib\besu-ibftlegacy-22.7.7.jar;%APP_HOME%\lib\besu-ibft-22.7.7.jar;%APP_HOME%\lib\besu-qbft-22.7.7.jar;%APP_HOME%\lib\besu-consensus-common-22.7.7.jar;%APP_HOME%\lib\besu-retesteth-22.7.7.jar;%APP_HOME%\lib\besu-ethereum-stratum-22.7.7.jar;%APP_HOME%\lib\besu-api-22.7.7.jar;%APP_HOME%\lib\referencetests-22.7.7.jar;%APP_HOME%\lib\besu-merge-22.7.7.jar;%APP_HOME%\lib\besu-blockcreation-22.7.7.jar;%APP_HOME%\lib\besu-eth-22.7.7.jar;%APP_HOME%\lib\besu-permissioning-22.7.7.jar;%APP_HOME%\lib\besu-p2p-22.7.7.jar;%APP_HOME%\lib\besu-core-22.7.7.jar;%APP_HOME%\lib\core-support-test-22.7.7-test-support.jar;%APP_HOME%\lib\besu-config-22.7.7.jar;%APP_HOME%\lib\besu-evm-22.7.7.jar;%APP_HOME%\lib\besu-datatypes-22.7.7.jar;%APP_HOME%\lib\enclave-22.7.7.jar;%APP_HOME%\lib\besu-trie-22.7.7.jar;%APP_HOME%\lib\besu-crypto-22.7.7.jar;%APP_HOME%\lib\besu-plugin-rocksdb-22.7.7.jar;%APP_HOME%\lib\besu-metrics-rocksdb-22.7.7.jar;%APP_HOME%\lib\besu-pipeline-22.7.7.jar;%APP_HOME%\lib\besu-tasks-22.7.7.jar;%APP_HOME%\lib\besu-metrics-core-22.7.7.jar;%APP_HOME%\lib\besu-kvstore-22.7.7.jar;%APP_HOME%\lib\besu-util-22.7.7.jar;%APP_HOME%\lib\besu-pki-22.7.7.jar;%APP_HOME%\lib\besu-nat-22.7.7.jar;%APP_HOME%\lib\graphql-java-18.1.jar;%APP_HOME%\lib\log4j-slf4j-impl-2.17.2.jar;%APP_HOME%\lib\tuweni-dns-discovery-2.2.0.jar;%APP_HOME%\lib\dnsjava-3.5.1.jar;%APP_HOME%\lib\tuweni-devp2p-2.2.0.jar;%APP_HOME%\lib\client-java-15.0.1.jar;%APP_HOME%\lib\java-dataloader-3.1.2.jar;%APP_HOME%\lib\discovery-22.2.0.jar;%APP_HOME%\lib\core-4.9.4.jar;%APP_HOME%\lib\jose4j-0.7.11.jar;%APP_HOME%\lib\crypto-4.9.4.jar;%APP_HOME%\lib\Java-WebSocket-1.5.3.jar;%APP_HOME%\lib\slf4j-api-1.7.36.jar;%APP_HOME%\lib\besu-ethereum-rlp-22.7.7.jar;%APP_HOME%\lib\quorum-mainnet-launcher-1.0.1.jar;%APP_HOME%\lib\jackson-annotations-2.13.3.jar;%APP_HOME%\lib\vertx-web-4.2.7.jar;%APP_HOME%\lib\vertx-auth-jwt-4.2.7.jar;%APP_HOME%\lib\vertx-unit-4.2.7.jar;%APP_HOME%\lib\vertx-web-common-4.2.7.jar;%APP_HOME%\lib\vertx-auth-common-4.2.7.jar;%APP_HOME%\lib\vertx-bridge-common-4.2.7.jar;%APP_HOME%\lib\vertx-lang-kotlin-coroutines-4.1.2.jar;%APP_HOME%\lib\vertx-lang-kotlin-4.1.2.jar;%APP_HOME%\lib\vertx-core-4.2.7.jar;%APP_HOME%\lib\vertx-codegen-4.2.7.jar;%APP_HOME%\lib\jackson-datatype-jdk8-2.13.3.jar;%APP_HOME%\lib\jackson-core-2.13.3.jar;%APP_HOME%\lib\jackson-databind-2.13.3.jar;%APP_HOME%\lib\dagger-2.42.jar;%APP_HOME%\lib\plugin-api-22.7.7.jar;%APP_HOME%\lib\tuweni-net-2.2.0.jar;%APP_HOME%\lib\tuweni-merkle-trie-2.2.0.jar;%APP_HOME%\lib\tuweni-crypto-2.2.0.jar;%APP_HOME%\lib\tuweni-units-2.2.0.jar;%APP_HOME%\lib\tuweni-rlp-2.2.0.jar;%APP_HOME%\lib\tuweni-kv-2.2.0.jar;%APP_HOME%\lib\tuweni-bytes-2.2.0.jar;%APP_HOME%\lib\tuweni-config-2.2.0.jar;%APP_HOME%\lib\tuweni-concurrent-coroutines-2.2.0.jar;%APP_HOME%\lib\tuweni-concurrent-2.2.0.jar;%APP_HOME%\lib\jaeger-proto-0.7.0.jar;%APP_HOME%\lib\grpc-netty-1.47.0.jar;%APP_HOME%\lib\grpc-core-1.47.0.jar;%APP_HOME%\lib\tuweni-io-2.2.0.jar;%APP_HOME%\lib\grpc-protobuf-1.28.0.jar;%APP_HOME%\lib\opentelemetry-exporter-otlp-metrics-1.6.0-alpha.jar;%APP_HOME%\lib\opentelemetry-exporter-otlp-1.6.0.jar;%APP_HOME%\lib\opentelemetry-exporter-otlp-trace-1.6.0.jar;%APP_HOME%\lib\grpc-stub-1.47.0.jar;%APP_HOME%\lib\grpc-protobuf-lite-1.28.0.jar;%APP_HOME%\lib\grpc-api-1.47.0.jar;%APP_HOME%\lib\protobuf-java-util-3.11.4.jar;%APP_HOME%\lib\tuweni-kademlia-2.2.0.jar;%APP_HOME%\lib\kotlinx-coroutines-guava-1.5.2.jar;%APP_HOME%\lib\guava-31.1-jre.jar;%APP_HOME%\lib\picocli-4.6.3.jar;%APP_HOME%\lib\log4j-core-2.17.2.jar;%APP_HOME%\lib\client-java-api-15.0.1.jar;%APP_HOME%\lib\commons-lang3-3.12.0.jar;%APP_HOME%\lib\tuweni-toml-2.2.0.jar;%APP_HOME%\lib\spring-security-crypto-5.7.2.jar;%APP_HOME%\lib\snappy-java-1.1.8.4.jar;%APP_HOME%\lib\log4j-jul-2.17.2.jar;%APP_HOME%\lib\splunk-library-javalogging-1.11.5.jar;%APP_HOME%\lib\consoleui-0.0.13.jar;%APP_HOME%\lib\jansi-2.4.0.jar;%APP_HOME%\lib\bcpkix-jdk15on-1.70.jar;%APP_HOME%\lib\abi-4.9.4.jar;%APP_HOME%\lib\rlp-4.9.4.jar;%APP_HOME%\lib\utils-4.9.4.jar;%APP_HOME%\lib\bcutil-jdk15on-1.70.jar;%APP_HOME%\lib\bcprov-jdk15on-1.70.jar;%APP_HOME%\lib\secp256k1-0.6.1.jar;%APP_HOME%\lib\secp256r1-0.6.1.jar;%APP_HOME%\lib\blake2bf-0.6.1.jar;%APP_HOME%\lib\bls12-381-0.6.1.jar;%APP_HOME%\lib\jna-5.12.1.jar;%APP_HOME%\lib\log4j-api-2.17.2.jar;%APP_HOME%\lib\opentelemetry-extension-trace-propagators-1.6.0.jar;%APP_HOME%\lib\opentelemetry-exporter-otlp-common-1.6.0.jar;%APP_HOME%\lib\opentelemetry-sdk-1.6.0.jar;%APP_HOME%\lib\opentelemetry-sdk-trace-1.6.0.jar;%APP_HOME%\lib\opentelemetry-sdk-metrics-1.6.0-alpha.jar;%APP_HOME%\lib\opentelemetry-sdk-common-1.6.0.jar;%APP_HOME%\lib\opentelemetry-semconv-1.6.0-alpha.jar;%APP_HOME%\lib\opentelemetry-api-metrics-1.6.0-alpha.jar;%APP_HOME%\lib\opentelemetry-api-1.6.0.jar;%APP_HOME%\lib\value-annotations-2.9.0.jar;%APP_HOME%\lib\netty-all-4.1.78.Final.jar;%APP_HOME%\lib\netty-transport-native-epoll-4.1.78.Final.jar;%APP_HOME%\lib\netty-transport-native-epoll-4.1.78.Final-linux-x86_64.jar;%APP_HOME%\lib\netty-transport-native-epoll-4.1.78.Final-linux-aarch_64.jar;%APP_HOME%\lib\netty-transport-native-kqueue-4.1.78.Final.jar;%APP_HOME%\lib\netty-transport-native-kqueue-4.1.78.Final-osx-x86_64.jar;%APP_HOME%\lib\netty-transport-native-kqueue-4.1.78.Final-osx-aarch_64.jar;%APP_HOME%\lib\caffeine-3.1.1.jar;%APP_HOME%\lib\netty-tcnative-boringssl-static-2.0.50.Final.jar;%APP_HOME%\lib\opentelemetry-proto-0.13.0-alpha.jar;%APP_HOME%\lib\simpleclient_pushgateway-0.9.0.jar;%APP_HOME%\lib\simpleclient_httpserver-0.15.0.jar;%APP_HOME%\lib\simpleclient_common-0.9.0.jar;%APP_HOME%\lib\simpleclient_hotspot-0.9.0.jar;%APP_HOME%\lib\simpleclient-0.9.0.jar;%APP_HOME%\lib\rocksdbjni-6.29.5.jar;%APP_HOME%\lib\javax.inject-1.jar;%APP_HOME%\lib\failureaccess-1.0.1.jar;%APP_HOME%\lib\listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar;%APP_HOME%\lib\jsr305-3.0.2.jar;%APP_HOME%\lib\checker-qual-3.22.0.jar;%APP_HOME%\lib\error_prone_annotations-2.14.0.jar;%APP_HOME%\lib\j2objc-annotations-1.3.jar;%APP_HOME%\lib\netty-transport-classes-epoll-4.1.78.Final.jar;%APP_HOME%\lib\netty-transport-classes-kqueue-4.1.78.Final.jar;%APP_HOME%\lib\netty-codec-http2-4.1.78.Final.jar;%APP_HOME%\lib\netty-handler-proxy-4.1.78.Final.jar;%APP_HOME%\lib\netty-codec-http-4.1.78.Final.jar;%APP_HOME%\lib\netty-resolver-dns-native-macos-4.1.78.Final-osx-x86_64.jar;%APP_HOME%\lib\netty-resolver-dns-native-macos-4.1.78.Final-osx-aarch_64.jar;%APP_HOME%\lib\netty-resolver-dns-classes-macos-4.1.78.Final.jar;%APP_HOME%\lib\netty-resolver-dns-4.1.78.Final.jar;%APP_HOME%\lib\netty-handler-4.1.78.Final.jar;%APP_HOME%\lib\netty-transport-native-unix-common-4.1.78.Final.jar;%APP_HOME%\lib\netty-codec-dns-4.1.78.Final.jar;%APP_HOME%\lib\netty-codec-socks-4.1.78.Final.jar;%APP_HOME%\lib\netty-codec-4.1.78.Final.jar;%APP_HOME%\lib\netty-transport-4.1.78.Final.jar;%APP_HOME%\lib\netty-buffer-4.1.78.Final.jar;%APP_HOME%\lib\netty-resolver-4.1.78.Final.jar;%APP_HOME%\lib\netty-common-4.1.78.Final.jar;%APP_HOME%\lib\logging-interceptor-4.9.2.jar;%APP_HOME%\lib\okhttp-4.10.0.jar;%APP_HOME%\lib\kotlinx-coroutines-jdk8-1.5.2.jar;%APP_HOME%\lib\kotlinx-coroutines-core-jvm-1.5.2.jar;%APP_HOME%\lib\okio-jvm-3.0.0.jar;%APP_HOME%\lib\kotlin-stdlib-jdk8-1.6.10.jar;%APP_HOME%\lib\kotlin-stdlib-jdk7-1.6.10.jar;%APP_HOME%\lib\kotlin-stdlib-1.7.0.jar;%APP_HOME%\lib\org.jupnp-2.6.1.jar;%APP_HOME%\lib\org.jupnp.support-2.6.1.jar;%APP_HOME%\lib\reactor-core-3.4.14.jar;%APP_HOME%\lib\rxjava-2.2.21.jar;%APP_HOME%\lib\reactive-streams-1.0.3.jar;%APP_HOME%\lib\antlr4-4.9.3.jar;%APP_HOME%\lib\antlr4-runtime-4.9.3.jar;%APP_HOME%\lib\framework-1.3.2.jar;%APP_HOME%\lib\framework-internal-1.3.2.jar;%APP_HOME%\lib\gson-fire-1.8.5.jar;%APP_HOME%\lib\gson-2.9.0.jar;%APP_HOME%\lib\opentelemetry-context-1.6.0.jar;%APP_HOME%\lib\commons-net-3.8.0.jar;%APP_HOME%\lib\perfmark-api-0.25.0.jar;%APP_HOME%\lib\annotations-4.1.1.4.jar;%APP_HOME%\lib\animal-sniffer-annotations-1.19.jar;%APP_HOME%\lib\client-java-proto-15.0.1.jar;%APP_HOME%\lib\protobuf-java-3.19.4.jar;%APP_HOME%\lib\javax.annotation-api-1.3.2.jar;%APP_HOME%\lib\netty-tcnative-classes-2.0.50.Final.jar;%APP_HOME%\lib\netty-codec-haproxy-4.1.78.Final.jar;%APP_HOME%\lib\netty-codec-memcache-4.1.78.Final.jar;%APP_HOME%\lib\netty-codec-mqtt-4.1.78.Final.jar;%APP_HOME%\lib\netty-codec-redis-4.1.78.Final.jar;%APP_HOME%\lib\netty-codec-smtp-4.1.78.Final.jar;%APP_HOME%\lib\netty-codec-stomp-4.1.78.Final.jar;%APP_HOME%\lib\netty-codec-xml-4.1.78.Final.jar;%APP_HOME%\lib\netty-transport-rxtx-4.1.78.Final.jar;%APP_HOME%\lib\netty-transport-sctp-4.1.78.Final.jar;%APP_HOME%\lib\netty-transport-udt-4.1.78.Final.jar;%APP_HOME%\lib\jaxb-api-2.3.0.jar;%APP_HOME%\lib\jnr-unixsocket-0.38.17.jar;%APP_HOME%\lib\jnr-enxio-0.32.13.jar;%APP_HOME%\lib\jnr-posix-3.1.15.jar;%APP_HOME%\lib\jnr-ffi-2.2.11.jar;%APP_HOME%\lib\commons-codec-1.15.jar;%APP_HOME%\lib\kotlin-stdlib-common-1.7.0.jar;%APP_HOME%\lib\annotations-13.0.jar;%APP_HOME%\lib\snakeyaml-1.32.jar;%APP_HOME%\lib\commons-compress-1.21.jar;%APP_HOME%\lib\commons-io-2.11.0.jar;%APP_HOME%\lib\bcprov-ext-jdk15on-1.70.jar;%APP_HOME%\lib\commons-collections4-4.4.jar;%APP_HOME%\lib\ST4-4.3.1.jar;%APP_HOME%\lib\antlr-runtime-3.5.2.jar;%APP_HOME%\lib\org.abego.treelayout.core-1.0.3.jar;%APP_HOME%\lib\javax.json-1.0.4.jar;%APP_HOME%\lib\icu4j-69.1.jar;%APP_HOME%\lib\jline-2.14.6.jar;%APP_HOME%\lib\grpc-context-1.47.0.jar;%APP_HOME%\lib\proto-google-common-protos-1.17.0.jar;%APP_HOME%\lib\jffi-1.3.9.jar;%APP_HOME%\lib\jffi-1.3.9-native.jar;%APP_HOME%\lib\asm-commons-9.2.jar;%APP_HOME%\lib\asm-util-9.2.jar;%APP_HOME%\lib\asm-analysis-9.2.jar;%APP_HOME%\lib\asm-tree-9.2.jar;%APP_HOME%\lib\asm-9.2.jar;%APP_HOME%\lib\jnr-a64asm-1.0.0.jar;%APP_HOME%\lib\jnr-x86asm-1.0.2.jar;%APP_HOME%\lib\javax.persistence-api-2.2.jar;%APP_HOME%\lib\tuples-4.9.4.jar;%APP_HOME%\lib\swagger-annotations-1.6.5.jar;%APP_HOME%\lib\jnr-constants-0.10.3.jar


@rem Execute evm
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %EVM_OPTS%  -classpath "%CLASSPATH%" org.hyperledger.besu.evmtool.EvmTool %*

:end
@rem End local scope for the variables with windows NT shell
if %ERRORLEVEL% equ 0 goto mainEnd

:fail
rem Set variable EVM_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
set EXIT_CODE=%ERRORLEVEL%
if %EXIT_CODE% equ 0 set EXIT_CODE=1
if not ""=="%EVM_EXIT_CONSOLE%" exit %EXIT_CODE%
exit /b %EXIT_CODE%

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
