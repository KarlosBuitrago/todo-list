FROM amazoncorretto:17-alpine
VOLUME /tmp
EXPOSE 8080
COPY /build/libs/*.jar TodoListCarlos.jar
RUN java -Xshare:dump -jar TodoListCarlos.jar -XX:SharedArchiveFile=/cache/appcds.jsa
ENV JAVA_OPTS=" -XX:+UseContainerSupport -XX:MaxRAMPercentage=70 -Djava.security.egd=file:/dev/./urandom -XX:SharedArchiveFile=/cache/appcds.jsa"
RUN adduser -D appuser
USER appuser
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar TodoListCarlos.jar" ]
