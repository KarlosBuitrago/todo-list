FROM amazoncorretto:17-alpine
VOLUME /tmp
EXPOSE 8080
COPY *.jar TodoListCarlos.jar
ENV JAVA_OPTS=" -Xshareclasses:name=cacheapp,cacheDir=/cache,nonfatal -XX:+UseContainerSupport -XX:MaxRAMPercentage=70 -Djava.security.egd=file:/dev/./urandom"
# Replace with a non-root user to avoid running the container with excessive privileges
#RUN useradd -m appuser
#USER appuser
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS  -jar TodoListCarlos.jar" ]

