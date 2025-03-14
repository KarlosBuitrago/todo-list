FROM amazoncorretto:17-alpine
VOLUME /tmp
COPY target/TodoListCarlos.jar /app/TodoListCarlos.jar
ENV JAVA_OPTS=" -Xshareclasses:name=cacheapp,cacheDir=/cache,nonfatal -XX:+UseContainerSupport -XX:MaxRAMPercentage=70 -Djava.security.egd=file:/dev/./urandom"
# Replace with a non-root user to avoid running the container with excessive privileges
RUN useradd -m appuser
USER appuser
ENTRYPOINT ["java", "-jar", "/app/TodoListCarlos.jar"]
