docker-compose down

#build image
docker build -t teste-cliente-login:latest

#start environment
docker-compose up --build --force-recreate --remove-orphans
