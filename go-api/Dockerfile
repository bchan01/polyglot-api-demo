FROM golang:1.8.3 as builder
WORKDIR /go/src/github.com/bchan01/go-api
RUN go get -d -v github.com/gorilla/mux
COPY main.go .
RUN CGO_ENABLED=0 GOOS=linux go build -a -installsuffix cgo -o main .

FROM alpine:latest
RUN apk --no-cache add ca-certificates
WORKDIR /root/
COPY --from=builder /go/src/github.com/bchan01/go-api/main .
CMD ["./main"]
