# javazone-2022

## Will it run ? ... should it even compile ?

### getting started using docker

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

### tasks

<details>
<summary>Task 1: compile the compiler and link it</summary>
<p>

in the container terminal session

- build it
```bash
cd /tmp/workshop-sources/jdk
bash configure
# if you are using IntelliJ IDEA
bash bin/idea.sh 
# if you are using VSCode
make vscode-project

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

<details>
<summary>Task 3: lint everything</summary>
<p>

- add a new lint option "everything" that operates the same as "all"

</p>
</details>

<details>
<summary>Task 3: lint bad cast - part one</summary>
<p>

- add a new lint option "bad-cast" that always emits a warning when enabled

</p>
</details>

<details>
<summary>Task 4: lint bad cast - part two</summary>
<p>

- update "bad-cast" to inspect cast chain for incompatibilities

</p>
</details>
