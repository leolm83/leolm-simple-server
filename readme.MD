# RUNNING THE APP
if you want add the --build flag to rebuild the image when necessary
run the following command:
```
docker-compose up -d
```

# ENV VARS
this project uses and needs the variables defined in the example.env to run


# FAQ
this project only works with docker compose(and not with the legacy docker-compose cli tool)
# nginx_config_test
this file (docker/nginx_config_test.sh) just send many requests as possible to test if the nginx is loadbalancing properly