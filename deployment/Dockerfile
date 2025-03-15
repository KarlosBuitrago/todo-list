FROM amazoncorretto:17-alpine
VOLUME /tmp
EXPOSE 8080
COPY build/libs/*.jar TodoListCarlos.jar  # Cambia *.jar por build/libs/*.jar
ENV JAVA_OPTS=" -Xshareclasses:name=cacheapp,cacheDir=/cache,nonfatal -XX:+UseContainerSupport -XX:MaxRAMPercentage=70 -Djava.security.egd=file:/dev/./urandom"
#RUN useradd -m appuser
USER appuser
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar TodoListCarlos.jar" ]
