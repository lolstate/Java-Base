compose:
	docker compose -f docker-compose.yml up -d

build-image:
	docker build . -t user-service-java
