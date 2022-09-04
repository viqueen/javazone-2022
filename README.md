# javazone-2022: Will it run ? ... should it even compile ?

## getting started using docker

- clone them repos

```bash
git clone git@github.com:openjdk/jdk.git ~/workshop-sources/jdk
git clone git@github.com:viqueen/javazone-2022.git ~/workshop-sources/javazone-2022
```

- compose them up

```bash
cd ~/workshop-sources/javazone-2022
docker compose up
```

## with-maven

```bash
git clone git@github.com:viqueen/javazone-2022.git
cd javazone-2022/with-maven
```

- compile it

```bash
mvn compile -P lint-all
mvn compile
```

- run it

```bash
mvn compile exec:java
```
