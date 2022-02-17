### project example
+ this is a basic project to practice kafka as a message broker. we make a simple request with openfeign to Clash Of Clans and then we send a message to the queue, so one listener can save the message and send it via mailgun.
+ 
![repo-imgs/clashschema.png](repo-imgs/clashschema.png)
 
## run project
+ run  the following command to start containers
```
docker compose up -d
```
+ dont forget to change your env variables in both ymls
+ create clashDb in pgAdmin with 'postgress' container as host
+ run main application.

## wip...
