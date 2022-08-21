# javazone-2022: Will it run ? ... should it even compile ?

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
