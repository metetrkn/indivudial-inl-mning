#!/bin/bash

echo "Starting Spring Boot app..."
cd /home/ec2-user/app
nohup java -jar shop-0.0.1-SNAPSHOT.jar > app.log 2>&1 &
