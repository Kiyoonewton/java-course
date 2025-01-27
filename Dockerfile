FROM openjdk:17-slim

WORKDIR /app

# Keep container running
CMD tail -f /dev/null