gen-proto-go:
	protoc --proto_path proto --go_out "generated/go/" --go-grpc_out "generated/go/" --go_opt=paths=source_relative proto/**/*.proto
