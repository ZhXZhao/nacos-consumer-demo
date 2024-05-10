# nacos-consumer-demo

## RUN
mvn clean package -Dmaven.test.skip=true
## Test
curl -v http://localhost:9088/echo-consumer
## Docker
docker build -t nacos-consumer-demo:v1 .

docker run -d -e "NACOS_SERVER=${NACOS_SERVER}" -p 9088:9088 nacos-consumer-demo:v1