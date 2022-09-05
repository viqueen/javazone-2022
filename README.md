# javazone-2022: Will it run ? ... should it even compile ?

## getting started using docker

- clone them repos

```bash
git clone git@github.com:openjdk/jdk.git ~/workshop-sources/jdk
git clone git@github.com:viqueen/javazone-2022.git ~/workshop-sources/javazone-2022

ln -sfnv ~/workshop-sources /tmp/workshop-sources
```

- compose them up

```bash
cd ~/workshop-sources/javazone-2022
docker compose up -d
```

- open terminal session

```bash
docker exec -it javazone-2022-workshop-1 bash
```

<details>
<summary>Task 1: compile the compiler and link it</summary>
<p>

in the container terminal session

- build it
```bash
cd /tmp/workshop-sources/jdk
bash configure
bash bin/idea.sh # if you are planning to use IntelliJ IDEA

make jdk
```

- link it
```bash
jenv add build/linux-x86_64-server-release/jdk
```

- test it on our maven project 
```bash
cd /tmp/workshop-sources/javazone-2022
mvn compile -P lint-all # should fail build with redundant cast error
mvn compile -P lint-everything # should fail build with error: invalid flag: -Xlint:everything

mvn compile exec:java # see runtime errors in action
```

</p>
</details>

