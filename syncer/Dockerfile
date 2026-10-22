FROM alpine:3.20

RUN apk add --no-cache ca-certificates curl \
    && curl -fSL \
       "https://github.com/minio/mc/releases/download/RELEASE.2025-08-13T08-35-41Z/mc.linux-amd64.RELEASE.2025-08-13T08-35-41Z" \
       -o /usr/local/bin/mc \
    && chmod +x /usr/local/bin/mc \
    && mc --version

WORKDIR /app

CMD ["/bin/sh", "-c", "sleep infinity"]