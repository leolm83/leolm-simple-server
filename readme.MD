# DOCKERFILE PATH

## BUILDING
```
command considering your working dir its simple-server(project root)
docker build . -t leolm-simple-server:v1 -f ./docker/Dockerfile
```
### RUNNING 
```
docker container run -p 8080:8080 leolm-simple-server:v1
```

# DOCKER COMPOSE PATH
build the image and then run the following command:
```
docker-compose up -d
```

# ENV VARS
this project uses and needs the variables defined in the example.env do run
