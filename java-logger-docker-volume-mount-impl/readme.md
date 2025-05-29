# run using simple docker commands

```
docker build -t spring-logging-mount-impl .
docker run -d -p 8081:8084 -v <<local-path>>:/app/logs spring-logging-mount-impl
```

# run using docker compose

```
docker-compose up --build -d
docker-compose down
```
