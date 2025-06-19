#!/bin/sh

# 复制项目的文件到对应docker路径，便于一键生成镜像。
usage() {
	echo "Usage: sh copy.sh"
	exit 1
}


# copy sql
echo "begin copy sql "
cp ../sql/ry_20250523.sql ./mysql/db
cp ../sql/ry_config_20250224.sql ./mysql/db

# copy html
echo "begin copy html "
cp -r ../bedrock-ui/dist/** ./nginx/html/dist


# copy jar
echo "begin copy bedrock-gateway "
cp ../bedrock-gateway/target/bedrock-gateway.jar ./Bedrock/gateway/jar

echo "begin copy bedrock-auth "
cp ../bedrock-auth/target/bedrock-auth.jar ./Bedrock/auth/jar

echo "begin copy bedrock-visual "
cp ../bedrock-visual/bedrock-monitor/target/bedrock-visual-monitor.jar  ./Bedrock/visual/monitor/jar

echo "begin copy bedrock-modules-system "
cp ../bedrock-modules/bedrock-system/target/bedrock-modules-system.jar ./Bedrock/modules/system/jar

echo "begin copy bedrock-modules-file "
cp ../bedrock-modules/bedrock-file/target/bedrock-modules-file.jar ./Bedrock/modules/file/jar

echo "begin copy bedrock-modules-job "
cp ../bedrock-modules/bedrock-job/target/bedrock-modules-job.jar ./Bedrock/modules/job/jar

echo "begin copy bedrock-modules-gen "
cp ../bedrock-modules/bedrock-gen/target/bedrock-modules-gen.jar ./Bedrock/modules/gen/jar

